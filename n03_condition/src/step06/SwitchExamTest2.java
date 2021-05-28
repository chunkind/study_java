package step06;

/**
 * @Auth K. J. S.
 * @Date 2019. 1. 8.
 * switch문 예제
 * break 사용
 */
public class SwitchExamTest2 {
	public static void main(String[] args) {
		int score = (int) (Math.random() * 10) + 1;
		String msg = " ";
		score *= 100;
		msg = "당신의 점수는 " + score + "이고, 상품은";
		switch (score) {
		case 1000:
			msg += "냉장고, ";
		case 900:
			msg += "TV,";
		case 800:
			msg += "라디오,";
		}
	}
}