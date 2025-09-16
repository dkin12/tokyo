package ch1;

public class BreadMain {

	public static void main(String[] args) {
		// 좋아하는 빵의 객체를 생성자의 매개변수 갯수를 달리하여 두개 만들고
		Bread bd = new Bread("단팥빵",30,1000,1);
		
		Bread bd2 = new Bread();
		bd2.setName("크로와상");
		bd2.setGram(90);
		bd2.setPrice(4500);
		bd2.setCnt(2);
		
		
		
		// 해당 제품명과 금액 출력
		System.out.println(bd.getName()+" 총 금액 "+bd.breadTotal());
		System.out.println(bd2.getName() + " 총 금액 " + bd2.breadTotal());
		System.out.println(bd.toString());
		System.out.println(bd2);
	}

}
