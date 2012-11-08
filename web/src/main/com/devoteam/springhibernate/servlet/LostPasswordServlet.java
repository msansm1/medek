package com.devoteam.springhibernate.servlet;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.devoteam.springhibernate.persistence.DAOProxy;
import com.devoteam.springhibernate.persistence.model.User;
import com.devoteam.springhibernate.utils.UserUtils;

/**
 * Servlet for the "lost password" function inside the GUI.
 * 
 * @author rbarbot
 *
 */
public class LostPasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static Logger logger = Logger.getLogger(LostPasswordServlet.class);
	
	@Resource
	private DAOProxy daoProxy; 
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		String login = request.getParameter("name");

		try {
			User user = daoProxy.getUserByLogin(login);
			
			String newpass = UserUtils.generatePassword();
			user.setPassword(UserUtils.codingPassword(newpass));
			
			daoProxy.updateUser(user);
		} catch (Error e) {
			logger.error("Error while reseting password: ", e);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		doGet(request, response);
	}
}
