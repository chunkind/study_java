package step04.test;

import step04.child.Empolyee;
import step04.child.Instructor;
import step04.child.Student;
import step04.parent.Person;
import step04.service.MemberService;

public class AppTest3 {
	public static void main(String[] args) {
		//1.Person 타입의 배열을 생성.... 사이즈 5
		//2.각각의 배열 학목에 s, s1, e, i, s2, i2 를 할당
		Person[] p = { 
			new Student("교포", "잠실", 28, 123), 
			new Empolyee("기리", "논현", 29, "영업부"),
			new Instructor("대한", "잠실", 30), 
			new Student("대한", "가리봉", 21, 504), 
			new Student("교포", "잠실", 22, 133) 
		};
		//3.배열 안에 있는 객체들의 정보를 콘솔창으로 출력...
		MemberService service = new MemberService();
		service.printAllInfo(p);
	}
}