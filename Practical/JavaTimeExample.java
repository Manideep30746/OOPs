package pratical_1;

import java.time.*;

public class JavaTimeExample {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println("Today's date: "+today);
		
		LocalTime timeNow = LocalTime.now();
		System.out.println("Currect time: "+timeNow);
		
		LocalDateTime datetimeNow = LocalDateTime.now();
		System.out.println("Current date and time: "+datetimeNow);
		
		ZonedDateTime IndiaTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Zoned date and time (India): "+IndiaTime);
		
		Instant instantNow = Instant.now();
		System.out.println("Current instant(UTC): "+instantNow);
		
		LocalTime start = LocalTime.of(9, 0);
		LocalTime end = LocalTime.of(10, 30);
		Duration duration = Duration.between(start, end);
		System.out.println("Duration: "+duration.toMinutes()+ " minutes");
		
		LocalDate birthDate = LocalDate.of(2000, 1, 1);
		Period period = Period.between(birthDate, today);
		System.out.println("Period: "+period.getYears()+" years and "+period.getMonths()+" months");
	}

}
