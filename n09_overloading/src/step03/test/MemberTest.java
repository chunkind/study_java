package step03.test;

import step02.Member;

/**
 * @Auth K. J. S.
 * @Date 2019. 1. 4.
 * 생성자 오버로딩 예제.
 * 
 * ssn 		- 고객 번호
 * name 	- 고객 이름
 * tel 		- 고객 번호
 * address 	- 고객 주소
 * email 	- 고객 이메일
 */
public class MemberTest {
	public static void main(String[] args) {
		
		//1.ssn(고객일련번호) 받는 생성자를 사용해 객체생성후 정보 출력.
		Member m1 = new Member(1);
		System.out.println(m1.getDetails());

		//2.ssn(고객일련번호), name(고객이름) 받는 생성자를 사용해 객체생성후 정보 출력.
		Member m2 = new Member(2, "김새봄");
		System.out.println(m2.getDetails());
		
		//3.ssn(고객일련번호), name(고객이름), tel(고객전화번호) 받는 생성자를 사용해 객체생성후 정보 출력.
		Member m3 = new Member(3, "성영식", "01012345678");
		System.out.println(m3.getDetails());
		
		//4.ssn(고객일련번호), name(고객이름), tel(고객전화번호), address(고객주소), email(고객 메일) 받는 생성자를 사용해 객체생성후 정보 출력.
		Member m4 = new Member(4, "김준성", "01011112222", "서울시", "kjs@naver.com");
		System.out.println(m4.getDetails());
		
	}

}
