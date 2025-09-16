package ch1;

public class TestMain {

	public static void main(String[] args) {
		// 객체 ( 인스턴스 ) 생성
		// 클래스명 객체명 = new 생성자 함수 ();
		
		TestData ts1 = new TestData();
		System.out.println("ts1 : "+ ts1);
		System.out.println("ts1 : "+ ts1.field1);
		
		ts1.field1 = 100;
		System.out.println("ts1 : " + ts1.field1);
		ts1.field1 = 200;
		System.out.println("ts1 : " + ts1.field1);
		
		// ts1.field2 = 300; private 변수는 외부에서 접근 불가
		System.out.println("=====ts2=====");
		TestData ts2 = new TestData();
		System.out.println("ts2 : " + ts2);
		System.out.println("ts2 : "+ ts2.getField2());
		// private는 외부에서 접근 불가능 하기 때문에 
		// 클래스 내부의 getter, setter를 통해 접근해야함
		ts2.setField2(1.2f);
		System.out.println("ts2 : "+ ts2.getField2());
	}

}
