package ch3;

public class Phone extends Goods{

	public Phone(String brand) {
		super(brand);
	}

	@Override
	public void turnOn() {
		System.out.println("휴대폰을 켜...!! ");
	}

	@Override
	public void turnOff() {
		System.out.println("휴대폰을 닫아...");
	}
	
}
