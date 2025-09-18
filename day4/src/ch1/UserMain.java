package ch1;

public class UserMain {

	public static void main(String[] args) {
		// 매개 변수가 안들어있는 생성자 
		// 기본 생성자가 없어서 에러 발생 
		// User user = new User();
		
		// 매개변수가 있는 생성자 : 필요 정보가 빠진 객체가 생기는 걸 방지하기 윟
		User user = new User("한라봉","abc","1234");
		System.out.println(user.getId());
		System.out.println(user.getName());
		System.out.println(user.getPassword());
		
		// 상품의 이름, 가격, 수량 출력
		user.setPtName("라봉");
		user.setPtPrice("3000원");
		user.setPtCount("2");
		
		System.out.println(user);
	}

}
