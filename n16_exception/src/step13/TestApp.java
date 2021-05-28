package step13;

import java.io.IOException;

/**
 * @Auth : ck
 * @Date : Mar 2, 2019
 * 실제로 키보드로 읽어들인 데이타를 
 * 콘솔로 출력하는 간단한 로직....
 * 이때 IOException을 핸들링하는 방법을 익혀보자
 */
public class TestApp {
	public static void main(String[] args) {
		System.out.println("======== IOException=======");
		byte[] data = new byte[100];
		try {
			System.in.read(data);
		} catch (IOException e) {
			System.out.println("read()를 사용하는 순간 무조건 IOException이 발생 ");
		} //
		System.out.println("입력한 문자열은 ::" + new String(data));
	}
}
