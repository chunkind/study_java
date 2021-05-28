package step08;

import step08.exception.UserAgeException;
import step08.vo.AdultMovie;

/**
 * @Auth : ck
 * @Date : Mar 2, 2019
 * 사용자정의 Exception은 프로그램 흐름을 제어하는
 * 강력한 제어문으로 사용될수 있따
 * 그에 해당하는 로직을 작성해 보겠다
 * ::
 * 19세 미만의 나이가 영화를 관람하면 입장이 안되도록 로직을 작성
 * 이때 사용자정의 Exception을 정의하자.. UserAgeException
 */
public class TestApp {
	public static void main(String[] args) {
		AdultMovie movie = new AdultMovie();
		try {
			movie.enter(34);
		} catch (UserAgeException e) {
			System.out.println(e.getMessage());
		}

	}
}
