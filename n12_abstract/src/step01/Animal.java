package step01;

//1.추상메서드를 만든다.
//2.abstract를 class앞에 붙인다.
public abstract class Animal {
	public void doAction() {
		System.out.println(crying());
	}
	public abstract String crying();
}

class Cat extends Animal{
	@Override
	public String crying() {
		return "야옹";
	}
}

class Dog extends Animal{
	@Override
	public String crying() {
		return "멍멍";
	}
}

class Man extends Animal{
	@Override
	public String crying() {
		return "엉엉";
	}
}