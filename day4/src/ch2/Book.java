package ch2;

public class Book extends Product{
	

	// 필드 : 저자 
	String author;
	// 메서드 : 부모 클래스의 저자명 출력 
	
	public Book(String name, int price,String author) {
		super(name, price);
		this.author = author;
		
	}
	
	
	
	

	
}
