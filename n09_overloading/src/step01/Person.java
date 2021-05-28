package step01;

/**
 * @Auth : ck
 * @Date : Dec 29, 2018
 * Method Overloading
 * 같은 이름의 메서드나 생성자로 여러번 선언하는 기법.
 * 하는 일은 같지만 처리하는 데이타 들을 달리할때 쓴다.
 * 
 * drink()
 * beerDrink()
 * beerTwoDrink()
 * beerWhoTwoCupDrink()
 * 
 * 위와 같은 경우를 많이 경험했을것이다.
 * 위의 메소드의 핵심적인 기능은 "print"
 * 그런데 무엇을 print 하느냐에 따라서 method identifier가 달라지고
 * 이는 결론적으로 서로 다른 메소드가 계속 만들어짐을 의미.
 *
 * drink()
 * drink(String kind)
 * drink(String kind, int jan)
 * drink(String who, String kind, int jan)
 *  
 * 메소드의 기능은 비슷한데 처리하는 데이타를 달리하면 되는 경우가 있다.
 * 이것을 우리는 메소드 오버로딩기법을 이용한다.
 *  
 * Method Overloading Rule : 
 * 1. 하나의 클래스에서 적용 
 * 2. 메소드 이름은 반드시 일치 
 * 3. 메소드 argument List는 반드시 달라야함 (인자값의 순서, 갯수, 타입중 하나라도 달라야함) 
 * eg) 
 *  void round(String j, int i )
 *  Type round(int i, int j ) // int를 똑같이 인식하여 오류뜸 
 * 4. 리턴 타입은 상관없다.
 */
public class Person {
	public void drink() {
		System.out.println("마신다....");
	}
	
	//일반적으로 이렇게 작성할 것이다.
	public void beerDrink() {
		System.out.println("맥주를 마신다....");
	}
	public void beerTwoDrink() {
		System.out.println("맥주를 2잔 마신다");
	}
	public void twoBeerDrink() {
		System.out.println("2잔의 맥주를 마신다.");
	}
	public void beerWhoTwoCupDrink() {
		System.out.println("ck가 맥주를 2잔 마신다");
	}

	//메서드 오버로딩 기법.
	public String drink(String kind) {
		return kind + "를 마신다...";
	}
	public String drink(String kind, int jan) {
		return kind + " 를" + jan + "잔 마신다...";
	}
	public String drink(int jan, String kind) {
		return jan + "잔의 " + kind + " 를 마신다...";
	}
	public void drink(String kind, int jan, String who) {
		System.out.println(who + " 가 " + kind + "를 " + jan + "잔 마신다...");
	}
	
	public static void main(String[] args) {
		Person p = new Person();
		p.drink();
		//일반적인 방법
		p.beerDrink();
		p.beerTwoDrink();
		p.beerWhoTwoCupDrink();
		//메서드 오버로딩 기법
		p.drink("맥주");
		p.drink("맥주", 2);
		p.drink("맥주", 2, "ck");
	}
}