package exam.vo;

import com.outlet.utill.MyDate;

/*
 * 상품의 정보를 담고 있는 VO클래스
 * MyDate를 Hasing
 * 1)setStartDate(MyDate md)
 */
public class ProductVO {
	
	private String maker;
	private int price;
	private MyDate startDate; // 입고시점
	private int serialNumber;

	public ProductVO(String maker, int price, MyDate startDate, int serialNumber) {
		super();
		this.maker = maker;
		this.price = price;
		this.startDate = startDate; // 입고날짜
		this.serialNumber = serialNumber;

	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public MyDate getStartDate() {
		return startDate;
	}

	public void setStartDate(MyDate startDate) {
		this.startDate = startDate;
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

}
