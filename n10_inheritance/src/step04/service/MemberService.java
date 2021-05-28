package step04.service;

import step04.child.Empolyee;
import step04.child.Instructor;
import step04.child.Student;
import step04.parent.Person;

public class MemberService {
	public void printAllInfo(Person[] p) {
		for (Person person : p) {
			if (person instanceof Student) {
				System.out.println(person);
				Student s = (Student) person;
				s.attend();
			} else if (person instanceof Empolyee) {
				System.out.println(person);
				Empolyee e = (Empolyee) person;
				e.planEducation();
			} else {
				System.out.println(person);
				Instructor ins = (Instructor) person;
				ins.sumScore();
			}
		}
	}
}