package step5;

/**
 * @Auth : ck
 * @Date : Mar 2, 2019
 * Static Initialization Block  :: static 초기화 블럭
 */
public class TestApp {
	static int i;
	public static void main(String[] args) {
		System.out.println("main method static block : "+ i); //0
	}
	/*
	 *  본격적인 서비스 로직이 돌아가기 전에 미리 글로벌 차원에서 
	 *  초기화 해야할 일이 있다면 static block을 이용해서 
	 *  초기화 작업을 수행할수 있다
	 *  그런 다음에 본격적인 로직이 전개되도록 한다.
	 */
	static{
		++i; 
		System.out.println("static initialization block : "+i);
	}
}
