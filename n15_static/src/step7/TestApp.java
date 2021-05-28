package step7;

import step7.vo.SunCompany;

/**
 * @Auth : ck
 * @Date : Mar 2, 2019
 * Singletone Pattern ::
 * 하나의 클래스로부터 단 하나의 객체만 생성하고
 * 다른 곳에서는 객체 생성을 막아두려는 기법
 * 그리고 하나 만들어진 객체를 받아와서 돌려쓰는 방법을 제공하는 패턴
 * 작성방법
 * 1) static private 을 붙여서 일단 객체 하나는 생성
 * 2) 생성자 앞에 private을 붙여서 다른곳에서의 객체 생성을 막는다
 * 3) public static Object getObject() 기능을 제공해서 
 * 하나 만들어 놓은 객체를 받아갈수 있는 통로를 제공
 */
public class TestApp {
	public static void main(String[] args) {
		SunCompany com1 = SunCompany.getCompany();
		SunCompany com2 = SunCompany.getCompany();
		SunCompany com3 = SunCompany.getCompany();
		// 주소값이 다 동일하면 같은 액체이다
		System.out.println(com1);
		System.out.println(com2);
		System.out.println(com3);
	}
}
