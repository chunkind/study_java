package step05;

public class AdvancedForTest1 {
	public static void main(String[] args) {
		int score[] = { 95, 77, 88, 92, 78 };
		int sum = 0;

		// 향상된 for를 이용해서 성적들의 총점을 구하자.
		for (int i : score)
			sum += i;

		System.out.println("총점 :: " + sum);
		System.out.println("평균 :: " + sum / score.length);
	}
}
