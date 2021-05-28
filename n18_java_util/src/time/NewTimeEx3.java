package time;

import static java.time.DayOfWeek.TUESDAY;
import static java.time.temporal.TemporalAdjusters.dayOfWeekInMonth;
import static java.time.temporal.TemporalAdjusters.firstDayOfMonth;
import static java.time.temporal.TemporalAdjusters.firstDayOfNextMonth;
import static java.time.temporal.TemporalAdjusters.firstInMonth;
import static java.time.temporal.TemporalAdjusters.lastDayOfMonth;
import static java.time.temporal.TemporalAdjusters.lastInMonth;
import static java.time.temporal.TemporalAdjusters.next;
import static java.time.temporal.TemporalAdjusters.nextOrSame;
import static java.time.temporal.TemporalAdjusters.previous;
import static java.time.temporal.TemporalAdjusters.previousOrSame;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public class NewTimeEx3 {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate date = today.with(new DayAfterTomorrow());

		p("오늘 : "+today); // System.out.println(today);
		p("내일 모래 : "+date);

		p("다음 달의 첫 날 : "+today.with(firstDayOfNextMonth()));
		p("이 달의 첫 날 : "+today.with(firstDayOfMonth()));
		p("이 달의 마지막 날 : "+today.with(lastDayOfMonth())); 
		p("이 달의 첫번째 화요일 : " + today.with(firstInMonth(TUESDAY))); 
		p("이 달의 마지막 화요일 : " + today.with(lastInMonth(TUESDAY)));
		p("지난 주 화요일 : " + today.with(previous(TUESDAY)));
		p("지난 주 화요일(오늘 포함) : " + today.with(previousOrSame(TUESDAY)));
		p("다음 주 화요일 : " + today.with(next(TUESDAY)));
		p("다음 주 화요일(오늘 포함) : " + today.with(nextOrSame(TUESDAY)));
		p("이 달의 4번째 화요일 : " + today.with(dayOfWeekInMonth(4, TUESDAY)));
	}

	static void p(Object obj) { // 라인의 길이를 줄이기 위해 새로 정의한 메서드
		System.out.println(obj);
	}
}

class DayAfterTomorrow implements TemporalAdjuster {
	@Override
	public Temporal adjustInto(Temporal temporal) {
		return temporal.plus(2, ChronoUnit.DAYS);
	}
}
