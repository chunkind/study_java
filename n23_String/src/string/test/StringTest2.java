package string.test;
public class StringTest2 {
	public static void main(String[] args) {
		//String 클래스는 객체생성 방법이 두 가지가 있다.
		//String 클래스 객체를 4개 생성했다.
		String s1=  "김연아";
		String s2 = new String("김연아");
		String s3 = new String("김연아");
		String s4=  "김연아";
		
		//String 에서의 equals()는 문자열비교로 기능이 재정의됬다.
		System.out.println("같은 객체? "+s2.equals(s3)); //true
		System.out.println("같은 객체? "+s1.equals(s2)); //true
		
		//String 에서 같은 객체인지 아닌지의 비교는 뭘로 할까?
		System.out.println(s2 == s3); //false
		
		//Literal Pool에 저장되기에 로컬변수처럼 다뤄진다.
		//즉, 변수에 값이 바로 저장되는 형태로 이해하자
		System.out.println(s1 == s4); //true
		System.out.println(s1 == s2); //false
	}
}










