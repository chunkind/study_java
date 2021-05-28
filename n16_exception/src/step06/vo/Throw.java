package step06.vo;

public class Throw {
	public void go() {
		int i = 0;
		int j = 30;
		if (i == 0) {
			// 폭탄을 터뜨린다..
			throw new ArithmeticException();
		}
	}
}
