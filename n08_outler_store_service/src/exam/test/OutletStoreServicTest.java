package exam.test;

import com.outlet.service.OutletStoreService;
import com.outlet.utill.MyDate;
import com.outlet.vo.CustomerVO;
import com.outlet.vo.ProductVO;

public class OutletStoreServicTest {
	public static void main(String[] args) {
		//고객 2명 생성
		CustomerVO[] cust = { 
			new CustomerVO("111", "이나영", "방배동", 123),
			new CustomerVO("222", "원빈", "방배동", 321) 
		};

		//상품 묶음1 생성.
		ProductVO[] pros1 = {
			new ProductVO("진라면", 3000, new MyDate(2015, 4, 13), 123),
			new ProductVO("치토스", 1500, new MyDate(2015, 2, 10), 143),
			new ProductVO("구구콘", 1000, new MyDate(2015, 1, 13), 321),
			new ProductVO("빵", 1000, new MyDate(2015, 2, 21), 432) 
		};
		
		//상품 묶음2 생성.
		ProductVO[] pros2 = {
			new ProductVO("처음처럼", 1500, new MyDate(2015, 4, 2), 113),
			new ProductVO("경기미", 11000, new MyDate(2015, 5, 13), 432)
		};
		
		
		OutletStoreService service = new OutletStoreService();
		
		// 특정 고객이 상품을 구매함..
		cust[0].buyProduct(pros1);
		cust[1].buyProduct(pros2);
		
		// 원빈이 구매한 상품 리스트 모두 보기.
		/* 결과값은 아래와 같다.
		 ==== 원빈고객이 구매하신 상품 목록=====
		  진라면 
		  치토스 
		  구구콘 
		  빵 
		 */
//		service.printAllProductMaker(cust[1], pros1);  
		
		//모든 고객 정보를 출력.
		/* 결과값은 아래와 같다.
		 ===== 다음은 고객들의 정보입니다 =====
		  이나영 방배동
		  원빈 방배동
		 */
//		service.printAllCustomers(cust);
		
		//원빈의 10만원 이상 상품들을 출력
		service.getAllProduct(cust[0]);
//		System.out.println("==== 10만원 이상의 고가 상품들 입니다 ====");
//		System.out.println(cust.getName() + "님께서 구입하신 10만원 이상 상품 입니다.");
		
		
		//원빈의 가장 비싼 물건 출력.
//		int max = service.maxPriceProduct(cust[0], pros1);
//		System.out.println(cust[0].getName() + " 님이 구입하신 물건중 가장 고가는"+ max+ "입니다");

	}

}
