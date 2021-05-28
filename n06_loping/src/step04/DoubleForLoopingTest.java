package step04;

public class DoubleForLoopingTest {
	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(j + "\t"); // print : 옆으로 출력
			}
			System.out.println(" ");
		}
	}
}