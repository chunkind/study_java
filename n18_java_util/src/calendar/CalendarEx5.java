package calendar;

import java.util.Calendar;

/**
 * @Auth : K. J. S.
 * @Date : 2019. 3. 12.
 * add()와 roll()의 차이는 
 * roll()는 다른 필드에 영향을 주지 않는다는 것인데
 * 예외의 경우의 예제 이다.
 */
public class CalendarEx5 {
	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();

		date.set(2015, 0, 31);
		System.out.println(toString(date)); // 2005년 1월 31일
		date.roll(Calendar.MONTH, 1);
		System.out.println(toString(date)); // 2005년 2월 28일
	}

	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "년 " 
				+ (date.get(Calendar.MONTH) + 1) + "월 " 
					+ date.get(Calendar.DATE) + "일";
	}
}
