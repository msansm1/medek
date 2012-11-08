package com.devoteam.springhibernate.model;

import org.apache.log4j.Logger;

/**
 * Model class for software errors (can be throw to GUI)
 * Ex of error thrown : login error
 * 
 * @author rbarbot
 *
 */
public class Error extends Exception {

	private static final long serialVersionUID = 1L;

	private static Logger logger = Logger.getLogger(Error.class);
	
	private int errorId = -1;
	private String[] params = null;
	private String reason = null;
	
	public Error(int errorId ){
		logger.error("throwing new error : "+errorId);
		this.errorId = errorId;
	}

	public Error(int errorId, String arg){
		logger.error("throwing new error : "+errorId);
		this.errorId = errorId;
		this.params = new String[1];
		this.params[0] = arg;
	}
	
	public Error(int errorId, String[] args  ){
		logger.error("throwing new error : "+errorId);
		this.errorId = errorId;
		this.params = args;
	}
	
	public Error(String reason ){
		this.reason = reason;
	}

	public void setErrorId(int errorId) {
		this.errorId = errorId;
	}

	public int getErrorId() {
		return errorId;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getReason() {
		return reason;
	}

	public void setParams(String[] params) {
		this.params = params;
	}

	public String[] getParams() {
		return params;
	}

}
