package step01;

/**
 * @Auth K. J. S.
 * @Date 2019. 1. 8.
 * if문 사용 예제
 */
public class BasicIF {
	public static void main(String[] args) {
		int va = 100; // 변수 선언과 초기화
		if (va == 100) {
			System.out.println("va 변수에 할당된 값은 100!!");
			// va가 100이 아니라면 이라는 조건문
		} else if (va != 100) { // != 아니다라는뜻
			System.out.println("va 변수에 할당된 값은 100이 아님!!");
		}
	}
}