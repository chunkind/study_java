package step02.test;

import step02.Player;

/**
 * @Auth: chunkind@naver.com
 * @Date: 2021. 05. 28.
 * Constructor란?
 *
 * 객체생성할때 최초 한번 생성되는 메서드.
 */
public class TestApp {
	public static void main(String[] args) {
		System.out.println("====== Player Infomation======\n");
		// 1. p1,p2,p3 라는 이름으로 선수를 각각 세명 생성 :: 값을 이때 직접 주입
		Player p1 = new Player("메시", 45000.0, "라리가", true);
		Player p2 = new Player("이니에스타", 60000.0, "라리가", false);
		Player p3 = new Player("실바", 50000.0, "라리가", false);

		System.out.println(p1.getPlayerDetails());
		System.out.println(p2.getPlayerDetails());
		System.out.println(p3.getPlayerDetails());

		System.out.println("====== Player Year Salary======\n");
		// 2. 각각 선수들의 연봉을 출력
		System.out.println(p1.getPlayerDetails() + " : : " + p1.getYearSalary());
		System.out.println(p2.getPlayerDetails() + " : : " + p2.getYearSalary());
		System.out.println(p3.getPlayerDetails() + " : : " + p3.getYearSalary());

		System.out.println("====== Player Is Manager?======\n");
		// 3. 각각 선수들의 매니저 여부를 출력
		System.out.println(p1.getIsManager());
		System.out.println(p2.getIsManager());
		System.out.println(p3.getIsManager());

		System.out.println("=================================");
	}
}