package ch1;

/*
 * 클래스 
 * 설계도 . 객체를 만들기 위한 틀
 * 상태 ( 속성 )와 행위 ( 메서드 ) 를 가짐
 * 속성 : Attribute == 필드 field 
 * 객체가 가지는 변수의 성격
 * 특정한 값을 가질 수 있으며, 객체의 속성 값은 객체의 상태를 표현 
 * 매서드 : Method
 * 데이터를 조작
 * 메서드를 호출하여 객체의 상태를 변화하거나 내부 상태 값을 가져올 수 있음 
 * 
 * ======
 * class 클래스명  { 
 *  필드 1
 *  필드 2
 *  
 *  생성자 1
 *  생성자 2
 *  
 *  메서드 1
 *  메서드 2
 * } 
 * */

public class TestData {
	// 맴버 ( 전역 ) 변수 : 클래스 안에서 선언된 변수로 실제 데이터가 저장되는 공간
	int field1; 
	private float field2;
	double field3;
	short field4;
	String field6;
	
	/*
	 * 생성자 Constructor 
	 * 객체를 만들 때 ( new 키워드 ) 자동으로 호출되는 특별 메서드 == 자동 실행
	 * 초기값 설정 때 주로 사용
	 * 객체를 만들자마자 동작하게 할 수 있음
	 * 
	 * 특징 ) 
	 * 클래스 이름과 동일한 이름을 가짐 
	 * 리턴 타입 없음 ( void ) 도 안씀 
	 * 객체를 만들 때만 실행됨 
	 * */
	
	// TestData() {} : 자바는 자동으로 기본 생성자를 만들어 줌 
	// 단 매개변수가 있는 경우 직접 작성해야함 
	// TestData t = new TestData();
	// 오버로딩 : 같은 이름으로 매개변수나 갯수
	TestData() {
		
	}
	
	TestData(int field1){
		// this : 객체 자신을 나타내는 키워드 
		// 객체 자신을 필드를 참조하거나 해당 클래스의 다른 생성자를 호출할 때 사용
		// static 메소드에서는 this 사용할 수 없음 
		this.field1 = field1;
	}
	
	public void method1() {
		System.out.println("메서드1");
	}
	public int method2() {
		return this.field1;
	}
	
	/*
	 * getter 
	 * 클래스 안의 필드 값을 읽어오는 메서드 
	 * get 필드명 () 
	 * 
	 * setter
	 * 클래스 안의 필드 값을 바꿔주는 메서드 
	 * set 필드명 () 
	 * */
	
	public void setField2(float field2) {
		this.field2 = field2;
	}
	public float getField2() {
		return field2;
	}
	
	

	
}
