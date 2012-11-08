package com.devoteam.springhibernate.persistence.model;

/**
 * Hibernate Mapping class of User table.
 * 
 * @author rbarbot
 *
 */
public class User {
	private Integer id;
	private String login;
	private String password;
	private String firstName;
	private String lastName;
	private String email;

	public User() {
		super();
	}

	public User(Integer id, String login, String password, String firstName,
			String lastName, String email) {
		super();
		this.id = id;
		this.login = login;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
