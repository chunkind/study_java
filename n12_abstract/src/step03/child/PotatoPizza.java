package step03.child;

import step03.parent.Pizza;

public class PotatoPizza extends Pizza {
	public PotatoPizza(int price, String storeMaker) {
		this.price = price;
		this.storeMaker = storeMaker;
	}

	@Override
	public void topping() {
		System.out.println("Potato Topping");
	}
}