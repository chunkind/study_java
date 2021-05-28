package step03;

public class TestApp {
	public static void main(String args[]){
		Person p1 = null;
		Student s1 = new Student();
		p1=s1;//업 캐스팅
		System.out.println(p1.name);
		s1=(Student)p1;//다운캐스팅
		System.out.println(s1.name);
		//아까 안되었던 다운케스팅이 된다....
		//이유가 뭘까?
		
		Person p2 = new Person();
		Student s2 = null;
		s2 = (Student) p2;
		/**
		 * 결론 ::::
		 * 첫번째 예제에서 p1에 담긴 객체는 원래는 s1이라는 Student객체이다.
		 * 다시 이것을 Student로 케스팅하기 때문에 가능한것.
		 * 두번재 예제는 에초에 Person객체를 s2에 담으려니 안되는것. 
		 */
	}
}

class Person {
	String name;
	String id;
	public Person(){
		name="홍길동";
	}
}

class Student extends Person {
	String grade;
	String major;
	public Student(){
		grade="4학년";
		major="computer";
	}
}
