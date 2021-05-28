package string.test; 
/*
 * 데이타의 조작이 빈번할 경우 
 * 그때마다 문자열이 변경되면 메모리 효율성이 저하된다.
 * 이때 스트링값을 가진 StringBuffer 객체를 생성하고
 * 문자열을 빈번하게 변경할수 있다.
 * 최종적으로 문자열이 변경된 후에는 다시 String으로 돌려 놓는데..
 * 이때 StringBuffer에 있는 toString()을 사용한다.
 */
public class StringBufferTest6 {
	public static void main(String[] args) {
		String str = new String("This is ");
		String str1 = str.concat("test"); //This is test
		System.out.println(str);//This is
		System.out.println(str1);//This is
		System.out.println("============ StringBuffer ============");
		
		StringBuffer sb = new StringBuffer(str);//This is
		sb.append("test");
		System.out.println(sb);//This is test
		
		//This is StringBuffer test
		System.out.println(sb.insert(8, "StringBuffer "));
		
		//tset reffuBgnirtS si sihT
		System.out.println(sb.reverse());
		
		//!set reffuBgnirtS si sihT
		sb.setCharAt(0, '!');
		System.out.println(sb);
		
		System.out.println(sb.reverse());
		System.out.println(sb);
		
		//다시 String 으로 돌린다.
		String s = sb.toString();
		System.out.println(s);
		
		s.concat("test2");
		System.out.println(s);
	}
}










