package step09.exception;

public class AmountInputException extends Exception {
	public AmountInputException() {
		this("1000원 이상 입금하지 않으면 입금 못함..");
	}
	public AmountInputException(String message) {
		super(message);
	}
}