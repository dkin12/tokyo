package ch2;

public class Main {

	public static void main(String[] args) {
		// 선언
		Parents p1;
		
		// Parents p1; 
		// p1.method1(); -> 선언만 하고 객체 ( 인스턴스 ) 생성은 하지 않았기 때문에
		
		System.out.println("=== Partens ===");
		p1 = new Parents(); // public Parents() 가 있어서 오류나지 않음
		
		p1.method1();
		p1.method2();
		
		System.out.println("=== Children ===");
		
		p1 = new Children();
		p1.method1();
		p1.method2();
		// p1.method3() : Parents 에는 해당 메서드가 없기 때문
		// Parents p1 으로 선언되어있기 때문
		
		Children c1 = new Children();
		c1.method3();

		// 부모 클래스로 부터 유도된 인스턴스로 선언하면 모든 캐스팅이 가능함 
		

	}

}
