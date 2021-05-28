package step03;

/*
 * String 객체와 equals()와의 관계
 */
public class StringEqualsTest2 {
	public static void main(String[] args) {
		String s1 = "hello world!";
		String s2 = "hello world!";
		String s3 = new String("hello world!");
		String s4 = new String("hello world!"); // new 안붙이면 바로 값비교

		System.out.println(s1.equals(s2));
		System.out.println(s3 == s4);
		System.out.println(s1 == s2);
		// String 클래스에서 equals()는 데이타 비교를 바로 한다 / 주소값 비교가 아니라
		System.out.println(s3.equals(s4));
	}
}
