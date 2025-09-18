package ch2;

import ch1.Bread;

public class SingletonMain {

	public static void main(String[] args) {
		// new 키워드로 만들 수 없음 -> private 로 되어있기 때문에
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		Bread b1 = new Bread();
		Bread b2 = new Bread();
		
		System.out.println("싱글톤 패턴 ");
	}

}
