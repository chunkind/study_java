package step06;

/**
 * @Auth K. J. S.
 * @Date 2019. 1. 8.
 * switch문 예제
 * break 사용
 * default 사용
 */
public class SwitchExamTest3 {
	public static void main(String[] args) {
		// Math 클래스의 random() 사용해서 1~10까지의 값이 할당
		int score = (int) (Math.random() * 10 + 1);
		System.out.println("Score :: " + score * 10);
		switch (score * 10) {
		case 100:
		case 90:
			System.out.println("A");
			break;
		case 80:
		case 70:
			System.out.println("B");
		case 60:
		case 50:
		case 40:
			System.out.println("C");
			break;
		default:
			System.out.println("Try!!");

		}
	}

}
