package step05;

import step05.obj.Throw;

/**
 * @Auth : ck
 * @Date : Mar 2, 2019
 * 예외 처리 방법 ::
 * 1) try ~catch    - 예외를 그 자리에서 즉각적으로 처리
 * 2) throws - 예외를 즉각적으로 처리하지 않고 던지는 방법
 */
public class TestApp {
	public static void main(String[] args) {
		Throw th = new Throw();
		System.out.println("이곳에서 폭탄처리 준비중입니다... 삐뽕2");
		try {
			th.go(); // 이리로 날라온다...
		} catch (ArithmeticException e) {
			System.out.println("잡은건가....");
		}
		System.out.println("끝난건가... 삐뽕3");
	}
}
