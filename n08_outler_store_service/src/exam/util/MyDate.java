package exam.util;

/*
 * 상품의 제조연도를 지정하는 클래스..
 */
public class MyDate {
	private int year;
	private int month;
	private int day;

	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}

	// 사용자정의 메소드
	public String getMyDate() {
		return year + " " + month + " " + day;

	}

}
