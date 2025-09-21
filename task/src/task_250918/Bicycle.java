package task_250918;

public class Bicycle implements Vehicle{

	private int speed;
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public void move() { // 와 이게 최선이에요?
		speed += 2;
		System.out.println("현재 속도는 : " + speed);
		
	}

}
