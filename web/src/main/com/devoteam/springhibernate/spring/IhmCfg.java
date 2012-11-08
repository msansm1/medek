package com.devoteam.springhibernate.spring;

import java.util.Map;

public final class IhmCfg {
	
	private String separator;
	private String nameColumn;
	
	private Map<Integer,String> errors;
	
	private static IhmCfg instance;
	private IhmCfg(){}
	
	public static IhmCfg getInstance(){
		if(instance == null){
			instance = new IhmCfg();
		}
		return instance;		
	}

	public void setSeparator(String separator) {
		this.separator = separator;
	}

	public String getSeparator() {
		return separator;
	}

	public void setNameColumn(String nameColumn) {
		this.nameColumn = nameColumn;
	}

	public String getNameColumn() {
		return nameColumn;
	}

	public void setErrors(Map<Integer,String> errors) {
		this.errors = errors;
	}

	public Map<Integer,String> getErrors() {
		return errors;
	}

}
