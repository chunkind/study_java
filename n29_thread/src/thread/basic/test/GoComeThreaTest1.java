package thread.basic.test;
/*
 * Thread의 기본적인 작성 방법과 메카니즘을 정리할수 있는 코드
 * 두개의 쓰레드를 작성 : GoThread / ComeThread
 * Thread 작성 방법으로서는 Thread를 상솟받아서 작성
 */
class GoThread extends Thread {
	int i = 0;

	// Thread가 실질적으로 구동되는 부분
	public void run() {
		while (true) {
			System.out.println("GoThread : " + i++);
			if (i == 50)
				break;
		}
		System.out.println(Thread.currentThread().getName() + "의 Priority :  " + getPriority());
	}
}//

class ComeThread extends Thread {
	int j = 0;

	public void run() {
		while (true) {
			System.out.println("ComeThread : " + j++);
			if (j == 20)
				break;
		}
	}
}

public class GoComeThreaTest1 {
	public static void main(String[] args) {
		// 1. Thread 생성
		GoThread go = new GoThread();
		ComeThread come = new ComeThread();

		// 2. start() 호출
		go.start();
		come.start();
	}
}

