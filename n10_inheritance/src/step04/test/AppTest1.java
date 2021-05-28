package step04.test;

import step04.child.Empolyee;
import step04.child.Instructor;
import step04.child.Student;
import step04.parent.Person;

/**
 * @Auth K. J. S.
 * @Date 2019. 1. 7.
 * 
 */
public class AppTest1 {
/*
	아래와 같이 클래스를 작성.
	- Super class(String name, String address, int age;)
	Person
	- Sub class 
	Employee(Stirng delt)
	Student(int StudentId)
	Instructor(String subject)
	클래스 작성후 아래와 같이 출력.
	============Print Info===============
	Person ::교포 잠실 28
	Empolyee :: 기리 논현 31  영업부
	Student ::대한 인천 21 502
	Instructor ::민국 가리봉 30 java
*/
	public static void main(String[] args) {
		Person p = new Person("교포", "잠실", 28);
		Empolyee e = new Empolyee("기리", "논현", 31, "영업부");
		Student s = new Student("대한", "인천", 21, 502);
		Instructor i = new Instructor("민국", "가리봉", 30);

		System.out.println("============Print Info===============");
		System.out.println("Person ::" + p);
		System.out.println("Empolyee :: " + e);
		System.out.println("Student ::" + s);
		System.out.println("Instructor ::" + i);
	}
}