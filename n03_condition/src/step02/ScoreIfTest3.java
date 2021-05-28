package step02;

import java.util.Scanner;

/**
 * @Auth K. J. S.
 * @Date 2019. 1. 8.
 * 콘솔창으로 입력값을 할당받을려면
 * 1. Scanner 클래스를 생성하고
 * 2. Scanner 클래스의 기능을 이용해야 함
 * 콘솔 창에 점수와 이름을 임의로 입력
 */
public class ScoreIfTest3 {
	// main 생성 방법 : void가 리턴 타입 인자가 String[]으로 제약
	public static void main(String[] args) {
		// int score = 78;
		/*
		 * int score = Integer.parseInt(args[0]); //형변환이 안맞아서 String name =
		 * args[1];
		 */ // ctrl + shift + 슬래시 : 주석처리 방법
		// 키보드로 입력한 값을 읽어들이는 Scanner..Constructor Summary를 잘 봐야한다.
		Scanner sc = new Scanner(System.in);
		System.out.println("score , name을 각각 입력하세요...\n");
		int score = sc.nextInt();
		String name = sc.nextLine();
		if (score >= 90 && score <= 100) {
			System.out.println(name + " A 학점을 드립니다");
		} else if (score >= 80 && score < 90) {
			System.out.println(name + "B 학점을 드립니다");
		} else if (score >= 70 && score < 80) {
			System.out.println(name + "C 학점을 드립니다");
		} else {
			System.out.println("Try Again");
		}

	}
}