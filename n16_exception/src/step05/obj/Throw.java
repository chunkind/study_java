package step05.obj;

public class Throw {
	/*
	 * go()를 수행하던중 예외가 발생... 그런데 바로 해결하지 않고 
	 * 그 폭탄을 던지니... go()를 원래 호출했던 곳에서 폭탄처리를 해라
	 */
	public void go() throws ArithmeticException {
		int i = 0;
		int j = 30;
		System.out.println("OK :: " + i / j);
		System.out.println("폭탄 터질겁니다... 삐뽕1");
		System.out.println("Exception : " + j / i);
	}
}
