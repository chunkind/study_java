package string.test;

import java.util.StringTokenizer;

public class StringTokenizerTest5 {
	public static void main(String[] args) {
		String str = "오늘은 많이 지쳐 보이십니다...어제 혹시 달리셨나여?";
		StringTokenizer st = new StringTokenizer(str);
		
		//while문 돌면서 공백을 기준으로 한줄씩 출력되도록..
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}//
		
		System.out.println("==========================================");
		String str2 = "스마일쿡/냉면/집밥/순대국밥/삼계탕/김밥";
		StringTokenizer st2 = new StringTokenizer(str2);
		while(st2.hasMoreTokens()){
			System.out.print(st2.nextToken("/")+" ");
		}
	}
}
















