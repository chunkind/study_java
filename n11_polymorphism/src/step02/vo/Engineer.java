package step02.vo;

public class Engineer extends Employee {
	private String tech;
	private int bonus;

	public Engineer(String empId, String name, String addr, int salary, String tech, int bonus) {
		super(empId, name, addr, salary);
		this.tech = tech;
		this.bonus = bonus;
	}

	public String getTech() {
		return tech;
	}

	public int getBonus() {
		return bonus;
	}

	@Override
	public String toString() {
		return super.toString() + " Engineer Tech : " + tech + ", Bonus : " + bonus;
	}
}
