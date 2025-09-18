package task_250918;

public class Main {
	public static void main(String[] args) {
	// 과제 1 
		Login box = new Login("name@gmail.com","bca1234");
		box.setPw("abc1234");
		System.out.println("내 비밀번호는 " + box.getPw());
	
	// 과제 2 
		TextBook textBook1 = new TextBook();
		textBook1.setTitle("전공서적");
		textBook1.setAuthor("김저자");
		textBook1.setPrice(20000);
		textBook1.setSubject("과학");
		System.out.println(textBook1.getTitle() + " " + textBook1.getAuthor());
		
		Novel no = new Novel();
		no.setGenre("판타지");
		System.out.println(no.getGenre());
		
		// 과제 3
		Car car = new Car();
		car.setSpeed(70);
		car.move();
		System.out.println(car.getSpeed());
		Bicycle bicycle = new Bicycle();
		bicycle.setSpeed(30);
		bicycle.move();
		System.out.println(bicycle.getSpeed());
		
		// 과제 4 
		Person[] personList = new Person[5];
		for(int i = 0; i < personList.length;i++) {
			personList[i] = new Person();
		}
		personList[0].setName("이채연");
		personList[0].setAge(26);
		personList[1].setName("권소령");
		personList[1].setAge(25);
		personList[2].setName("이건우");
		personList[2].setAge(26);
		personList[3].setName("최가희");
		personList[3].setAge(27);
		personList[4].setName("손효정");
		personList[4].setAge(25);
		for(int i = 0; i < personList.length;i++) {
			System.out.println(personList[i].getName());
		}
		// 과제 5
		Product product = new Product();
		product.setName("텀블러");
		product.setPrice(35000);
		System.out.println(product.toString());
		
	}
}
