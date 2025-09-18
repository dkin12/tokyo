package ch2;
/*
 * 싱글톤 패턴 
 * 클래스에서 오직 한 개의 객체만 만들 수 있게 하는 디자인 패턴
 * 
 * 생성자는 private, 객체는 static 변수에 저장
 * .getInstance() 로 호출 
 * 주로 DB연결, 로그 등 설정 관리에서 사용 
 */
public class Singleton {
	
	// 자기 자신의 객체를 static 으로 미리 생성 
	
	private static Singleton instance = new Singleton();
	
	// 생성자를 private으로 막아서 외부에서 인스턴스를 만들 수 없도록 함 
	private Singleton() {
		
	}
	
	int num;
	
	// 객체를 가져올 수 있는 static 매서드 
	public static Singleton getInstance() {
		return instance;
	}


}
