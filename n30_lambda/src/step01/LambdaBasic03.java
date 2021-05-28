package step01;

public class LambdaBasic03 {
	public static void main(String[] args) {
		MyClass mc = new MyClass();
		MyFunction3 f = () -> System.out.println("myMethod() call..");
		mc.amethod(f);
		mc.amethod(() -> System.out.println("myMethod() call2.."));
	}
}

class MyClass{
	void amethod(MyFunction3 f) {
		f.myMethod3();
	}
}

@FunctionalInterface
interface MyFunction3{
	void myMethod3();
}