package ch2;

public class Customer extends User {
	int num;
	public Customer(String name, String email, String pw) {
		super(name, email, pw);
		this.num = num;
	}
	
	public void buy() {
		System.out.println("상품 구매");
	}
	
	

}
