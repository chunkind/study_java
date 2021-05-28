package step01;

/**
 * @author ck
 * 쓰레드의 구현 방법.
 * 1. Thread 클래스 상속.
 * 2. Runnable 인터페이스 구현.
 * 쓰레드는 start()로 실행 대기 상태로 올린다음.
 * 차례가 되면 실행이 된다.
 * 한번 실행이 종료된 쓰레드는 다시 실행할 수 없다.
 * 즉, 하나의 쓰레드에 대해 start()가 한 번 만 호출될 수 있다는 뜻.
 */
public class ThreadEx01 {
	public static void main(String args[]) {
		ThreadEx1_1 t1 = new ThreadEx1_1();

		Runnable r  = new ThreadEx1_2();
		Thread   t2 = new Thread(r);	  // 생성자 Thread(Runnable target)

		t1.start();//쓰레드 실행
		t2.start();//쓰레드 실행
	}
}

class ThreadEx1_1 extends Thread {
	public void run() {
		for(int i=0; i < 5; i++) {
			System.out.println(getName()); // 조상인 Thread의 getName()을 호출
		}
	}
}

class ThreadEx1_2 implements Runnable {
	public void run() {
		for(int i=0; i < 5; i++) {
			// Thread.currentThread() - 현재 실행중인 Thread를 반환한다.
		    System.out.println(Thread.currentThread().getName());
		}
	}
}
