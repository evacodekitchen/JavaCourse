package edu.evacodekitchen.javabasics.finalkeyword;

public class FinalVariableAndParamterExample {
	
	public static void main(String[] args) {
		final int a = 10;
		
//		a = 40; //compilation error
	}
	
	public void foo(final int x) {
//		x = 3; //compilation error. Anyway, it is bad programming pattern to change the value of a parameter
	}

}
