package step02;

import step02.vo.Man;
import step02.vo.Tiger;

/**
 * @Auth : K. J. S.
 * @Date : 2019. 02. 21.
 * 인터페이스의 활용 -
 * 인터페이스는 주로 아래와 같은 이유로 사용한다.
 * 1. 표준화
 * 2. 추상화
 * 3. 메타데이터
 * 
 * 우선 이 예제는 "표준화"에 대하여 알아본다.
 */
public class TestApp {
	public static void main(String[] args) {
		//사람과 호랑이라는 객체가 있다.
		Man man = new Man();
		Tiger tiger = new Tiger();
		
		//두 객체에 공격이라는 메서드를 사용하고싶다.
		//그런데 Man을 만든 프로그래머와
		//Tiger를 만든 프로그래머는 아래와 같이 다른 이름으로 사용 하여 만들었다.
//		man.bite();
//		tiger.punch();
		
		//이처럼 프로그래머마다 다른 이름으로 사용하게 되면 혼선이 온다.
		//이를 강제하기 위해 interface를 사용 할 수 있다.
		man.attack();
		tiger.attack();
	}
}
