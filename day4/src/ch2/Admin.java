package ch2;

public class Admin extends User {
	
	public Admin(String name, String email, String pw) {
		super(name, email, pw);
	}
	
	
	public void manager() {
		System.out.println("관리자 입장");
	}

}
