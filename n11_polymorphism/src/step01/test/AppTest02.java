package step01.test;

import step01.child.Cat;
import step01.child.Dog;
import step01.child.Man;
import step01.parent.Animal;

public class AppTest02 {
	public static void main(String[] args) {
		Animal[] a = { new Cat(), new Dog(), new Man() };
		// casting, instanceof, virtual Method Invocation
		for (int i = 0; i < a.length; i++) {
			a[i].eat();
			// 참조변수 instanceof 클래스명
			// -> 객체가 옆의 클래스 명과 같은 타입이면 true 리턴
			// casting해서 호출
			if (a[i] instanceof Man) {
				Man man = (Man) a[i];
				man.drive();
			}
		}
	}
}