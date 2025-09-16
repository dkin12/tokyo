package ch1;

public class Task {

	public static void main(String[] args) {
		// 1. K Pop 
		

		// 2. Pizza 클래스 
		Dog dog1 = new Dog("흰둥이",3,"믹스",null,3,false);
		Pizza pizza = new Pizza("페퍼로니",'L');
		pizza.order();
		Song song = new Song("Dangerous","인피니트");
		song.play();
		InstagramPost insta = new InstagramPost("민지", "오늘 날씨 짱");
		insta.post();
		DeliveryOrder de = new DeliveryOrder("떡볶이","기숙사");
		System.out.println(de.delivery());
		
		
	}
	
	
}



