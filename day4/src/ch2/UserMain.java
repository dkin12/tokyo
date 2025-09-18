package ch2;

public class UserMain {
	public static void main(String[] args) {
		
		// 인스턴스 ( 객체 ) 생성 
		Admin admin = new Admin("재성","test@gmail.com","1234");
		
		Boolean isALogin = admin.Login("test@gmail.com","1234"); // 이름 , 이메일 
		if(isALogin) {
			System.out.println(admin.getName() + "님 로그인되었습니다." + admin.getEmail());
			admin.manager(); // 관리자 입장
		}else {
			System.out.println("로그인에 실패했습니다. ");
		}
	
		
		
		Customer customer = new Customer("손님","customer123@gmail.com","1234");
		
		Boolean isCLogin = customer.Login("customer123@gmail.com","1234"); // 이름 , 이메일 
		if(isCLogin) {
			System.out.println(customer.getName() + "님 로그인되었습니다." + customer.getEmail());
			customer.buy(); // 상품 구매
		}else {
			System.out.println("로그인에 실패했습니다. ");
		}
		
	}

}
