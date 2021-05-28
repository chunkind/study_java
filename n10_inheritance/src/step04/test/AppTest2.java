package step04.test;

import step04.child.Empolyee;
import step04.child.Instructor;
import step04.child.Student;
import step04.parent.Person;

/**
 * @Auth K. J. S.
 * @Date 2019. 1. 7.
 * instanceof 앞과 뒤의 데이타 타입이 같으면 true 리턴되고 아니면 false
 */
public class AppTest2 {
	public static void main(String[] args) {
		// 1. Person 타입의 배열을 생성.... 사이즈 5
		// 2. 각각의 배열 학목에 s, s1, e, i, s2, i2 를 할당
		Person[] p = { 
			new Person("교포", "잠실", 28), 
			new Empolyee("기리", "논현", 29, "영업부"), 
			new Instructor("대한", "잠실", 30),
			new Student("대한", "가리봉", 21, 403), 
			new Student("교포", "잠실", 22, 503) 
		};
		// 3. 배열 안에 있는 객체들의 정보를 콘솔창으로 출력(각각의 객체만의 기능을 호출)
		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i]);
			if (p[i] instanceof Student) {
				Student stu = (Student) p[i];
				stu.attend();
			}
			if (p[i] instanceof Empolyee) {
				Empolyee emp = (Empolyee) p[i];
				emp.planEducation();
			}
			if (p[i] instanceof Instructor) {
				Instructor ins = (Instructor) p[i];
				ins.sumScore();
			}
		}
	}
}