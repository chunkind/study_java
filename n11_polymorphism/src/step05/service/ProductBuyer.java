package step05.service;

import java.util.Vector;

import step05.vo.Computer;
import step05.vo.Product;

public class ProductBuyer {
	public int money = 1000; // 가진돈이 일천만원
	public int bonusPoint = 0; // 현재 포인트가 0으로 시작(구입한 물건이 아직 없다)
	// public Product[ ] items = new Product[10];
	public Vector v = new Vector(); // 기본적으로 10칸짜리 반찬통이 만들어진다...
	public int index = 0; // 배열의 항목을 추가할때 증가되는 카운터로 사용

	/*
	 * 가진돈 보다 물건의 가격이 작을 경우에만 구입할 수 있다. 상품의 가격만큼 보유금액은 줄어들고 / 포인트 상품가는 늘어야함(10%
	 * 증가) 최종적으로 구입한 상품을 출력
	 */
	public void buyProduct(Product p) { // 물건 하나씩 구입...물건을 살때마다 배열에 p를 할당... 이
										// 부분이 추가됨

		if (money < p.price) {
			System.out.println("잔액이 부족하여 물건을 구입할수 없어요..");
			return; // buyTv() 구입하기 전으로 돌려놓음
		}
		v.add(p);

		// 상품 사는 로직
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + " 를 구입하였습니다. ..");
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

	public void refund(Product p) {
		/*
		 * 환불하는 로직을 작성 bonusPoint 차감 / money 증액 배열의 항목에서 빠져야 한다
		 */
		if (v.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "를 환불처리 했습니다...");
		} else {
			System.out.println(p + " 에 해당하는 물건이 없어서 환불처리 힘들다..");
		}
	}

	// 제거 됬는지 확인하는 로직
	/*
	 * System.out.println(" \n===== 제거됬는지 다시 확인함...===== "); for(int k =0;
	 * k<items.length-1; k++){ System.out.println(items[k]); } money += p.price;
	 * bonusPoint -= p.bonusPoint; System.out.println(p+ "를 환불하셨습니다.."); }
	 */
	public void summary() {
		/*
		 * for문을 이용해서 구입한 물건의 총합과 구입한 물건들의 총 목록을 출력 이때 필요한 변수가 있다면 해당 메소드 안에서
		 * 선언해서 사용
		 */
		int sum = 0;
		String itemList = " ";
		if (v.isEmpty()) {
			System.out.println("구입하신 물건이 없습니다..");
			return;
		}
		for (int i = 0; i < v.size(); i++) {
			Product p = (Product) v.get(i); // casing
			sum += p.price;
			itemList += p + " , ";
		}

		System.out.println("구입한 상품의 총 금액 :" + sum + " 만원입니다.");
		System.out.println("구입한 상품의 총 금액 :" + itemList + " 입니다.");
	}
}