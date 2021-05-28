package step01.vo;

public class Car {
	String model;
	int price;
	String color;
	Engine engine;

	public Car(String model, int price, String color, Engine engine) {
		this.model = model;
		this.price = price;
		this.color = color;
		this.engine = engine;
	}

	public String getModel() {
		return model;
	}

	public int getPrice() {
		return price;
	}

	public String getColor() {
		return color;
	}

	public String getCar() {
		return model + "  " + price + "  " + color;
	}

	public String getEngine() {
		return engine.speed + ", " + engine.rpm;
	}

}