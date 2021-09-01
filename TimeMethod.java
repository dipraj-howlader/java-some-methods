package Methods;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeMethod {
	public static void main(String[] args) {
		LocalTime t = LocalTime.now();
		System.out.println(t);
		// format time
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
		String nowTime  = formatter.format(t);
		System.out.println(nowTime);
	}
}
