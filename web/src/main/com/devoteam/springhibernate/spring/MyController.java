package com.devoteam.springhibernate.spring;

import org.apache.log4j.Logger;

import com.devoteam.springhibernate.spring.json.JsonError;
import com.devoteam.springhibernate.model.Error;

/**
 * Abstract class for controllers.
 * Manage handling of application errors.
 * 
 * @author rbarbot
 *
 */
public abstract class MyController {

	private static Logger logger = Logger.getLogger(MyController.class);
	
	public JsonError handleError(Error error){
		
		String msg;
		msg = error.getReason();
		if(msg != null){
			return new JsonError(msg);
		}
		else if(error.getErrorId() != 1){
			msg = IhmCfg.getInstance().getErrors().get(error.getErrorId());
			if(error.getParams() != null){
				msg = String.format(msg,(Object[])error.getParams());
			}
			logger.error("JSON send new error ("+error.getErrorId()+"|"+error.getParams()+") :"+msg);
			return new JsonError(msg);
		}
		return null;
	}
	
	public JsonError handleError(Exception error){		
		return new JsonError(error.getMessage());
	}
}
