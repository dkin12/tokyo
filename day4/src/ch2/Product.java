package ch2;

public class Product {
	
	private String name; 
	private int price;
	
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}


	void showInfo(){
		System.out.println("상품명: " + name + ", 가격 : " + price + "원");
	}
}
