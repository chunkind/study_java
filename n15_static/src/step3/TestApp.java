package step3;

/**
 * @Auth : ck
 * @Date : Mar 2, 2019
 * Member V와 Class V의 차이점을 구분할수 있는 로직
 * Class V가 생성된 객체들이 공유한다는 의미를 다뤄보겠다.
 * 주로 Counting 할때 사용한다
 */
class Member{
	//클래스 변수
//	static int counter;
	//맴버 변수(전역 변수)
	int counter;
	
	Member(){ //객체가 생성될때마다
		counter++;
	}
}
public class TestApp {
	public static void main(String[] args) {
		Member mem1 = new Member();
		Member mem2 = new Member();
		Member mem3 = new Member();
		Member mem4 = new Member();
		//맴버변수 자기 자신이 돌아서 결과가 1이 나옴
		System.out.println("현재까지 생성된 객체의 숫자 ::" + mem3.counter);
		System.out.println(mem1.counter);
		System.out.println(mem2.counter);
		System.out.println(mem3.counter);
	}
}