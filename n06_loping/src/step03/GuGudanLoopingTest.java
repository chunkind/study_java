package step03;

public class GuGudanLoopingTest {
	public static void main(String[] args) {
		System.out.println("====== GuGudan Using for ====== ");
		for (int i = 2; i <= 9; i++) {
			System.out.println("\n" + i + "단");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + " = " + i * j);

			}

		}

		System.out.println("====== GuGudan Using while ====== ");
		int i = 2;
		while (i <= 9) {
			int j = 1;
			System.out.println("\n" + i + "단");
			while (j <= 9) {
				System.out.println(i + "*" + j + " = " + i * j);
				j++;
			}
			i++;
		}
	}
}