package step01;

import util.BasicTypeOf;

/**
 * @Auth : ck
 * @Date : Mar 2, 2019
 * 케스팅 ::: 형변환 => 데이터 타입을 바꾸기위해 사용.
 * 1.기본형 형변환
 * 
 * 2.참조형 형변환
 * 
 * 아래 예제는 기본형 케스팅에 관한 예제이다.
 */
public class TestApp {
	public static void main(String[] args) {
		//1.다운 케스팅 :::: 큰 데이터 -> 작은 데이터
		//0.1 은?? 무슨 타입일까?
		System.out.println(BasicTypeOf.getType(0.1));
		//double이다.
		//double은 int보다 큰 자료형이다.
		//아래와 같이 큰자료형이 작은자료형에 들어가고자할때 컴파일 에러가난다.
		//이는 데이터 손실을 알려주기 위함이다.
//		int a = 0.1;
		//이때 케스팅을 하게되면 에러는 없어지고 데이터는 손실된다.
		int a = (int)0.1; //데이터앞에 (자료형 or 타입)을 붙여주면 케스팅이 된다.
		System.out.println(a); //데이터가 손실되고 0이된다.
		
		//2.업 케스팅 :::: 작은 데이터 -> 큰 데이터
		//반대로 int -> double로 형변환을 해보자
		System.out.println(BasicTypeOf.getType(1)); //1은 int다
		long b = 1;
		//작은 데이터를 큰데이터로 형변환하게되면 데이터의 손실이 없기때문에
		//케스팅을 생략할수 있다.
		
		//3.전혀다른 자료형간의 케스팅
		System.out.println(BasicTypeOf.getType(true)); //true는 boolean형이다.
//		int c = true;
//		int c = (int)true;
		// 전혀 다른 데이터값은 서로 케스팅 할 수 없다.
		// 따라서 기본형간 케스팅은 boolean을 제외한 모든 기본형끼리는 가능하다. 
		//char, byte, short, int, long, float, double 끼리 된다.
		char char01 = 'A';
		byte byte01 = 1;
		short short01 = 1;
		int int01 = 1;
		long long01 = 1L;
		float float01 = 1F;
		double double01 = 0.1D;
		// L, F, D 는 각각의 값을 구분하기위한 리터럴이다.
		
		//다운케스팅
//		byte01 = (byte) short01; 
//		short01 = (short) int01; 
//		int01 = (int) long01;
//		long01 = (long) float01;
//		float01 = (float) double01;
		//업케스팅
//		double01 = float01;
//		float01 = long01;
//		long01 = int01;
//		int01 = short01;
//		short01 = byte01;
	}
}
