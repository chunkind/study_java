package step04.child;

import step04.parent.Person;

public class Empolyee extends Person {
	private String dept;

	public Empolyee(String name, String address, int age, String dept) {
		super(name, address, age);
		this.dept = dept;
	}
	
	public void planEducation() {
		System.out.println("교육과정을 기획...");
	}

	@Override
	public String toString() {
		return super.toString() + "  " + dept;
	}

}
