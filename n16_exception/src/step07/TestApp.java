package step07;

import step07.exception.ZeroNotDivide;
import step07.vo.User;

/**
 * @Auth : ck
 * @Date : Mar 2, 2019
 * 사용자 정의 Exception ::
 * 1. 특정한 조건이 만족될때 고의적으로 Exception을 내가 발생시키는것
 * (Exception 객체를 생성. 이때 new 앞에 throw사용)
 * 2. Exception api를 사용하는 것이 아니라 
 * 상속받아서 내가 직접 Exception 클래스를 정의해서 사용하는 것         
 * 굉장히 중요한 코드                                                
 */
public class TestApp {
	public static void main(String[] args) {
		User user = new User();
		System.out.println("폭탄이 이리로 날라옵니다...");
		try {
			user.go();
		} catch (ZeroNotDivide e) {
			System.out.println(e.getMessage());
		}
		System.out.println("사제폭탄 처리 끝...");
	}
}
