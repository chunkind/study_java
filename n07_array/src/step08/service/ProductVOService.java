package step08.service;

import step08.vo.ProductVO;

/*
 *  ProducVO를 핸들링하는 기능으로 묶여 있는 클래스
 *  이후에 비지니스 로직을 담당하는 클래스가 될 것이다.
 *  여기에
 *  1) 모든 상품의 모델명을 출력		:: printProductModel(){//
 *  2) 모든 상품의 총애을 리턴.		:: getTotalPrice(){//
 *  3) 모든 상품의 평균가를 리턴		:: getAvgPrice(){//
 *  4) 모든 상품 중 특정가격 이상/이하의 제품을 리턴	:: getMoreAPrice(){//
 *  이 들어있다.
 */

public class ProductVOService {
	// 리턴 타입과 메소드의 인자값은 여러분 각자가 알아서 넣어주세요.
	public void printProductModel(ProductVO[] pro) {
		System.out.println("=== Product Model명 입니다. ===");
		for (ProductVO p : pro) {
			System.out.println(" ");
			System.out.print(p.getModel() + ", ");
		}
		System.out.println(" ");
	}

	int total = 0;

	public int getTotalPrice(ProductVO[] pro) { // 중요함!!!
		System.out.println(" ");
		System.out.println("==== Total Product Price ====");
		for (ProductVO p : pro) {
			total += p.getPrice();
		}
		return total;
	}

	public int getAvgPrice(ProductVO[] pro) {
		System.out.println(" ");
		System.out.println("==== Total Product Price ====");
		System.out.println(" ");
		return total / pro.length;
	}

	public void printMoreAPrice(ProductVO[] pro, int price) {
		System.out.println("\n" + price + " 이상 가격의 제품들.. " + "\n");
		for (ProductVO p : pro) {
			if (p.getPrice() > price) {
				System.out.println(p.getModel() + "\t" + p.getPrice());
			}
		}
	}
}
