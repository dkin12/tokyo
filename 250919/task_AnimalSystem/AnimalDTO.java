package task_AnimalSystem;

public class AnimalDTO {
	String id;
	String protector;
	String name;
	int age;
	int number;
	
	public AnimalDTO() {}
	
	public AnimalDTO(String id, String protector, String name, int age, int number) {
		this.id = id;
		this.protector = protector;
		this.name = name;
		this.age = age;
		this.number = number;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProtector() {
		return protector;
	}
	public void setProtector(String protector) {
		this.protector = protector;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "AnimalDTO [id=" + id + ", protector=" + protector + ", name=" + name + ", age=" + age + ", number="
				+ number + "]";
	}
	
	
	
}
