package exam.service;

import com.outlet.vo.CustomerVO;
import com.outlet.vo.ProductVO;

/*
 *outlet에 입고된 상품들, 상품을 구매하는 고객에 대한 정보와 기능을 담고있는
 *서비스 클래스...기능위주로 이루어져 있다.
 *Test 클래스에서 이 기능을 호출할 것이다.
 */
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
	// 이때 10만원 이상의 고가 상품의 목록을 콘솔로 출력함.
	public ProductVO[] getAllProduct(CustomerVO cust, ProductVO[] pros) {
		System.out.println("==== 10만원 이상의 고가 상품들 입니다 ====");
		System.out.println(cust.getName() + "님께서 구입하신 물건 중에서 고가 상품은...");
		for (ProductVO pro : pros) {
			if (pro.getPrice() > 100000)
				System.out.println(pro.getMaker() + " " + pro.getPrice());
		} // for
		return pros;
	}

	// 4. 특정 고객이 구입한 상품중 금액이 가장 비싼 물건의 목록을 출력
	public int maxPriceProduct(CustomerVO cust, ProductVO[] pros) {
		System.out.println("==== 고객님이 구입한 상품중 가장 고가 상품입니다 ====");
		int maxPrice = pros[0].getPrice(); // 4만원
		for (ProductVO pro : pros) {
			if (pro.getPrice() > maxPrice)
				maxPrice = pro.getPrice();
		} // for
		return maxPrice;
	}

}
