package edu.evacodekitchen.javabasics;

public class StaticMethodExample {
	
	public static void main(String[] args) {
		StaticFieldExample.main(null);
		
		String actualDayOfWeek = DateTime.getActualDayOfWeek();
		System.out.println(actualDayOfWeek);
	}

}
