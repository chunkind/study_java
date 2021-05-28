package step08.vo;

/*
 *  상품의 정보를 저장하는 VO 클래스
 *  이후에 데이타베이스 부분과 연결되면 이 VO 클래스는 
 *  테이블의 하나의 row에 해당하는 인스턴스와 연결된다.
 */
public class ProductVO {
	private String model;
	private int price;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public ProductVO(String model, int price) {
		this.model = model;
		this.price = price;
	}
}