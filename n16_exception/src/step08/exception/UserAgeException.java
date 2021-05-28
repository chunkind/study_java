package step08.exception;

public class UserAgeException extends Exception {
	public UserAgeException() {
		this("당신은 성인영화를 관람할수 없습니다..");
	}
	public UserAgeException(String message) {
		super(message);
	}
}
