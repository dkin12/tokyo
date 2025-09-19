package task_healthSystem;

public class HealthDTO {
	String name;
	String number;
	int kcal;
	int burnkcal;
	
	public HealthDTO() {}

	public HealthDTO(String name, String number, int kcal, int burnkcal) {
		super();
		this.name = name;
		this.number = number;
		this.kcal = kcal;
		this.burnkcal = burnkcal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getKcal() {
		return kcal;
	}

	public void setKcal(int kcal) {
		this.kcal = kcal;
	}

	public int getBurnkcal() {
		return burnkcal;
	}

	public void setBurnkcal(int burnkcal) {
		this.burnkcal = burnkcal;
	}

	@Override
	public String toString() {
		return "HealthDTO [name=" + name + ", number=" + number + ", kcal=" + kcal + ", burnkcal=" + burnkcal + "]";
	}
	
	
	
	
}
