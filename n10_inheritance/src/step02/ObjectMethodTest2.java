package step02;

/**
 * @Auth K. J. S.
 * @Date 2019. 1. 4.
 * String 객체의 동등, 동일 비교
 * 
 *                            Object         |         String
 * equal()		:  객체의 주소값 비교(동등비교)  | 객체의 데이터값 비교
 * toString()	:  객체의 주소값 출력          | 객체의 데이타값 출력
 */
public class ObjectMethodTest2 {
     public static void main(String[] args) {
		//1. String class 에서의 equals(), toString()
		String s1 = new String("Kosta"); //다른 객체
		String s2 = new String("Kosta");
		 
		System.out.println("s1의 주소값 : : " + s1.toString());
		System.out.println("s2의 주소값 : : " + s2.toString());
		System.out.println(s1.equals(s2)); // true (동등비교) 
		System.out.println(s1 == s2); // false (동일비교)
		 
		System.out.println("s1 = s2 ");
		s1 = s2; // 이부분 때문에 서로 같은 주소값을 가지며... 같은 객체를 가르킨다
		System.out.println("s1 :: " + s1);
		System.out.println("s2 :: " + s2);
		System.out.println(s1.equals(s2)); // true.. 주소값
		System.out.println(s1 == s2); // true.. 주소값
	}
}