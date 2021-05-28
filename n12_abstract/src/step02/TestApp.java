package step02;

import step02.calcul.Calculator;
import step02.calcul.impl.Division;
import step02.calcul.impl.Minus;
import step02.calcul.impl.Multiply;
import step02.calcul.impl.Plus;
import step02.calcul.service.CalculService;

/**
 * @Auth : ck
 * @Date : Feb 9, 2019
 * 추상화를 이용한 예제.
 * 각각의 자식 객체의 calcultate()는
 * 구현한 로직이 각각 다르게 구현하는것을 이용한 예제.
 */
public class TestApp {
	public static void main(String[] args) {
		CalculService service = new CalculService();
		service.calculate(4, 2, new Plus());
		service.calculate(4, 2, new Minus());
		service.calculate(4, 2, new Multiply());
		service.calculate(4, 2, new Division());
		service.calculate(4, 2, new Calculator() {
			@Override
			protected double doCalculation(int a, int b) {
				return (a*b)*2;
			}
		});
	}
}
