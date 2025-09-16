package ch1;

public class DogMain {

	public static void main(String[] args) {
		// Dog 클래스 ( 설계도 ) 로 실제 강아지 ( 객체 ) 만들기
		
		Dog dog1 = new Dog("흰둥이",3,"믹스",null,3,false);
		Dog dog2 = new Dog("솜이",6,"사모예드",null,20,true);
		
		dog1.eat();
		dog2.poopoo();
	}

}
