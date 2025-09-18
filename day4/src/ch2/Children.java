package ch2;


/*
 * 자식 클래스
 * class 클래스 명 extends 부모 클래스 ( 수퍼클래스 ) 명 {} 
 * 
 * */

// 자식 클래스

public class Children extends Parents {
	// 필드
	double filed3;
	
	// 생성자
	Children() {
		
	}

	public Children(int fiedl1, String field2, double filed3) {
		//super();
		this.field1 = fiedl1;
		this.field2 = field2;
		this.filed3 = filed3;
	}
	
	// 메서드 
	@Override
	public void method2() {
		System.out.println("자식 메서드1");
	}
	public void method3() {
		System.out.println("자식 메서드2");
	}
	
}
