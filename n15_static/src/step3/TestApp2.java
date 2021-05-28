package step3;

class Car{
	int serialNumber; //field
    static int counter; //static V
    
    Car(){
    	 counter++;
    	 serialNumber =counter;
    }
}
public class TestApp2 {
	public static void main(String[] args) {
		Car c1 =new Car();
		Car c2 =new Car();
		Car c3 =new Car();
		System.out.println("====== non- static Variable======");  //Member 변수 : 각각의 값을 가진다 
		System.out.println(c1.serialNumber); // 1
		System.out.println(c2.serialNumber); //2
		System.out.println(c3.serialNumber);//3
		
		System.out.println(" ");
		System.out.println("====== static Variable======"); //전역 변수 : 생성된 객체들 수만큼 값이 출력됨.
		System.out.println(c1.counter);  //3
		System.out.println(c2.counter); //3
		System.out.println(c3.counter); //3
		System.out.println(Car.counter); //3 
	}

}