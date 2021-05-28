package step04.child;

import step04.parent.Person;

public class Student extends Person {
	private int studentId;

	public Student(String name, String address, int age,int studentId) {
		super(name, address, age);
		this.studentId = studentId;
	}

	@Override
	public String toString() {
		return super.toString() + " " + studentId;
	}

	public void attend() {
		System.out.println("출석!!");
	}
}