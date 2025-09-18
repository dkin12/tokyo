package ch3;

public class GoodsMain {

	public static void main(String[] args) {
		// 추상 클래스는 객체 생성 불가 
		// Goods gds = new Goods();
		
		Goods phone = new Phone("아이폰");
		phone.showBrand();
		
		Goods tv = new Tv("LG");
		tv.turnOff();
		
		// 추상 클래스 = 공통 필드 + 공통 메서드 + 추상 메서드 
		// 다형성 : goods 타입으로 다양한 제품 사용 가능 
		
		
		
	}

}
