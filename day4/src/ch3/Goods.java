package ch3;

public abstract class Goods {
	private String brand;
	
	public Goods(String brand) {
		this.brand = brand;
	}
	
	// 추상메서드 ( 반드시 구현 ) 
	public abstract void turnOn();	
	public abstract void turnOff();
	
	// 일반 메서드 ( 공통 코드 ) 
	public void showBrand() {
		System.out.println("브랜드 " + brand);
	}
}
