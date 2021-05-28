package step01;

/**
 * @Auth : K. J. S.
 * @Date : 2019. 02. 21.
 * Interface -
 * 인터페이스는 interface 라는 키워드로 선언한다
 * 인터페이스의 변수는 상수(public static final) 이다.(public static final 생략 가능)
 * 인터페이스의 메서드는 추상메서드(abstract) 이다.(abstract 생략 가능)
 * 인터페이스로는 객체생성을 할 수 없다.
 * 인터페이스는 구현하는 객체는 implements라는 키워드를 사용한다.
 * 인터페이스는 extends로 인터페이스를 상속 할수 있다.
 * 인터페이스 맴버의 접근 지정자는 무조건 public 이다.
 * 인터페이스는 다중 상속이 가능하다. 
 */
public class TestApp {
	public static void main(String[] args) {
		
	}
}
interface BasicInterface {
	public static final String str1 = "a";
	String str2 = "b"; //앞에 public static final 이 생략
//	protected int int1 = 0; //protected 접근지정자 사용 불가능.
//	private boolean bool = true; //private 접근지정자 사용 불가능.
	
	public abstract void a();
	void b(); // abstract 생략 가능
//	protected abstract void c(); //protected 접근지정자 사용 불가능.
//	private abstract void d(); //private 접근지정자 사용 불가능.
	
	//interface는 구현체를 갖을수 없다 (abstract class의 abstract 메서드와 동일)
//	public void c() {
//		System.out.println("구현체를 갖을수 없다..");
//	}
}

/**
 * 인터페이스를 구현하는 객체는 implements라는 키워드를 사용한다.
 * 인터페이스에서 선언한 추상 메서드는 이 자식 객체에서 모두 구현 해야한다.
 * 아래 인터페이스의 맴버는 메서드 2개와 인터페이스에 있는 변수 2개 총 4개가 맴버가 된다.
 */
class BasicClass implements BasicInterface{
	@Override
	public void a() {
		// 코드....
	}
	@Override
	public void b() {
		// 코드....
	}
}

/**
 * 구상객체는 2개의 인터페이스를 구현(implements)할 수 있다.
 */
interface Fly{
	void fly();
}
interface Bim{
	void bim();
}
class Superman implements Fly, Bim {
	@Override
	public void bim() {
		System.out.println("받아라 빔!!!");
	}
	@Override
	public void fly() {
		System.out.println("망또로 날다~~~");
	}
}

/**
 * 인터페이스는 extends 키워드를 사용하여 상속 받을수 잇다.
 */
interface 뿔{
	public void 뿔로찌르기();
}
interface 악마 extends 뿔{
	public void 날기();
}
/**
 * 인터페이스는 2개이상 상속이 가능하다(일반 클래스에서는 한개만 상속가능)
 * implements는 추상메서드를 모두 구현하는 의미이니
 * interface에서는 사용할수 없다. 
 */
interface 슈퍼악마 extends 뿔, Fly{}
//interface 슈퍼악마 interface 뿔, Fly{}