package step09.exception;

public class InvaildOutputException extends Exception {
	public InvaildOutputException() {
		this("잔액보다 더 많이 출금 불가능 !! ");
	}
	public InvaildOutputException(String message) {
		super(message);
	}
}