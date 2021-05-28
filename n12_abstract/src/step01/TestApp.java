package step01;

/**
 * @Auth : ck
 * @Date : Feb 9, 2019
 * 
 * Modifier
 * 1) Access Modifier(접근지정자)
 * - private < (default) < protected < public
 * 2) Usage Modifier(키워드)
 * - abstract, static, final, 등...
 * 
 * Abstarct class(추상 클래스) ::
 * Abstract Method(추상 메서드)를 1개 이상 갖고 있는 클래스.
 * 완벽하지 않는 클래스(바로 객체생성 불가) 추상 메서드를 구현 해야지만 객체생성 가능.
 * 추상 메서드는 일종의 Template 역할을 하는데 추상클래스를 상속받은 자식들이부모의 
 * 추상메서드를 자식에 맞게 오버라이딩 해서 사용하도록 만드는 것이 목적.
 * 
 * 조건
 * 1.반드시 추상메서드를 1개 이상 갖고 있어야한다.
 * 추상메서드 정의 법 :: [접근제한자] abstract [return 자료형] [메서드이름]();
 * 구현체 {}가 반드시 없어야 한다.
 * 2.abstract class [클래스명] 으로 정의한다.
 * 3.추상클래스(abstract)는 extends 로 상속받는다. 
 * 4.추상클래스(abstract)는 다중 상속이 안된다.
 * 5.일반 메서드, 멤버 필드, 생성자등 일반적인 클래스가 갖는 맴버를 추상클래스도 갖을수 있다.
 * 6.일반클래스보다 조금더 추상적은 개념의 것을 정의한다.
 * 7.추상클래스(abstract)의 추상메서드를 정의하면 추상클래스를 상속받은 클래스에서는 반드시
 * 추상메서드를 Override 하여 정의하여야 한다(또는 그자식에서 만들어도 됨).
 * 8.abstract class는 완벽한 클래스(설계도)가 아니기 때문에 객체 생성의 대상에서 제외 된다.
 * 9.abstract class를 상속받은 자식을 생성할때 Type으로서 사용된다.
 * Pizza라는 부모객체(추상클래스)에 PotatoPizza라는 자식 객체를 담는 것을 말한다.
 * 10.추상클래스를 받는 자식객체도 추상클래스가 될수 있다. 그렇게 되면 자식객체를 받는 
 * 자식의 자식객체에서 추상메서드를 구현해줘야한다.
 */
public class TestApp {
	public static void main(String[] args) {
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		Animal a3 = new Man();
		Animal a4 = new Animal() {
			@Override
			public String crying() {
				return "ㅠㅠ";
			}
		};
		a1.doAction();
		a2.doAction();
		a3.doAction();
		a4.doAction();
	}
}
