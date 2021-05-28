package step03.service;

import step03.vo.Computer;
import step03.vo.TV;

public class ProductBuyer {
	public int money = 1000; // 가진돈이 일천만원
	public int bonusPoint = 0; // 현재 포인트가 0으로 시작(구입한 물건이 아직 없다)
	/*
	 * 가진돈 보다 물건의 가격이 작을 경우에만 구입할 수 있다. 상품의 가격만큼 보유금액은 줄어들고 / 포인트 상품가는 늘어야함(10% 증가)
	 * 최종적으로 구입한 상품을 출력
	 */
	public void buyTv(TV tv) {
		if (money < tv.price) {
			System.out.println("잔액이 부족하여 물건을 구입할수 없어요..");
			return; // buyTv() 구입하기 전으로 돌려놓음
		}
		// 상품 사는 로직
		money -= tv.price;
		bonusPoint += tv.bonusPoint;
		System.out.println(tv + " 를 구입하였습니다. ..");
	}

	public void buyComputer(Computer com) {
		if (money < com.price) {
			System.out.println("잔액이 부족하여 물건을 구입할수 없어요..");
			return;
		}
		money -= com.price;
		bonusPoint += com.bonusPoint;
		System.out.println(com + "를 구입하였습니다..");
	}
}