package step04;

public class ArrayExamTest2 {
	public static void main(String[] args) {
		int[] score = { 79, 88, 91, 33, 100, 55, 95 };
		// 향상된 for문. 뭐가 어디서 도는가?
		int max = score[0];
		int min = score[0];

		for (int i : score) {
			if (i > max) {
				max = i;
			} else if (i < min) {
				min = i;
			}
		}

		for (int i = 1; i < score.length; i++) {
			if (score[i] > max) {
				max = score[i];
			} else if (score[i] < min) {
				min = score[i];
			}
		}
		System.out.println(max + " " + min);

	}
}
