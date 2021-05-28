package step05.test;

import step05.service.ProductBuyer;
import step05.vo.Audio;
import step05.vo.Computer;
import step05.vo.TV;

public class ProductBuyerTest3 {
	public static void main(String[] args) {
		TV tv = new TV();
		Computer com = new Computer();
		Audio audio1 = new Audio();
		Audio audio2 = new Audio();

		tv.setpNumber(111);
		com.setpNumber(222);
		audio1.setpNumber(333);
		audio2.setpNumber(444);

		ProductBuyer buyer = new ProductBuyer();

		buyer.buyProduct(tv);
		buyer.buyProduct(com);
		buyer.buyProduct(audio1);
		buyer.buyProduct(audio2);

		buyer.summary();

		System.out.println("현재 남은 금액은" + buyer.money + " 만원입니다..");
		System.out.println("현재 남은 Bonus Ponit는 " + buyer.bonusPoint + " 점입니다..");

		buyer.refund(audio2);
	}
}
