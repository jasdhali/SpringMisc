package spring.expressionlanguage;

public class EmailUtilities {

	public String email;
	public String password;
	public String host;

	public EmailUtilities() {
		// TODO Auto-generated constructor stub
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	@Override
	public String toString() {
		return "EmailUtilities [email=" + email + ", password=" + password
				+ ", host=" + host + "]";
	}
}
