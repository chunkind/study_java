package step16.exception;

public class CommonException extends Exception{

	public CommonException(String msg) {
		super(msg);
	}
	
	public CommonException(String msg, Throwable cause) {
		super(msg, cause);
	}
	
	public CommonException(Throwable cause) {
		super(cause);
	}
	
}
