package step03;

import java.util.Vector;

import step03.child.CheezePizza;
import step03.child.PineApplePizza;
import step03.child.PotatoPizza;
import step03.parent.Pizza;
import step03.service.PizzaService;

/**
 * 추상클래스의 용도 ::
 * 1. 피자를 만들어 내기위한 공통적인 작업(필드,메소드)은 자식에게 물려주고 
 *     --> 피자를 만들어 내기 위한 90%의 공통의 설계도
 * 2. 반면에 다양한 종류의 피자가 만들어 지기위한 결정적인 부분은 template로 선언
 *      
 *   현업:::Project의 경우를 생각해보자
 *   설계자:::Pizza의 template 부분을 작성
 *   코더:::PotoatoPizza, PineApplePizza, CheezePizza 
 *   
 *   실제 클래스를 작성하는 사람이 여러명일 경우
 *   각각의 실제 자식클래스를 어떤 강제사항도 두지 않으면 서로 제각각의 
 *   클래스를 만들어 낼수 밖에 없다. (필드,메소드..)
 *   이런 것들을 동일한 Template안에서 강제사항으로 묶어둘수 있는 요소가 
 *   추상 클래스의 사용법에서 중요한 역할을 한다
 */
public class PizzaServiceTest {

	public static void main(String[] args) {
		PizzaService service = new PizzaService();
		Vector<Pizza> v = new Vector<Pizza>();

		v.add(new PotatoPizza(17000, "PizzaHut"));
		v.add(new PineApplePizza(19000, "Domino Pizza"));
		v.add(new CheezePizza(15000, "Mr Pizza"));

		// Vector안에 들어있는 두번쟤 객체를 받아오고 싶다.. get(index)
		Pizza p1 = v.get(1);
		System.out.println("두번째 들어있는 객체의 정보 : " + p1);
		System.out.println("백터 수용가능 용량 : " + v.capacity());
		System.out.println("Vector에 들어있는 Pizza의 갯수 :" + v.size());
		System.out.println("Pizza toString() :" + v);

		service.allMakePizza(v);
	}

}
