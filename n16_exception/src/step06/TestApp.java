package step06;

import step06.vo.Throw;

/**
 * @Auth : ck
 * @Date : Mar 2, 2019
 * 사용자정의 Exception에 대해서...
 * 고의적으로 특정 조건에 합당하면 내가 폭탄을 터트릴수 있다
 * 이렇게 함으로써 문장의 흐름을 강하게 제어한다.
 */
public class TestApp {
	public static void  main(String[] args) {
		Throw th = new Throw();
		try{
			th.go();
		}catch(ArithmeticException e){
			System.out.println("폭탄처리 완료..");
		}
	}
}
