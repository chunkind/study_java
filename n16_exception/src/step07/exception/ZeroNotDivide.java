package step07.exception;

public class ZeroNotDivide extends Exception {
	// 생성자 앞에 super, this 키워드를 사용해서 완벽한 클래스로 다시 작성
	public ZeroNotDivide() {
		this("분모가 0이면 안되여!!");
	}
	public ZeroNotDivide(String message) {
		super(message); // Exception(String message);
	}
}
