package step05;

/*
 * while문 사용...
 * 무한루핑 for ( ; ; ) / while(true) - 이 경우의 무한루핑을 사용
 * 주사위를 무작위로 돌릴경우를 로직으로 작성  : : Math.random()
 * 숫자가 무작위로 나올때... 6이라는 숫자가 나오면 반복문을 빠져나오도록
 * 프로그램을 종료합니다...를 출력
 */
public class BreakDiceTest {
	public static void main(String[] args) {
		while (true) {
			int num = (int) (Math.random() * 6 + 1);
			System.out.println("Dice Number Value : " + num);
			if (num == 6) {
				System.out.println("6은 마지막 숫자이어야 합니다...");
				break;
			}
		} //
		System.out.println("프로그램을 종료합니다");
	}
}