package step02;

/**
 * @author ck
 * 이전 예제와 달리 쓰레드가 새로 생성되지 않았다.
 * 그저 ThreadEx3_1 클래스의 run()이 호출되었을 뿐이다.
 */
public class ThreadEx03 {
	public static void main(String args[]) throws Exception {
		ThreadEx3_1 t1 = new ThreadEx3_1();
		t1.run();
	}
}

class ThreadEx3_1 extends Thread {
	public void run() {
		throwException();
	}

	public void throwException() {
		try {
			throw new Exception();		
		} catch(Exception e) {
			e.printStackTrace();	
		}
	}
}
