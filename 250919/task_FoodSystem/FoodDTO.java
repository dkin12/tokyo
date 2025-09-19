package task_FoodSystem;

public class FoodDTO {
	String number;
	String name;
	int count;
	String date;
	
	public FoodDTO() {}
	
	public FoodDTO(String number, String name, int count, String date) {
		this.number = number;
		this.name = name;
		this.count = count;
		this.date = date;
	}
	
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "FoodDTO [number=" + number + ", name=" + name + ", count=" + count + ", date=" + date + "]";
	}

	
	
	
	
}
