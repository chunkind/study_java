package step02;

/**
 * @Auth K. J. S.
 * @Date 2019. 1. 4.
 * 객체의 최고의 부모는 Object다
 * Object의 메소드 equals()와 toString()을 알아보자
 *  toString의 Overiding에 대해 알아보자.
 *  
 *  - Overriding 대표적인 예 
 * equals () 주소값 비료 문자열 비교 (Object) 
 * toString() 주소값 출력 문자열 출력 (String)
 */
public class ObjectMethodTest {
	public static void main(String[] args) {
		//boolean equals(obj) :: Object :: 다른객체인지 같은 객체인지 비교
		Person p1 = new Person("김준성", 25);
		Person p2 = new Person("김준성", 25);
		
		//String toStirng() :: Object :: 객체가 저장된 위치값을 문자열로 리턴
		System.out.println("p1 :: " + p1.toString());
		System.out.println("p2 :: " + p2.toString());
		System.out.println(p1.equals(p2)); // false.. 주소값이 다르다
		System.out.println(p1 == p2); // false.. 주소값이 다르다

		System.out.println("p1 = p2 ");
		p1 = p2; // 이부분 때문에 서로 같은 주소값을 가지며... 같은 객체를 가르킨다
		System.out.println("p1 :: " + p1);
		System.out.println("p2 :: " + p2);
		System.out.println(p1.equals(p2)); // true.. 주소값
		System.out.println(p1 == p2); // true.. 주소값
	}
}

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

}