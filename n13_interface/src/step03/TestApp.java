package step03;

import step03.after.Cat;
import step03.after.Dog;
import step03.after.Man;

/**
 * @Auth : K. J. S.
 * @Date : 2019. 02. 21.
 * 인터페이스의 활용 -
 * 인터페이스는 주로 아래와 같은 이유로 사용한다.
 * 1. 표준화
 * 2. 추상화
 * 3. 메타데이터
 * 
 * 이어서 이 예제는 "추상화"에 대하여 알아본다.
 */
public class TestApp {
	public static void main(String[] args) {
		//동물 울음소리를 호출하는 로직이다.
		step03.before.ActionService service = new step03.before.ActionService();
		service.doAction("cat");
		service.doAction("man");
		
		//만약 Dog가 추가되고 "왈왈"을 출력하는 메서드를 추가한다고 해보자
		//Dog 클래스만 생성하는게 아닌 Service 로직도 건들여야한다.
		service.doAction("dog");
		
		//반면 인터페이스를 사용한다면 이를 해결할수 있다.
		step03.after.ActionService service2 = new step03.after.ActionService();
		service2.doAction(new Cat());
		service2.doAction(new Dog());
		service2.doAction(new Man());
		
		//Dog를 추가할때 Service로직도 변경되면 두 클래스간 결합력이 강하다고 표현하고
		//Service는 Dog 클래스를 의존한다고 표현한다.
		//단순 몇개 안되는 클래스를 추가한다고 하면 문제가 없을텐데.
		//매번 Dog같은 클래스가 늘어난다고 생각하면 그때마다 Service 로직을 고쳐야한다.
		//이러한 방식은 객체지향프로그래밍 기법에서 지양한다.
		//Animal 이라는 인터페이스를 두어서 Cat, Dog, Man의 객체를 추상화하여
		//Service 에게 알려준다 그럼 Service는 Animal의 추상적인 메서드를 사용하므로
		//Service 자체는 구체적인 코드 내용을 모르니 코드가 변경될 일이없다.
		
		//이것을 자바에서 "추상화"라고 한다.
	}
}
