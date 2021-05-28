package step02;

/**
 * @Auth K. J. S.
 * @Date 2019. 1. 29.
 * 케스팅 ::: 형변환 => 데이터 타입을 바꾸기위해 사용.
 * 1.기본형 형변환
 * 
 * 2.참조형 형변환
 * 
 * 아래 예제는 참조형 케스팅에 관한 예제
 * 참조형의 형변환은 상속관계에서만 가능하다.
 */
public class TestApp {
	public static void main(String[] args) {
		Animal animal = new Animal();
		SuperMan sueprMan = new SuperMan();
		Bird bird = new Bird();
		
//		animal = human; //업케스팅
//		human = (Human) animal; //다운케스팅
		
		sueprMan.bim();// 슈퍼맨의 고유 기능
//		Man man = sueprMan; // 업 케스팅 ( 자식타입이 부모타입에 들어간다)
//		man.bim(); // 업케스팅하게 되면 기능이 제거된다.
		
		//반대로 다운케스팅(부모타입이 자식타입으로 변환)시 기능이 추가되는지 확인해보자
		Human human = new Human();
		human.action();
//		human.makeUp(); //Woman의 기능... 해당클래스에는 기능이 없다..
		
		//다운 케스팅(자식클래스로의 변환)
//		Woman woman = (Woman)human; //에러!!
//		Human human2 = new Human();
//		Woman woman2 = new Woman();
//		woman2 = (Woman) human2; //에러!!!
		//주석을 제거하고 해보면 마치 될것같다.
		//하지만 안된다. 이유는 human 객체에는 makeUp()이라는 메서드가 없다.
		//따라서 부모객체의 makeUp(); 메서드 정보를 채워줄수 없어서 자바 실행시 런타임 오류가 발생한다.
		
		//인터페이스 또한 상속구조로 취급하고 케스팅이 가능하다.
		Wing wing1 = new Bird();
		Wing wing2 = new SuperMan();
		wing1.fling();
		wing2.fling();
		
	}
}

class Animal{
	void action(){
		System.out.println("동물~~~~ 우웨웨웨웨~~");
	}
}
interface Wing{
	void fling();
}
class Human extends Animal{
	@Override
	void action() {
		System.out.println("나는 닝겐.... 동물관 다르다...");
	}
}
class Woman extends Human{
	void makeUp(){
		System.out.println("화장 끝~~");
	}
}
class Man extends Human{
	void pushUp(){
		System.out.println("푸쉬업 끝~~");
	}
}
class SuperMan extends Man implements Wing{
	@Override
	public void fling() {
		System.out.println("슈퍼맨이 날다~~");
	}
	void bim(){
		System.out.println("빔 발사!!!!");
	}
}
class Bird extends Animal implements Wing{
	@Override
	public void fling() {
		System.out.println("날다~~~");
	}
}