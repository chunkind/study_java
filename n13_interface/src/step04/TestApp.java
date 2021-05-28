package step04;

import step04.itf.DaTaInfo;
import step04.itf.DataSource;
import step04.itf.OracleDataSource;

/**
 * @Auth : K. J. S.
 * @Date : 2019. 02. 21.
 * 인터페이스의 활용 -
 * 인터페이스는 주로 아래와 같은 이유로 사용한다.
 * 1. 표준화
 * 2. 추상화
 * 3. 메타데이터
 * 
 * 이어서 이 예제는 "메타데이터"에 대하여 알아본다.
 * "메타데이터"는 데이터(여기서는 코드를 의미)를 위한 데이터 쯤으로 생각하면 되겠다.
 */
public class TestApp {
	public static void main(String[] args) {
		//인터페이스의 변수는 항상 public static final 이다.
		System.out.println(DataSource.HOST);
		System.out.println(DataSource.PORT);
		//클래스는 안됨..
//		System.out.println(DaTaInfo.HOST);
//		System.out.println(DaTaInfo.PORT);
		//final 이라는 키워드는 한번 초기화되면 변경 불가능!!
//		DataSource.HOST = 1111; //불가능.
		
		//인터페이스는 객체 생성으로 사용 할 수 없다.(타입으로는 가능)
//		DataSource data = new DataSource();
		//인터페이스는 객체 생성은 불가능하지만 타입으로는 사용할수 있다.
		//인터페이스는 구상객체들의 부모가 된다 (폴리 몰피즘)
		DataSource data = new OracleDataSource();
	}
}
