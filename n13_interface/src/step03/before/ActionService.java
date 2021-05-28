package step03.before;

public class ActionService {
	public void doAction(String temp) {
		if(temp.equals("cat")) {
			Cat cat = new Cat();
			cat.cring();
		}else if(temp.equals("dog")) {
			Dog dog = new Dog();
			dog.bark();
		}else if(temp.equals("man")) {
			Man man = new Man();
			man.say();
		}
	}
}
