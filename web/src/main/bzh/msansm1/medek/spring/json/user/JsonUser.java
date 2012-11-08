package bzh.msansm1.medek.spring.json.user;

import bzh.msansm1.medek.spring.json.JsonResponse;

public class JsonUser extends JsonResponse {
	private Integer id;
	private String name;
	private String firstname;
	private String mail;
	private String login;
	
	public JsonUser() {
		super();
	}
	
	public JsonUser(Integer id, String name, String firstname, String mail,
			String login) {
		super();
		this.id = id;
		this.name = name;
		this.firstname = firstname;
		this.mail = mail;
		this.login = login;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}
	
}
