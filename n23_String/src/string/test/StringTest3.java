package string.test;
/*
 * String class의 메소드 ::
 * length(), replace(), substring()
 */
public class StringTest3 {
	public static void main(String[] args) {
		System.out.println("======length(), replace(), substring() ======");
		String str = "김연아";
		
		System.out.println("str의 문자열의 길이 : "+str.length());
		
		//아-->경
		String str2 = str.replace('아', '경');
		System.out.println("김연아의 아->경으로 변경 : "+str2);
		
		//연경만 추출해서 출력되도록
		String str3= str2.substring(1, 3);
		System.out.println("연경만 추출해서 출력함 : "+str3);
		//결과적으로 str,str2,str3 객체가 계속 생성된 것이고 str은 변함이 없었다
		System.out.println(str);
		
		System.out.println("\n======trim() : 문자열의 앞뒤 공백을 제거======");
		//가운데 공백을 주느냐 안주느냐의 여부에따라 s1과 s2,s3를 구분했다
		String s1 = "제임스고슬링";
		String s2 = "  제임스  고슬링";
		String s3 = "제임스  고슬링  ";
		if(s1.equals(s2))
			System.out.println("1. Same Data?");
		if(s1.equals(s2.trim()))
			System.out.println("2. trim() 사용후 : Same Data?");
		if(s1.equals(s3.trim()))
			System.out.println("3. trim() 사용후 : Same Data?");
		if(s2.trim().equals(s3.trim()))
			System.out.println("4. trim() 사용후 : Same Data?");
		
		System.out.println("\n====가운데 공백은 어떻게 제거할까여?=======");
		/*String[ ] s4 = s2.split("  ");
		String trimS = "";
		for(int i=0; i<s4.length; i++){
			trimS += s4[i];
		}
		System.out.println(trimS);*/
		
		/*String trimS = s2.trim();
		String ts1 =trimS.substring(0, 3);
		String ts2 =trimS.substring(5, 8);
		System.out.println(ts1.concat(ts2));*/
		
		String trimS = s2.replace("  ", "");
		System.out.println(trimS);
	}
}












