package bzh.msansm1.medek.test;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import bzh.msansm1.medek.model.Error;
import bzh.msansm1.medek.persistence.dao.user.proxy.UserProxy;
import bzh.msansm1.medek.spring.user.UserController;

/**
 * Controller for tester JSP.
 * 
 * @author rbarbot
 *
 */
@Controller
public class TestController {
		
	private static Logger logger = Logger.getLogger(TestController.class);
	
	@Resource
	private UserProxy userProxy;
	
	private final String TESTPAGE = "/tester.jsp";
		
	public TestController(){
		if(logger.isDebugEnabled()){
			logger.debug("TestController constructor...");
		}	
	}
	

	@RequestMapping( value="/tester/ping" )	
	public String ping(Model model, HttpSession session , HttpServletRequest request) {
		model.addAttribute("pong","PONG");
		return TESTPAGE;
	}

	@RequestMapping( value="/tester/user/new" )	
	public String newuser(Model model, HttpSession session , HttpServletRequest request,
			@RequestParam("login") String login, @RequestParam("firstname") String firstname,
			@RequestParam("lastname") String lastname, @RequestParam("email") String email) {
		UserController uc = new UserController();
		uc.newuser(model, session, request, login, firstname, lastname, email);
		return TESTPAGE;
	}

	@RequestMapping( value="/tester/user/login" )	
	public String loginuser(Model model, HttpSession session , HttpServletRequest request,
			@RequestParam("login") String login, @RequestParam("password") String password) {
		UserController uc = new UserController();
		try {
			uc.loginuser(model, session, request, login, password);
			model.addAttribute("reslogin","Authentication successfull");
		}
		catch (Error e) {
			model.addAttribute("reslogin","Authentication FAILED");
		}
		return TESTPAGE;
	}

	@RequestMapping( value="/tester/user/chpwd" )	
	public String userchangepwd(Model model, HttpSession session , 
			HttpServletRequest request, @RequestParam("login") String login) {
		UserController uc = new UserController();
		try {
			uc.userchangepwd(session, request, login);
			model.addAttribute("newpassword","Password changed");
		}
		catch (Error e) {
			model.addAttribute("newpassword","Failed - unexisting user");
		}
		return TESTPAGE;
	}
}