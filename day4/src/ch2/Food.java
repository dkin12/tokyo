package ch2;

public class Food extends Product {
	String maker;
	
	public Food(String name, int price) {
		super(name,price);
	}
	public void showFood() {
		showInfo();
	}
	
}
