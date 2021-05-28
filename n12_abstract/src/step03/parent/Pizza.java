package step03.parent;

abstract public class Pizza {
	protected int price;
	protected String storeMaker;

	public Pizza(){}//기본생성자 쓰는 이유는 컴파일해주지 않기때문에 밑에 있는 명시적 생성자를 만들면 같이 사용한다.

	public Pizza(int price, String storeMaker) {
		this.price = price;
		this.storeMaker = storeMaker;
	}

	public void dough() {
		System.out.println("피자 반죽과 함께 도우를 만든다..");
	}

	public void bake() {
		System.out.println("180도에서 구워낸다...");
	}

	public void cut() {
		System.out.println("8등분으로 조각낸다...");
	}
	
	public void box() {
		System.out.println("종이 박스에 담는다..");
	}

	public void makePizza() {
		dough();
		topping();
		bake();
		cut();
		box();
	}

	@Override
	public String toString() {
		return storeMaker + "  " + price + " 원";
	}
	
	public abstract void topping();
}
