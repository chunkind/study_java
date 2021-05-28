package com.outlet.test;

import com.outlet.service.OutletStoreService;
import com.outlet.utill.MyDate;
import com.outlet.vo.CustomerVO;
import com.outlet.vo.ProductVO;

public class OutletStoreServicTest {
	public static void main(String[] args) {
		// 1. 고객 2명 생성
		CustomerVO[] cust = { 
			new CustomerVO("111", "이나영", "방배동", 123),
			new CustomerVO("222", "원빈", "방배동", 321) 
		};

		// 2. ProductVO도 2개 생성
		ProductVO[] pros1 = {
			new ProductVO("진라면", 3000, new MyDate(2015, 4, 13), 123),
			new ProductVO("치토스", 1500, new MyDate(2015, 2, 10), 143),
			new ProductVO("구구콘", 1000, new MyDate(2015, 1, 13), 321),
			new ProductVO("빵", 1000, new MyDate(2015, 2, 21), 432) 
		};
		
		ProductVO[] pros2 = {
			new ProductVO("처음처럼", 1500, new MyDate(2015, 4, 2), 113),
			new ProductVO("경기미", 11000, new MyDate(2015, 5, 13), 432)
		};
		
		OutletStoreService service = new OutletStoreService();
		// 특정 고객이 상품을 구매함..
		cust[0].buyProduct(pros1);
		cust[1].buyProduct(pros2);
		// Service 클래스의 기능 호출
		service.printAllProductMaker(cust[1], pros1);  
		// 메소드 호출할때 인자값 확인 / 배열이 들어가면 전체를 불러오고 배열이 없으면 객체 중 하나를 부른다.
		service.printAllCustomers(cust);
		service.getAllProduct(cust[0]);

		int max = service.maxPriceProduct(cust[0], pros1);
		System.out.println(cust[0].getName() + " 님이 구입하신 물건중 가장 고가는"+ max+ "입니다");
	}
}