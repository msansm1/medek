package bzh.msansm1.medek.persistence.model;

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
	private String email;

	public User() {
		super();
	}

	public User(Integer id, String login, String password, String email) {
		super();
		this.id = id;
		this.login = login;
		this.password = password;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
