package ch1;

public class DeliveryOrder {
	String food ;
	String address ;
	
	public DeliveryOrder(String food, String address) {
		super();
		this.food = food;
		this.address = address;
	}
	
	public String delivery() {
		return "음식 : "+this.food + " 주소 : " + this.address;
	}
}
