package step04.child;

import step04.parent.Person;

public class Instructor extends Person {
    private String subject; 
	private static final String BASIC_SUBJECT = "java";

	public Instructor(String name, String address, int age, String subject) {
		super(name, address, age);
	    this.subject = subject;
	}

	public Instructor(String name, String address, int age) {
		this(name, address, age, BASIC_SUBJECT);
	}

	@Override
	public String toString() {
		return super.toString()+ " "+ subject;
	}

	public void sumScore(){
		System.out.println("성적의 총합은 100이어야 합니다...");
	}

}