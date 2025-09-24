package ch3;

public class ListDTO {
	int id;
	String name;
	
	public ListDTO() {
		
	}
	
	public ListDTO(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "번호=" + id + ", 상품명" + name ;
	}
	
}
