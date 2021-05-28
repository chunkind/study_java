package step01;

public class BasicLoopingTest {
	public static void main(String[] args) {
		// for Test
		System.out.println("====== for test ======");
		for (int i = 1; i < 10; i++) {
			System.out.println("Hello For Test...");
		}

		// While
		System.out.println("\n====== While test =====");
		int i = 10;
		while (i > 0) {
			System.out.println("Hello While Test...");
			i--;
		}

		System.out.println("\n====== do While test ======");
		int j = 0;
		do { // 이 부분은 반드시 한번은 실행
			System.out.println(j + " Always Print...");
			j++;
		} while (j < 10);

	}
}