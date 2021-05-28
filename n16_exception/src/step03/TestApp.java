package step03;

/**
 * @Auth : ck
 * @Date : Mar 2, 2019
 * Runtime 계열의 Exception 
 * ArrayIndexOutOfBoundsException  :: 배열의 인덱스 지정이 잘못됬을 경우 발생
 * NullPointerException :: 객체 생성하지 않고 접근했을 경우 발생
 * 
 * 1) catch 블락은 여러개 쓸수 있다 
 *       이때 발생한 예외 클래스로 정확히 잡아줘야 하고 그 블럭만 수행된다.
 * 2) Exception으로도 예외는 잡혀진다.
 *       아무리 잘 잡더라도 처음에 잡은 catch구문이 돌아간다.
 *       catch가 여러번 나오더라도 해당 예외를 잡는 것은 하나의 catch문이다
 * 3) 예외를 잡을때는 작은거 ---> 큰 순으로 가야함.       
 */
public class TestApp {
	public static void main(String[] args) {
		System.out.println("======== NullPointerException ========");
		String str = new String("Kosta");
		str = null;
		try{
			System.out.println("str의 길이 : " +str.length());
			System.out.println("str의 주소값 : " +str.toString()); //Overriding
		}catch(NullPointerException e){
			System.out.println("잡았따..");
		}catch(Exception e){  //두개 다 잡힌다 
			System.out.println("잡았다2");
		}
	}
}
