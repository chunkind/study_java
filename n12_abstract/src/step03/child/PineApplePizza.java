package step03.child;

import step03.parent.Pizza;

public class PineApplePizza extends Pizza {
	public PineApplePizza(int price, String storeMaker) {
		this.price = price;
		this.storeMaker = storeMaker;
	}

	@Override
	public void topping() {
		System.out.println("PineApple Topping");
	}
}