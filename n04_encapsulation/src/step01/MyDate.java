package step01;

/*
 * Access Modifier의 접근허용 범위
 *  public :: 어디서든 접근 가능
 *  private :: 같은 클래스에서만 접근을 허용
 *  [default] :: 같은 패키지 내에서만 접근을 허용
 *  if / switch문을 모두 사용 
 */
public class MyDate {
	private int month;
	private int day;

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month >= 1 && month <= 12) {
			this.month = month;
		} else {
			System.out.println("합당한 월이 아닙니다.");
			System.out.println(0);
		}
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		switch (month) {
		case 2:
			if (day >= 1 && day <= 31) {
				this.day = day;
			} else {
				System.out.println("2월에 합당한 날짜가 아닙니다");
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if (day >= 1 && day <= 30) {
				this.day = day;
			} else {
				System.out.println("월에 합당한 날짜가 아닙니다");
			}
			break;

		default:
			if (day >= 1 && day <= 31) {
				this.day = day;
			} else {
				System.out.println("월에 합당한 날짜가 아닙니다");
			}
			break;
		}
	}
}
