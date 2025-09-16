package ch1;

public class Bread {
	// 속성 == 필드
	private  String name; 
	private int gram;
	private int price;
	private int cnt;
	
	public Bread() {
		// super : 다른 클래스가 상속 받는 부모 클래스, 공통 생성, 동작을 수퍼 클래스에 정의
	}

	public Bread(String name, int gram, int price, int cnt) {
		super();
		this.name = name;
		this.gram = gram;
		this.price = price;
		this.cnt = cnt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGram() {
		return gram;
	}

	public void setGram(int gram) {
		this.gram = gram;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
	// 금액 = 가격 * 갯수 
	public int breadTotal() { // 매개변수가 없을때
		return this.price * this.cnt;
	}
	public int breadTotal(int price) { // 매개변수에 가격만
		return price * this.cnt;
	}
	public int breadTotal ( int price , int cnt) {
		return price * cnt;
	}

	@Override
	public String toString() {
		return "Bread [제품명=" + name + ", 중량=" + gram + ", 가격=" + price + ", 수량=" + cnt + "]";
	}
	
	
	
}
