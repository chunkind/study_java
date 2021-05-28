package step01;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaBasic02 {
	public static void main(String[] args) {
		//정렬~
		List<String> list1 = Arrays.asList("abc", "aaa", "bbb", "ddd", "aaa");
		Collections.sort(list1, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s2.compareTo(s1);
			}
		});
		System.out.println(list1);
		
		//정렬~
		List<String> list2 = Arrays.asList("abc", "aaa", "bbb", "ddd", "aaa");
		Collections.sort(list2, (s1, s2) -> s2.compareTo(s1));
		System.out.println(list2);
		
	}
}
