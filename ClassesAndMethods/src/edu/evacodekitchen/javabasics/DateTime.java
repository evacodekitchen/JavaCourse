package edu.evacodekitchen.javabasics;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class DateTime {
	
	static String getActualDayOfWeek() {
		DayOfWeek dayOfWeek = LocalDateTime.now().getDayOfWeek();
		return dayOfWeek.name();
	}

}
