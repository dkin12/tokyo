package ch1;

public class MethodEx1 {

	
	// 돌려주는 값이 없는 경우. 기본 
	public static void sayname() {
		System.out.println("Hello, java!");
	}
	
	// 매개변수가 있는 메서드
	public static void getName(String name) {
		System.out.println("안녕, " + name);
	}
	// 매개변수를 받아 값을 반환
	public static int multi(int num1, int num2) {
		return num1 * num2;
	}
	
	public static void printSum(int num1, int num2) {
		System.out.println(num1+num2);
	}
	public static double getSum(double num1, double num2) {
		return num1+num2;
	}
	
	public static boolean isAdult(int age) {
		return age > 18;
	}
	
	// 메서드 오버로딩
	// 같은 이름의 메서드를 여러 버전으로 만드는 것
	// 같은 이름으로 매개변수만 다르게 여러 메서드를 정의하는 것
	public static int cal(int a, int b, int c) {
		return a + b + c;
	}
	public static double cal(double a, double b) {
		return a * b;
	}
	
	
	// 메서드 호출 ( main 메서드 )
	public static void main(String[] args) {
		// 실행만 함
		sayname();
		// 매개변수 이름을 받음
		getName("한라봉");
		getName("진지향");
		getName("윈터프린스");
		
		System.out.println(multi(34,34));
		
		
	}
}
