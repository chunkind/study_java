package com.outlet.vo;

/*
 * 고객에 대한 정보를 담고 잇는 VO클래스
 * Outlet에서 상품을 구매하는 소비자에 대한 정보를 담고 있는 클래스...
 */
public class CustomerVO {

	private String ssn;
	private String name;
	private String addr;
	private int tel;

	// Hasing :: 특정 고객이 여러개의 상품을 구매할수 있어야한다.
	ProductVO[] products;

	public CustomerVO(String ssn, String name, String addr, int tel) {
		super();
		this.ssn = ssn;
		this.name = name;
		this.addr = addr;
		this.tel = tel;
	}

	// 상품에 대한 주입의 통로... 결국은 setter이다
	public void buyProduct(ProductVO[] products) {
		this.products = products;
	}

	public ProductVO[] getProduct() {
		return products;
	}

	// 나머지 field에 대한 getter()를 정의
	public String getSsn() {
		return ssn;
	}

	public String getName() {
		return name;
	}

	public String getAddr() {
		return addr;
	}

	public int getTel() {
		return tel;
	}

	// 나머지 field들은 생성자를 통해서 주입.
	// addr, tel 이후에 변경가능성이 많은 필드...수정기능을 달자
	public void changeAddr(String addr) {// 결국은 setter
		this.addr = addr;
	}

	public void changeTel(int tel) {// 결국은 setter
		this.tel = tel;
	}
}