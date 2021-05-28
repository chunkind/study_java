package step01.util;

/**
 * @Auth K. J. S.
 * @Date 2019. 1. 4.
 * 맴버 4 (필드3 메소드1)
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

	public String getDetails() {
		return year + "-" + month + "-" + day;
	}
}
