package step01.child;

import step01.parent.Employee;
import step01.util.MyDate;

/**
 * @Auth K. J. S.
 * @Date 2019. 1. 4.
 * 맴버 5
 */
public class Manager extends Employee {
	private String dept;

	public Manager(String name, double salary, MyDate birthDate, String dept) {
//		super() -
//		부모를 가르키는 키워드(super) 
//		부모(Employee) 기본 생성자 호출이 무조건 일어난다.
//		부모 객체가 무조건 하나 만들어져야 된다. 자식은 추가되는 기능
		super(name, salary, birthDate);
		this.dept = dept;
		this.name = name; 
		this.salary = salary; 
		this.birthDate = birthDate;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDetails(){
		return name + "\t" + salary + "\t" + birthDate.getDetails() + "\t" + dept;
	}
	
	// 오버라이딩 적극 사용
//	public String getDetails() {
//		return super.getDetails() + "\t" + dept;
//	}
	
	@Override
	public String toString() {
		return super.toString() + "\t" + dept;
	}
	
}