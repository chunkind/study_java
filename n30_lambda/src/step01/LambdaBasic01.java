package step01;

public class LambdaBasic01 {
	public static void main(String[] args) {
		//class java
		MyMath math = new MyMath();
		System.out.println(math.max(2, 4));
		
		//clasic java interface
		MyFunction f1 = new MyFunction() {
			@Override
			public int max(int a, int b) {
				return a > b ? a : b;
			}
		};
		System.out.println(f1.max(2, 4));
		
		//morden java(Lambda)
		MyFunction f2 = (int a, int b) -> a > b ? a : b;
		System.out.println(f2.max(2, 4));
	}
}

class MyMath{
	//clasic java
	int max(int a, int b) {
		return a > b ? a : b;
	}
}

/**
 * @Auth : K. J. S.
 * @Date : 2019. 3. 28.
 * 오직 하나의 추상메서드만 존재 가능하다.
 */
@FunctionalInterface
interface MyFunction{
	int max(int a, int b);
}
