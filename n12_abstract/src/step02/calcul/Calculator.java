package step02.calcul;

public abstract class Calculator {
	//계산 결과를 출력.
	public void calculate(int a, int b) {
		System.out.println(doCalculation(a, b));
	}
	protected abstract double doCalculation(int a, int b);
}
