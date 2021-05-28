package step01.parent;

import step01.util.MyDate;

/**
 * @Auth K. J. S.
 * @Date 2019. 1. 4.
 * 맴버 4개 (필드 3 메소드 1)
 */
public class Employee {
	public String name;
	public double salary;
	public MyDate birthDate;

	public Employee(String name, double salary, MyDate birthDate) {
		super();
		this.name = name;
		this.salary = salary;
		this.birthDate = birthDate;
	}

	public String getDetails() {
		return name + "\t" + salary + " \t" + birthDate.getDetails();
	}
	
	@Override
	public String toString() {
		return name + "\t" + salary + " \t" + birthDate.getDetails();
	}

}