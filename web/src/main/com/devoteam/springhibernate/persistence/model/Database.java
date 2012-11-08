package com.devoteam.springhibernate.persistence.model;

/**
 * Hibernate Mapping class of Database table.
 * 
 * @author rbarbot
 *
 */
public class Database {
	private long id;
	private String version;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

}
