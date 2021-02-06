package edu.evacodekitchen.javabasics;

public class IfStatementExample {
	
	public static void main(String[] args) {
		int a = 13;
		int b = 20;
		
		int min = 0;
		if (a < b)
			min = a;
		else
			min = b;
		
		System.out.println("min = " + min);
	}

}
