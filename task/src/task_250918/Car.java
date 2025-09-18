package task_250918;

public class Car implements Vehicle{
	private int speed;
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	@Override
	public void move() {
		speed+=10;
		System.out.println("현재 속도 : " + speed);
	}

}
