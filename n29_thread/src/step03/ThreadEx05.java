package step03;

/**
 * @author ck
 * 
 */
public class ThreadEx05 {
	static long startTime = 0;

	public static void main(String args[]) {
		ThreadEx5_1 th1 = new ThreadEx5_1();
		th1.start();
		startTime = System.currentTimeMillis();

		for (int i = 0; i < 300; i++) {
			System.out.print("-");
		}

		System.out.println();
		System.out.print("소요시간1:" + (System.currentTimeMillis() - ThreadEx05.startTime));
		System.out.println();
	}
}

class ThreadEx5_1 extends Thread {
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print("|");
		}
		System.out.println();
		System.out.print("소요시간2:" + (System.currentTimeMillis() - ThreadEx05.startTime));
		System.out.println();
	}
}
