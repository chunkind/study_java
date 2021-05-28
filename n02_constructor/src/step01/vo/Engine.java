package step01.vo;

public class Engine {
	int speed;
	int rpm;

	public Engine(int speed, int rpm) {
		// super();
		this.speed = speed;
		this.rpm = rpm;
	}
	public int getSpeed() {
		return speed;
	}
	public int getRpm() {
		return rpm;
	}
}