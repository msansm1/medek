package bzh.msansm1.medek.spring.user;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import bzh.msansm1.medek.model.Error;
import bzh.msansm1.medek.persistence.DAOProxy;
import bzh.msansm1.medek.persistence.model.User;
import bzh.msansm1.medek.spring.MyController;
import bzh.msansm1.medek.spring.json.JsonResponse;
import bzh.msansm1.medek.spring.json.user.JsonUser;
import bzh.msansm1.medek.spring.json.user.JsonUserList;
import bzh.msansm1.medek.utils.Constants;
import bzh.msansm1.medek.utils.FilterUtil;
import bzh.msansm1.medek.utils.UserUtils;

/**
 * Controller class for user API.
 * 
 * @author rbarbot
 *
 */
@Controller
public class UserController extends MyController {

	private static Logger logger = Logger.getLogger(UserController.class);

	@Resource
	private DAOProxy daoProxy; 
	
	@RequestMapping( value="/srv/user/create" )	
	public @ResponseBody JsonResponse newuser(Model model, HttpSession session , HttpServletRequest request,
			@RequestParam("login") String login, @RequestParam("firstname") String firstname,
			@RequestParam("lastname") String lastname, @RequestParam("email") String email) {
		User user = new User();
		user.setLogin(login);
		user.setEmail(email);
		String pass = UserUtils.generatePassword();
		user.setPassword(UserUtils.codingPassword(pass));
		daoProxy.createUser(user);
		logger.info("=> CREATE User : "+login +" -- password : "+pass);
		return new JsonUser(user.getId(), "", "", 
				user.getEmail(), user.getLogin());
	}

	@RequestMapping( value="/srv/user/login" )	
	public @ResponseBody JsonResponse loginuser(Model model, HttpSession session , HttpServletRequest request,
			@RequestParam("login") String login, @RequestParam("pwd") String password) throws Error {
		User user = daoProxy.getUserByLogin(login);
		logger.info("=> Login User : "+login +" -- ?? "+user);
		if (user != null) {
			logger.info("=> pass01  -- "+UserUtils.codingPassword(password));
			logger.info("=> pass02  -- "+user.getPassword());
			if (!user.getPassword().equals(UserUtils.codingPassword(password))) {
				return handleError(new Error(101));
			}
		}
		else {
			return handleError(new Error(101));
		}
		session.setAttribute(Constants.SESSION_USER, user); // saving user logged in session
		return new JsonUser(user.getId(), "", "", 
				user.getEmail(), user.getLogin());
	}
	
	@RequestMapping( value="/srv/user/get" )	
	public @ResponseBody JsonResponse getuser(Model model, HttpSession session , HttpServletRequest request,
			@RequestParam("id") Integer id) {
		User user = daoProxy.getUserById(id);
		logger.info("=> GET User : "+id);
		return new JsonUser(user.getId(), "", "", 
				user.getEmail(), user.getLogin());
	}
	
	@RequestMapping( value="/srv/user/update" )	
	public @ResponseBody JsonResponse updateuser(Model model, HttpSession session , HttpServletRequest request,
			@RequestParam("id") Integer id) {
		User user = daoProxy.getUserById(id);
		user.setLogin(request.getParameter("login"));
		user.setEmail(request.getParameter("mail"));
		String pass = UserUtils.generatePassword();
		user.setPassword(UserUtils.codingPassword(pass));
		daoProxy.updateUser(user);
		logger.info("=> UPDATE User : "+id);
		return new JsonUser(user.getId(), "", "", 
				user.getEmail(), user.getLogin());
	}
	
	@RequestMapping( value="/srv/user/findall" )	
	public @ResponseBody JsonResponse userfindall(HttpSession session , HttpServletRequest request,
			@RequestParam("_search") String search, @RequestParam("nd") String nd,
			@RequestParam("page") Integer page, @RequestParam("rows") Integer rows,
			@RequestParam("sidx") String sidx, @RequestParam("sord") String sord) {
		if (session.getAttribute(Constants.SESSION_USER) == null) {
			return handleError(new Error(110));
		}
		String filter = "";
		if (request.getParameter("filters") != null) {
			filter = FilterUtil.getSQLFromFilter(request.getParameter("filters"), "u");
			if (request.getParameter("filters").contains("name")) {
				String right = request.getParameter("filters").substring(request.getParameter("filters").indexOf("name"));
				right = right.substring(right.indexOf("data")+7);
				right = right.substring(0, right.indexOf('"'));
				if (filter.isEmpty()) {
					filter = " WHERE ";
				} else {
					filter += " AND ";
				}
				filter += "u.lastName LIKE '%"+right+"%'"; 
			}
			if (request.getParameter("filters").contains("mail")) {
				String right = request.getParameter("filters").substring(request.getParameter("filters").indexOf("mail"));
				right = right.substring(right.indexOf("data")+7);
				right = right.substring(0, right.indexOf('"'));
				if (filter.isEmpty()) {
					filter = " WHERE ";
				} else {
					filter += " AND ";
				}
				filter += "u.email LIKE '%"+right+"%'"; 
			}
		}
		List<User> users = daoProxy.getAllUsers(filter, sidx, sord);
		List<JsonUser> infos = new ArrayList<JsonUser>();
		for (int i=(page-1)*rows, max=page*rows; i<max; i++) {
			if (i>=users.size()) {
				break;
			}
			infos.add(new JsonUser(users.get(i).getId(), "",
					"", users.get(i).getEmail(), users.get(i).getLogin()));
		}
		int nbpg = (users.size()%rows !=0)?((int)Math.floor(users.size() / rows) + 1):(users.size() / rows);
		if (nbpg == 0) {
			nbpg = 1;
		}
		return new JsonUserList(nbpg, page, users.size(), infos);
	}

	@RequestMapping( value="/user/chpwd" )	
	public String userchangepwd(HttpSession session , 
			HttpServletRequest request, @RequestParam("login") String login) throws Error {
		User user = daoProxy.getUserByLogin(login);
		if (user != null) {
			String pass = UserUtils.generatePassword();
			user.setPassword(UserUtils.codingPassword(pass));
		}
		else {
			throw new Error(101);
		}
		return "";
	}
}
