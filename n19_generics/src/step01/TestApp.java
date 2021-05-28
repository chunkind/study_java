package step01;

import java.util.ArrayList;

/**
 * @Auth : ck
 * @Date : Jun 7, 2019
 * 제너릭스란 다양한 타입의 객체들을 다루는 메서드나 컬렉션 클래스에 컴파일 시의 타입체크
 * (compile-time type check)를 해주는 기능이다. 객체의 타입을 컴파일 시에 체크하기
 * 때문에 객체의 타입 안정성을 높이고 형변환의 번거로움이 줄어든다.
 */
public class TestApp {
	public static void main(String[] args) {
		Box<Fruit> fruitBox = new Box<Fruit>();
		Box<Apple> appleBox = new Box<Apple>();
		Box<Toy> toyBox = new Box<Toy>();
//		Box<Grape> grapeBox = new Box<Apple>();//Error. 타입 불일치로 에러.

		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());//OK. void add(Fruit itme)

		appleBox.add(new Apple());
		appleBox.add(new Apple());
//		appleBox.add(new Toy());//Error. Apple만 담김.
//		appleBox.add(new Fruit());//Error. 부모도 안됨.

		toyBox.add(new Toy());
//		toyBox.add(new Apple());//Error. 

		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(toyBox);

	}
}

class Fruit {
	public String toString() {
		return "Fruit";
	}
}

class Apple extends Fruit {
	public String toString() {
		return "Apple";
	}
}

class Grape extends Fruit {
	public String toString() {
		return "Grape";
	}
}

class Toy {
	public String toString() {
		return "Toy";
	}
}

class Box<T> {
	ArrayList<T> list = new ArrayList<T>();

	void add(T item) {
		list.add(item);
	}

	T get(int i) {
		return list.get(i);
	}

	int size() {
		return list.size();
	}

	public String toString() {
		return list.toString();
	}
}