package step07.vo;

/*
 * 상품에 대한 정보를 담고 있는 VO클래스
 * field와 setter /getter로 이뤄져 있다
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
