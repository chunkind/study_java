package step16;

public class ThreadTest {
//	public static int count = 0;
	public static volatile int count = 0;
	public static void main(String[] args) {
		T1 t1 = new T1();
		T2 t2 = new T2();
		t1.start();
		t2.start();
	}
}

class T1 extends Thread{
	@Override
	public void run() {
		while(true) {
			try {
				ThreadTest.count++;
				System.out.println("+ : " + ThreadTest.count);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class T2 extends Thread{
	@Override
	public void run() {
		while(true) {
			try {
				ThreadTest.count--;
				System.out.println("- : " + ThreadTest.count);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}