package step04;

public class ArrayExamTest5 {
	public static void main(String[] args) {
		int[] number = new int[10];

		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i] = (int) (Math.random() * 10));
		}
		System.out.println();

		for (int i = 0; i < number.length; i++) {
			boolean changed = false; // 자리바꿈이 발생했는지를 체크.

			for (int j = 0; j < number.length - 1 - i; j++) {
				if (number[j] > number[j + i]) { // 옆의 값이 크면 서로 바뀜
					int temp = number[j];
					number[j] = number[j + 1];
					number[j + 1] = temp;
					changed = true; // 자리바꿈이 발생했으니 changed를 true로
				} // end if
			} // end for j
			for (int k = 0; k < number.length; k++)
				System.out.println(number[k]); // 정렬된 결과 출력
			System.out.println();

			if (!changed)
				break; // 자리바꿈이 없으면 반복문을 벗어남
		} // end for i
	}
}
