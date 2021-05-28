package thread.shared3.test;
/*
 * Thread들은 Process의 자원을 서로 공유하면서 돌아간다는 의미를 
 * 알 수 있는 로직을 작성.
 */
class Calculator{
	private int memory;

	public int getMemory() {
		return memory;
	}
	public  synchronized void setMemory(int memory) { 
		this.memory = memory; //100
		try{
			Thread.sleep(2000);
		}catch(InterruptedException e){ 
			}//catch
		System.out.println(Thread.currentThread().getName()+" : "+ memory);
	}
}
//
class User1 extends Thread{
			Calculator calculator;

			public void setCalculator(Calculator calculator) {  //setter 통해 hasing 
				setName("CalculatorUser1");  //thread 이름 지정
				this.calculator = calculator;
			}
			public void run(){
				calculator.setMemory(100);
			}
}
class User2 extends Thread{
	Calculator calculator1;

	public void setCalculator(Calculator calculator) {  //setter 통해 hasing 
		setName("CalculatorUser2");  //thread 이름 지정
		this.calculator1 = calculator;
	}
	public void run(){
		calculator1.setMemory(50);
	}
}
public class SharedMemoryTest1 {
	public static void main(String[] args) {
				Calculator cc = new Calculator();
			
				
				User1 user1 = new User1();
				User2 user2 = new User2();
				user1.setCalculator(cc);
				user2.setCalculator(cc);
				user1.start();
				user2.start();
				
				

	}
}



