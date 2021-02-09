package edu.evacodekitchen.javabasics.exceptions;

public class IsFinallyExecutedExample {

	public static void main(String[] args) {
		try {
			foo();
		} catch (Exception e) {
			System.out.println("Exception occured");
			return;
		} finally {
			System.out.println("Finally executed");
		}
	}

	public static void foo() throws Exception {
		throw new Exception("Some exception");
	}

}
