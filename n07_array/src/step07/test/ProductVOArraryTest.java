package step07.test;

import step07.vo.ProductVO;

public class ProductVOArraryTest {
	public static void main(String[] args) {
		//1. Product 타입의 배열 생성.. 사이즈 3 pro란 이름으로
		ProductVO[] pro = new ProductVO[3];

		//2. 각각의 배열 항목에 ProductVO 객체를 생성,
		pro[0] = new ProductVO("삼성 평면 tv", 300);
		pro[1] = new ProductVO("에이스 침대", 200);
		pro[2] = new ProductVO("삼성 노트북", 100);

		//3. 배열의 선언, 생성, 초기화를 한번에.. 이름은 pro
//		ProductVO[] pro = {
//			new ProductVO("삼성 평면 tv", 300),
//			new ProductVO("에이스 침대", 200),
//			new ProductVO("삼성 노트북", 100)
//		};

		System.out.println("================== Products Model ==================");
		// 4. 배열안에 들어있는 모든 상품의 모델명을 출력
		for (ProductVO vo : pro) {
			System.out.println(vo.getModel());
		}

		System.out.println("===================================");
		System.out.println("============= Products Price =============");

		// 5. 상품의 각격이 200만원 이하인 상품의 가격을 출력
		int sum = 0;
		for (ProductVO vo : pro) {
			if (vo.getPrice() <= 200) {
				System.out.println(vo.getModel() + "\t" + vo.getPrice());
			} // if
			sum += vo.getPrice();
		} // for

		// 6. 배열안에 들어있는 상품 가격의 평균가를 출력
		System.out.println("Product Avg ::" + sum / pro.length + "원 입니다.");
	}
}