package step03.service;

import java.util.Vector;

import step03.parent.Pizza;

public class PizzaService {
	//각각의 피자를 만드는 기능을 호출.
	public void allMakePizza(Vector<Pizza> v) {
		for (int i = 0; i < v.size(); i++) {
			System.out.println("===================================");
			Pizza pizza = v.get(i);
			pizza.makePizza();
			System.out.println("===================================");
		}
	}
}
