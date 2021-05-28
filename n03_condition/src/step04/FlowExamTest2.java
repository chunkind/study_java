package step04;

import java.util.Scanner;

/**
 * @Auth: chunkind@naver.com
 * @Date: 2021. 05. 28.
 *
 * 90점 이상일때 A이고
 * 98점 이상 이면 +를 붙이고 94점이하면 -를 붙여라
 * 80점 이상일때 B이고
 * 88점 이상 이면 +를 붙이고 84점이하면 -를 붙여라
 * 그외 나머지는 C (이중 if를 사용하여 작성)
 *
 */
public class FlowExamTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("======당신의 점수 입니다======");
		int score = sc.nextInt();
		String grade = " ";
		if (score >= 90) {
			grade = "A";
			if (score >= 98)
				grade += "+";
			else if (score < 94)
				grade += "-";
		} else if (score >= 80) {
			grade = "B";
			if (score >= 88)
				grade += "+";
			else if (score < 84)
				grade += "-";
		} else
			grade = "c";
		System.out.println("당신의 학점은" + grade + "입니다");
	}
}