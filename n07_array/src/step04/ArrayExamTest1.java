package step04;

public class ArrayExamTest1 {
	public static void main(String[] args) {
		int[] score = { 79, 88, 91, 33, 100, 55, 95 };

		int maxV = getMax(score);
		int minV = getMin(score);

		System.out.println(maxV);
		System.out.println(minV);
	}

	public static int getMax(int[] a) {
		int temp = a[0];
		for (int i = 1; i < a.length; i++) {
			if (temp < a[i]) {
				temp = a[i];
			}
		}
		return temp;
	}

	public static int getMin(int[] a) {
		int temp = a[0];
		for (int i = 1; i < a.length; i++) {
			if (temp > a[i]) {
				temp = a[i];
			}
		}
		return temp;
	}

}

/*
 * public class ArrayExamTest1 { public static void main(String[] args) {
 * int[]score = {79, 88, 91, 33, 100, 55, 95}; // 향상된 for문 ,,, -> 뭐가 어디서 도는가..?
 * for(int i : score){ System.out.print(i+", "); }
 * 
 * int max = score[0]; // 79 int min = score[0]; // 79
 * 
 * for(int i=1; i<score.length; i++){ if(score[i]>max) max = score[i]; //최대값 구하는
 * 방법론. if(score[i]<min) min = score[i]; //최소값 구하는 방법론. }
 * 
 * System.out.println("\n" + " Max Score :: " + max + "점.");
 * System.out.println(" Min Score :: " + min + "점."); } }
 */