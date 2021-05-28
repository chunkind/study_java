package step03.test;

import step03.child.Child;

/**
 * @Auth K. J. S.
 * @Date 2019. 1. 7.
 * - Overriding Rule
 * 1. 상속관계의 두 클래스에서 적용
 * 2. 메소드의 선언부는 무조건 일치(return type, 메소드 이름, 인자값)
 * 3. 메소드의 구현부는 반드시 달라야함.
 * 4. More Modifier (private < protected < default < public)
 * 5. Less Exception (부모가 던지지 않은 예외는 자식이 던질수 없다.
 * 부모가 물려준 기능을 자식이 받아서 그 기능을 자식에 맞게 고쳐쓰는 것을 말한다.
 * 결과적으로 메소드의 이름은 같을지라도 하는일(기능, 구현부)이 바뀌게 된다. 
 */
public class AccessTest {
/*
	상속관계시 Access Modifier의 성격을 알아보는 로직
	부모 클래스 각각의 필드에 접근지정자를 선언.... 
	자식 클래스에서 부모의 필드에 접근가능 여부를 알아보겠다.
*/
	public static void main(String[] args) {
		// 이렇게 자식을 생성하면 무조건 부모가 먼저 생성
		// new Parent() 하지 않아도 ....
		Child child = new Child();
		child.test(); // 자식만의 맴버..
		System.out.println("================");
		child.access(); // 오버라이딩....
	}
}
