package step02;

/**
 * @author ck
 * 예외 발생이 첫 부분이 main이 아니라 run이라는 점에 주의하자.
 * main이 호출스택에 없는 이유는 정상적으로 종료 되었기 때문이다.
 */
public class ThreadEx02 {
	public static void main(String args[]) throws Exception {
		ThreadEx2_1 t1 = new ThreadEx2_1();
		t1.start();
	}
}

class ThreadEx2_1 extends Thread {
	public void run() {
		throwException();
	}

	public void throwException() {
		try {
			throw new Exception();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
