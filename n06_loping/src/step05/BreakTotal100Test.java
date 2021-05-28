package step05;

/*
 * while문을 이용
 * 무한루핑을 돌면서 1씩 증가시킬 것.
 * 증가된 값들이 계속 합산되어져서 합산값이 100이 됬을때
 * 반복문을 빠져나오도록
 * 그때 최종적으로 합산된 값을 출력..
 */
public class BreakTotal100Test {
	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		while (true) {
			sum += num;
			++num;

			if (sum > 100) {
				System.out.println("최종적으로 합산된 값 : : " + sum);
				break;
			} //
		}
	}
}