package step08.test;

import step08.edu.Education;
import step08.person.Student;

class TestApp {
	public static void main(String[] args)	{
		System.out.println("=====Education Information =====");
	
		// 1. Education 객체를 생성..
		Education education1 = new Education();
		Student student1 = new Student();

		// 2. Education의 setEcucation()을 통해서 값을 주입.
		// 3. 이때 학생의 정보를 Student의 setStudent()를 이용하자.
		student1.setStudent("손연재", "son", 23);
		education1.setEducation("삼평동", 10, student1);

		// 4. 최종적으로 Education의 정보를 콘솔로 출력.
		System.out.println("강의장 수 :: " + education1.getClassNum() + "\n");
		System.out.println(education1.getStudent().getName()+ " :: " + education1.attend());

	}
}
