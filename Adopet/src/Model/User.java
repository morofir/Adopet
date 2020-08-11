package Model;

public class User extends Guest{
	private String email;
	private String password;
	private String organization;
	
	public User(String userName, String userEmail, String userPassword, String userOrganization) 
	{
		name = userName;
		email = userEmail;
		password = userPassword;
		organization = userOrganization;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
