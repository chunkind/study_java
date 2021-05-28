package step08.test;

import step08.service.ProductVOService;
import step08.vo.ProductVO;

public class ProductVOServiceTest {
	public static void main(String[] args) {
		ProductVO[] pro = {
			new ProductVO("에이스 침대", 230),
			new ProductVO("휘센 에어콘", 170),
			new ProductVO("삼성 센스 노트북", 90),
			new ProductVO("아이패드 5", 80),
			new ProductVO("대우 통돌이 세탁기", 56)
		};

		ProductVOService service = new ProductVOService();
		service.printProductModel(pro);	// call
		
		int total=service.getTotalPrice(pro);
		System.out.println("\n" + total + "원 입니다.");
		System.out.println(service.getAvgPrice(pro) + " 원 입니다.");
		
		service.printMoreAPrice(pro, 150);
	}
}
