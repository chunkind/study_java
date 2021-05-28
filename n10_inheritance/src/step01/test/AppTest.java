package step01.test;

import step01.child.Engineer;
import step01.child.Manager;
import step01.parent.Employee;
import step01.util.MyDate;

/**
 * @Auth K. J. S.
 * @Date 2019. 1. 4.
 * 상속이 뭔지 알아보는 에제.
 * 자바에서 상속은 "extends"라는 키워드를 사용한다.
 */
public class AppTest {
	public static void main(String[] args) {
		
//		1.Employee 객체 1개를 만들어 getDetails()가 아래와 같이 출력 되도록 구현.
//		김준성	1800.0 	2018-10-30
		Employee employee = new Employee("김준성", 1800.0, new MyDate(2018, 10, 30));
		System.out.println(employee.getDetails());
		
//		2.Manager 객체 1개를 만들어 getDetails()가 아래와 같이 출력 되도록 구현.
		Manager manager = new Manager("성영식", 4000.0, new MyDate(2015, 3, 17), "Development");
		System.out.println(manager.getDetails());
		
//		3.Engineer 객체 1개를 만들어 getDetails()가 아래와 같이 출력 되도록 구현.
		Engineer engineer = new Engineer("김새봄", 10000.0, new MyDate(2011, 1, 24), "Publisher");
		System.out.println(engineer.getDetails());
		
//		4.toString을 사용하면 객체 주소가 반환된다. 이것을 변경해보시라.
		System.out.println(employee.toString());
		System.out.println(manager.toString());
		System.out.println(engineer.toString());
		
	}
}
