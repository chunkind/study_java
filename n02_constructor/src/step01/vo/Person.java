package step01.vo;

public class Person {
	String name;
	int age;
	String address;

	Car car;

	//public Person(){}

	// this는 해당 클래스 자기자신을 가리키는 키워드
	public Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

}
