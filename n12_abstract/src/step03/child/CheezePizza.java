package step03.child;

import step03.parent.Pizza;

public class CheezePizza extends Pizza {
	public CheezePizza(int price, String storeMaker) {
		this.price = price;
		this.storeMaker = storeMaker;
	}

	@Override
	public void topping() {
		System.out.println("Cheeze Topping....");
	}
}