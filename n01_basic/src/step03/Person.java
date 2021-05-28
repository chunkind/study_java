package step03;

class Person{
	// 변수의 선언 + 값의 할당 (초기화 = 새로운 값.)
	String name = "김준성";	// 변수, variable | 값, value	
	/*
	int age;
	age = 33;
	*/
	int age = 25;	
	String address = "여의도";
	
	// 해당 클래스를 통해서 할수 있는 기능. method
	public void getDetails(){
		System.out.println(name + " " + age + " " + address);

	}
}
