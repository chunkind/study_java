package step01;

class Test1 {
	String name;
	int age;

	Test1(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String gettest() {
		return name + " " + age;
	}
}

class Operator1 {
	public boolean test1() {
		System.out.println("test1() calling...");
		return true;
	}

	public boolean test2() {
		System.out.println("test2() calling...");
		return false;
	}
}

public class TestApp{
	public static void main(String[] args) {
        Test1 test1 = new Test1("수지", 25); 
        Test1 test2 = new Test1("아이유",24);
        
        if(test1 == test2)
        	System.out.println("서로 같은 Object...");
        else
        	System.out.println("서로 다른 Object...");
	}
}