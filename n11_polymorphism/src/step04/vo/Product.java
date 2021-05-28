package step04.vo;

public class Product {
	public int price;
	public int bonusPoint;
	public int pNumber; // 상품을 구입하는 유니크한 값
	// 상품이 만들어질때 가격이 정해진다. 
	// 이때 보너스도 함께 정해짐.(상품가격의 10%)

	public Product(int price) {
		this.price = price;
		bonusPoint = (int) price / 10;
	}

	public void setpNumber(int pNumber) {
		this.pNumber = pNumber;
	}

	public int getpNumber() {
		return pNumber;
	}

}