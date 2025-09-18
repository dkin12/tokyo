package ch2;

public class ProductMain {

	public static void main(String[] args) {
		Product product = new Product("상품",0);
		
		Book book = new Book("자바의 정석", 3000,"자바");
		Food food = new Food("한라봉",2000);
		
		product.showInfo();
		System.out.println();
		food.showFood();
		
	}

}
