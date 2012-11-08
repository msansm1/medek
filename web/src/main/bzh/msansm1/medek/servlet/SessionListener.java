package bzh.msansm1.medek.servlet;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Session listener servlet.
 * Usefull for calling methods at init or close of a session.
 * 
 * @author rbarbot
 *
 */
public class SessionListener implements HttpSessionListener {

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		// Here you can set things to be done when the session is created
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		// Here you can set things to be done when the session is destroyed
	}

}
