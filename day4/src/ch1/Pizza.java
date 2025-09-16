package ch1;

public class Pizza {
	static String pizzaName;
	static char size;
	
	public Pizza(String pizzaName, char size) {
		this.pizzaName = pizzaName;
		this.size = size;
	}

	public void order() {
		System.out.println(pizzaName + " 에 " + size + " 주문");
	}
}
