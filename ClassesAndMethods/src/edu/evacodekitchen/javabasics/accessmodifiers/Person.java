package edu.evacodekitchen.javabasics.accessmodifiers;

import java.time.LocalDateTime;

public class Person {
	
	String name;
	private int height;
	private long id;
	private int birthYear;
	
	public void sayHello() {
		height++;
	}
	
	public int getAge() {
		return LocalDateTime.now().getYear() - birthYear;
	}

}
