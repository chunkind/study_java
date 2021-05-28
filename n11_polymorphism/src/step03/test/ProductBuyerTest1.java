package step03.test;

import step03.service.ProductBuyer;
import step03.vo.Computer;
import step03.vo.TV;

public class ProductBuyerTest1 {
	public static void main(String[] args) {
		TV tv = new TV();
		Computer com = new Computer();
		ProductBuyer buyer = new ProductBuyer();

		buyer.buyTv(tv);
		buyer.buyComputer(com);

		System.out.println("현재 남은 금액은" + buyer.money + " 만원입니다..");
		System.out.println("현재 남은 Bonus Ponit는 " + buyer.bonusPoint + " 점입니다..");
	}
}