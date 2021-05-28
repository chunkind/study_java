package step01.parent;

public class Animal {
	public String kind;
	public int weight;
	public char gender;

	public void eat() {
		System.out.println("eat....");
	}

	public String sleep(int hour) {
		return "zzzz....";
	}
}