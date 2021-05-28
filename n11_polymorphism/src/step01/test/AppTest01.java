package step01.test;

import step01.child.Cat;
import step01.child.Dog;
import step01.child.Man;
import step01.parent.Animal;

/**
 * @Auth K. J. S.
 * @Date 2019. 1. 7.
 * - PolyMorphism
 * 부모타입으로 여러개의 자식 객체를 생성하는 것을 말함
 * 이렇게 객체를 생성할때 타입을 부모로 해서 만들게 되면 
 * 부모 클래스의 기능으로 다양한 자식들을 공통적으로 관리.
 */
public class AppTest01 {
	public static void main(String[] args) {
		// 1. 부모 타입으로 자식객체들을 생성... Cat, Dog, Man
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		Animal a3 = new Man();
          
		// 2. 객체변수들을 이용해서 eat()을 호출
		/*
		 * Virtual Method Invocation의 원리 :: 
		 * 1) 컴파일 시점의 메소드 : 부모 메소드가 호출.. 
		 * 2) 실행시점의 메소드: 자식 메소드가 최종적으로 호출.. 
		 * 부모 타입으로 자식객체를 생성하고 부모타입의 변수로 오버라이딩된
		 * 메소드를 호출하면 자식의 메소드가 결국에는 구동.
		 */
		a1.eat();
		a2.eat();
		a3.eat();//Man의 eat()이 구동
        
		//부모가 가지지 않는 맴버를 부모에 할당하면 안된다
		//casting 큰애가 작은방에 들어갈 때 , 기본형에서 쓰이진 않는다 
		//a3.drive()  / casting을 밑에 방법처럼 하면 구동된다..
		//a3.jooryang = false;
		Man m = (Man)a3;
		m.jooryang = true;
		m.drive();
	}
}
