package step08;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class NewLambda {
	public static void main(String[] args) {
		int j = MyUtil.strToInt("10");
		System.out.println(j);
		
//		Function<String, Integer> f = (String s) -> Integer.parseInt(s);
		Function<String, Integer> f = Integer::parseInt; //메서드 참조
		int i = f.apply("10");
		System.out.println(i);
		
//		BiFunction<String, String, Boolean> bif = (s1, s2) -> s1.equals(s2);
		BiFunction<String, String, Boolean> bif = String::equals;
		boolean b = bif.apply("김", "김");
		System.out.println(b);
		
		//참조변수 메서드 참조
		MyUtil myUtil = new MyUtil();
		Function<String, Boolean> bif2 = myUtil::equals;
		
		//생성자의 메서드 참조
//		Supplier<MyUtil> s = () -> new MyUtil();
		Supplier<MyUtil> s = MyUtil::new;
		MyUtil mu = s.get();
		
		
	}
}

class MyUtil{
	static Integer strToInt(String s) {
		return Integer.parseInt(s);
	}
}