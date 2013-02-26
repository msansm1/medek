package bzh.msansm1.medek.spring.ping;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import bzh.msansm1.medek.persistence.model.users.User;
import bzh.msansm1.medek.spring.MyController;
import bzh.msansm1.medek.spring.json.JsonResponse;
import bzh.msansm1.medek.spring.json.user.JsonUser;

/**
 * Controller class for "ping" function.
 * 
 * @author rbarbot
 *
 */
@Controller
public class PingController extends MyController {

	private static Logger logger = Logger.getLogger(PingController.class);
	
	public PingController(){
		if(logger.isDebugEnabled()){
			logger.debug("PingController constructor...");
		}		
	}
		
	@RequestMapping( value="/srv/ping/ping" )
	public @ResponseBody JsonResponse ping(HttpSession session, 
	ServletRequest request ) { 
		if(logger.isDebugEnabled()){
			logger.debug(">>> PingController ping...");
		}			
		return new JsonPingResponse(session,
				request.getParameter("init"));
	}
	
	
	/**
	 * Internal class for JSON response
	 * 
	 * A JSON response must have an attribute or the response will
	 * be incorrect and the server will respond with an HTTP 406.
	 * 
	 * @author rbarbot
	 *
	 */
	public class JsonPingResponse extends JsonResponse {
		
		private JsonUser user = null;

		public JsonPingResponse(HttpSession session, String init) {
			super();
			if (init != null && session.getAttribute("userlogged") != null) {
				User u = (User) session.getAttribute("userlogged");
				user = new JsonUser(u.getId(), "","", 
						u.getEmail(), u.getLogin());
			}
		}

		public JsonUser getUser() {
			return user;
		}

		public void setUser(JsonUser user) {
			this.user = user;
		}
	}
}
