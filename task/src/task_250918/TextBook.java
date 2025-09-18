package task_250918;

public class TextBook extends Book {
	String subject ;
	
	public TextBook() {
		
	}
	
	public TextBook(String title, String author, int price,String subject) {
		super(title, author, price);
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	

}
