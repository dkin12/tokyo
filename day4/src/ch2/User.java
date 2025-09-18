package ch2;

public class User {
	private String name; 
	private String email; 
	private String pw;
	

	public User(String name, String email, String pw) {
		super();
		this.name = name;
		this.email = email;
		this.pw = pw;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPw() {
		return pw;
	}


	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public Boolean Login(String email, String pw) {
		Boolean isLogin = false;
		if(email.equals(this.email) && pw.equals(this.pw) ) {
			isLogin = true;
		}
		return isLogin;
	}

}
