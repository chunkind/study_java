package step2;

/**
 * @Auth : K. J. S.
 * @Data : 2019. 03. 02.
 * 해당소스는 static은 static끼리 통한다..는 의미를 알수 있는 코드
 * static 블럭안에서는 this를 사용하지 못한다.
 */
public class TestApp {  //식구 한명 
	int i = 10;  //field
	static int j = 20;  //static V, Class V, 전역 V
	 
	public void test(){ 
		System.out.println("member V ::" + i); //10
		System.out.println("static V ::" + TestApp.j);
		System.out.println("static V ::" + j); //20
		 
		TestApp test2 = new TestApp();
		System.out.println("member V :: " + test2.i);
	}
	/*
	 * 메모리에 없는 i가 static에 관련되어 있기 때문에 
	 * 즉  static은 static끼리 같이 어울린다... 
	 * non - static 변수를 접근할려면 객체 생성(메모리 올리고)하고 접근해야 한다
	 */
	public static void test2(){
		//에러.... non-static은 객체생성을 하고 접근해야한다.
//		System.out.println("member V ::"+i); //10
		System.out.println("member V ::"+j); //20
	}
	 
	public static void main(String[] args) {
		test2(); //스테틱은 바로 호출 가능
		TestApp test2 =	new TestApp();
		test2.test();
//		this.i = 100;//객체 자기자신이기 때문에 static영역 안에서 생성되지 않는다..	
	}

}