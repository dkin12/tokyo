package ch1;

public class User {
	
	// 필드 == 속성 == 사용자의 특성 정의
	private String name; 
	private String id;
	private String password;
	
	private String ptName;
	private String ptPrice;
	private String ptCount;
	
	// 기본 생성자 
	// 내가 작성하지 않아도 자바가 기본적으로 만들어주지만, 
	// 다른 생성자를 직접 만들게 되면 기본 생성자 도 작성해야함 
	public User() { 
		super();
		
	}

	// 매개변수가 있는 생성자 
	public User(String name, String id, String password) {
		this.name = name;
		this.id = id;
		this.password = password;
	}

	// getter 매서드 
	public String getName() {
		return name;
	}


	public String getId() {
		return id;
	}


	public String getPassword() {
		return password;
	}

	
	public void setPtName(String ptName) {
		this.ptName = ptName;
	}

	public void setPtPrice(String ptPrice) {
		this.ptPrice = ptPrice;
	}

	public void setPtCount(String ptCount) {
		this.ptCount = ptCount;
	}

	public String getPtName() {
		return ptName;
	}

	public String getPtPrice() {
		return ptPrice;
	}

	public String getPtCount() {
		return ptCount;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", password=" + password + ", ptName=" + ptName + ", ptPrice="
				+ ptPrice + ", ptCount=" + ptCount + "]";
	}


	
	
	
	
}
