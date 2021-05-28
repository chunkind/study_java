package step05;

import java.util.Scanner;

/*
 * scanner사용법, while(true), break..
 * 잘 봐뒀다가 나중에 project 작은거 하나 만들때 scanner를 잘 활용
 */
public class ScannerBreakSelfTest {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("-------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4종료");
			System.out.println("-------------------------------------");
			System.out.println("선택>");

			int menuNum = sc.nextInt(); // 1~4중의 숫자가 할당
			switch (menuNum) {
			case 1:
				System.out.println("예금액>");
				balance += sc.nextInt();
				break;
			case 2:
				System.out.println("출금>");
				balance -= sc.nextInt();
				break;
			case 3:
				System.out.println("잔고> ");
				System.out.println(balance);
				break;
			case 4:
				run = false;
				System.out.println("프로그램을 종료합니다");
				System.exit(0);
				break;
			}// switch
		} // while
	}// main
}// class
