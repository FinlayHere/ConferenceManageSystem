package code.transfer;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TimeUtils {
		
		private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		public static String convertToString(LocalDate date) {
				return date.format(formatter);
		}
		
		public static LocalDate convertToDate(String date) {
				
				return LocalDate.parse(date, formatter);
		}
}
