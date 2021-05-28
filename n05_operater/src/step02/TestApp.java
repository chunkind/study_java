package step02;

class Idol {
	// Field
	String name;
	int age;

	Idol(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getIdol() {
		return name + "  " + age;
	}
}

class Operator {
	public boolean test1() {
		System.out.println("test1()  calling....");
		return true;
	}
	public boolean test2() {
		System.out.println("test2()  calling....");
		return true;
	}
}

public class TestApp {
	public static void main(String[] args) {
		Idol idol1 = new Idol("수지", 25);
		Idol idol2 = new Idol("수지", 24);

		// 주소값이 같으면 서로 같은 객체를 의미
		if (idol1 == idol2)
			System.out.println("서로 같은 Object...");
		else
			System.out.println("서로 다른 Object...");

		idol1 = idol2; // idol 주소값이 변경됨 ... idol2 같은 주소값
		System.out.println(idol1.getIdol());
		System.out.println(idol2.getIdol());

		///////////////////////////////////////////////////
		// Local v, 기본값이 없어서 초기화 무조건 해주자.

		int i = 5;
		int j = 3;
		System.out.println("연산자 % : :" + i % +j); // 2 나머지 기능
		System.out.println("i == j : " + (i == j));// false 둘이 서로 값이 다르다
		System.out.println("i != j : " + (i != j)); // true 같지 않다는 표현이기 때문
		/*
		 * 기본형 타입의 변수에는 값이 바로 할당되는 반면, 클래스 타입의 변수에는 객체를 가리키는(참조하는) 주소값이 들어간다
		 */

		boolean flag = false;
		System.out.println("flag : " + flag); // false
		System.out.println("!flag : " + !flag);// true

		int k = 10; // local
		System.out.println("k++ : " + k++); // 10하고 나중에 1을 증가
		System.out.println("k : " + k);

		int m = 10;
		System.out.println("++m : " + ++m);// 11
		System.out.println("m : " + m);// 11

		int p = 100;
		System.out.println("p-- : " + p--);// 100
		System.out.println("p : " + p);// 99

		int q = 100;
		System.out.println("--q : " + --q);// 99
		System.out.println("q : " + q); // 99

		/* Operator 클래스의 test1(), test2()메소드를 사용할려면?
		 * 객체를 생성 == Operator 클래스의 맴버가 메모리에 올라간다 == 메모리에 올라간 애들만 접근해서 사용할 수 있다
		 */

		Operator o1 = new Operator();
		System.out.println(o1.test1() || o1.test2());// || short circuit (or)
													 // 앞에 결과가 true가 나오면 뒤에
													 // 연산이 실행할 필요가 없다
		System.out.println(o1.test1() && o1.test2());// && 앞에 결과가 false가 나왔을 때
													 // 뒤에도 false
	}

}