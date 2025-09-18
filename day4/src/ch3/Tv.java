package ch3;

public class Tv extends Goods{

	public Tv(String brand) {
		super(brand);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void turnOn() {
		System.out.println("티비를 켜~");
		
	}

	@Override
	public void turnOff() {
		System.out.println("티비를 꺼");
		
	}

}
