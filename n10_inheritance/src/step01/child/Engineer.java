package step01.child;

import step01.parent.Employee;
import step01.util.MyDate;

public class Engineer extends Employee {
	private String dept;

	public Engineer(String name, double salary, MyDate birthDate, String dept) {
		super(name, salary, birthDate);
		this.dept = dept;
	}

	public String getDetails() {
		return super.getDetails() + "\t" + dept;
	}

	@Override
	public String toString() {
		return super.toString() + "\t" + dept;
	}

}