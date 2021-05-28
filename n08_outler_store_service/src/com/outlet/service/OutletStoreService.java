package com.outlet.service;

import com.outlet.vo.CustomerVO;
import com.outlet.vo.ProductVO;

public class OutletStoreService {
	// 1. 특정 고객이 구입한 모든 상품들의 maker를 콘솔로 출력
	public void printAllProductMaker(CustomerVO cust, ProductVO[] pros) {
		System.out.println("==== " + cust.getName() + "고객이 구매하신 상품 목록=====\n");
		for (ProductVO pro : pros)
			System.out.println(pro.getMaker() + " ");
		System.out.println(" ");
	}//

	// 2. Outlet에서 물건을 구입하는 모든 고객들의 정보를 콘솔로 출력
	public void printAllCustomers(CustomerVO[] custs) {
		System.out.println("===== 다음은 고객들의 정보입니다 =====");
		for (CustomerVO cust : custs)
			System.out.println(cust.getName() + " " + cust.getAddr());
	}

	// 3. 특정 고객이 구입한 모든 상품의 정보를 리턴 받아옴
	public void getAllProduct(CustomerVO cust) {
		for (ProductVO pro : cust.getProduct()) {
			if (pro.getPrice() > 100000)
				System.out.println(pro.getMaker() + " " + pro.getPrice());
		}
	}

	// 4. 특정 고객이 구입한 상품중 금액이 가장 비싼 물건의 목록을 출력
	public int maxPriceProduct(CustomerVO cust, ProductVO[] pros) {
		System.out.println("==== 고객님이 구입한 상품중 가장 고가 상품입니다 ====");
		int maxPrice = pros[0].getPrice();
		for (ProductVO pro : pros) {
			if (pro.getPrice() > maxPrice)
				maxPrice = pro.getPrice();
		}
		return maxPrice;
	}
}