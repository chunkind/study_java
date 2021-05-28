package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class NewTimeEx2 {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2015, 12, 31); // 2015년 12월 31일
		LocalTime time = LocalTime.of(12, 34, 56); // 12시 23분 56초

		// 2015년 12월 31일 12시 23분 56초
		LocalDateTime dt = LocalDateTime.of(date, time);

		ZoneId zid = ZoneId.of("Asia/Seoul");
		ZonedDateTime zdt = dt.atZone(zid);
//		String strZid = zdt.getZone().getId();

		ZonedDateTime seoulTime = ZonedDateTime.now();
		ZoneId nyId = ZoneId.of("America/New_York");
		ZonedDateTime nyTime = ZonedDateTime.now().withZoneSameInstant(nyId);

		// ZonedDatetime -> OffsetDateTime
		OffsetDateTime odt = zdt.toOffsetDateTime();

		System.out.println(dt); //2015-12-31T12:34:56
		System.out.println(zid); //Asia/Seoul
		System.out.println(zdt); //2015-12-31T12:34:56+09:00[Asia/Seoul]
		System.out.println(seoulTime); //2019-03-13T14:58:59.636+09:00[Asia/Seoul]
		System.out.println(nyTime); //2019-03-13T01:58:59.641-04:00[America/New_York]
		System.out.println(odt); //2015-12-31T12:34:56+09:00
	}
}
