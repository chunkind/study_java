package step02;

/**
 * @Auth : ck
 * @Date : Mar 2, 2019
 * 
 * Exception :: 프로그램상에서 잡을수 있는 에러
 * 1.Compile Exception
 * 2.Runtime Exception
 * error :: 프로그램상에서 잡을수 없는 에러
 * 1.OutOfMemoryError
 * 2.StackOverflowError
 * 
 * 					Object
 *                     |
 *                 Throwable
 *                     |
 *       Exception                                                  Error
 *  IOException, ClassNotFoundException, RuntimeException            Outof.....
 * 
 * Exception은 2개로 나뉠수 있다.
 * 프로그램 기동전에 알수 있는 checked Exception
 * 프로그램 기동후에 알수 있는 Runtime Exception
 * 
 * Runtime 계열의 Exception 
 * ArrayIndexOutOfBoundsException  :: 배열의 인덱스 지정이 잘못됬을 경우 발생
 * NullPointerException :: 객체 생성하지 않고 접근했을 경우 발생
 * 
 * Runtime 계열의 Exception
 * ArithmeticException
 * 분모를 0으로 나누려 할때 발생...
 */
public class TestApp {
	public static void main(String[] args) {
		runtimeException1();
		runtimeException2();
	}
	
	public static void runtimeException1(){
		System.out.println("======== NullPointerException ========");
		String str = new String("Kosta");
		str = null;
		try{
			System.out.println("str의 길이 : " + str.length());
			System.out.println("str의 주소값 : " + str.toString());//Overriding
		}catch(NullPointerException e){
			System.out.println("잡았따..");
		}
	}
	public static void runtimeException2() {
		System.out.println("==========  ArithmeticException  ========");
		int i =0;
		int j =10;
	  	try{
	  		System.out.println(j/i);
	  	}catch(ArithmeticException e){
	  		System.out.println("분모가 0이면 안됨");
	  	}finally{
	  		System.out.println("Always Print....");
	  	}
	}
	
}