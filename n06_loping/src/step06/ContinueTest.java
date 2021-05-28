package step06;

public class ContinueTest {
	public static void main(String[] args) {
		for (int i = 0; i <= 11; i++) {
			if (i % 2 == 0) {
				continue;
			} // if
			System.out.println(i);
		}
	}
}