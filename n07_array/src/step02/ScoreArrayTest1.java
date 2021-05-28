package step02;

/*
 * 5명의 학생들의 성적을 배열에 저장
 * 성적의 총점, 평균
 */
public class ScoreArrayTest1 {
	public static void main(String[] args) {
		int sum = 0;
		int avg = 0;
		int[] scores = { 90, 88, 76, 94, 80 };
		// 1.각각 학생들의 성적을 먼저 출력

		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + " ");
		}

		// 2.for문을 이용해서 학생들의 총점 출력
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println(" ");
		System.out.println("===== 학생들의 총점 =====");
		System.out.print(" 총점" + sum);

		// 3.총점을 이용해서 학생들의 평균을 출력
		avg = sum / scores.length;
		System.out.println("학생들 평균 :: " + avg);

		// 4.평균 이하의 성적을 받은 학생들 성적을 출력하고 / 인원수를 출력
		int cnt = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] <= avg) {
				cnt++; //
				System.out.print("평균 이하 점수 : " + scores[i] + " ");
			} // if
		} // for
		System.out.print("평균이하의 성적을 받은 학생수" + cnt + "명");

	}
}