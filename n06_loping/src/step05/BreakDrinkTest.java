package step05;

/*
 * for문에 로컬변수를 beer로 하나 선언.
 * 맥주는 50병까지 계속 마실수 있다.
 * 그런데 자신의 치사량이 10병이라 하면 
 * 10병이 되는 순간 break를 반복문을 빠져나가는 로직을 작성..
 * 빠져나가서는 집에 가자~~~를 출력
 */
public class BreakDrinkTest {
	public static void main(String[] args) {
		for (int beer = 1; beer <= 50; beer++) {
			System.out.println("맥주" + beer + "잔 마심...");
			if (beer == 10) {
				System.out.println("죽는다..." + beer + "잔 치사량임!!");
				break; // 반복문을 빠져나간다.. 17라인을 빠져나간다
			}
		} // for
		System.out.println("집에 가자~~~~");
	}
}