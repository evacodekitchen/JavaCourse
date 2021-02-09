package edu.evacodekitchen.fibonaccicalculator;

public class Main {
	public static void main(String[] args) {
		FibonacciCalculator fibonacciCalculatorWithArray = new FibonacciCalculatorWithArray();
		
		fibonacciCalculatorWithArray.printFiboNumbers(10, 0, 1);
		System.out.println("");

		FibonacciCalculator fibonacciCalculatorWith3Variables = new FibonacciCalculatorWith3Variables();
		
		fibonacciCalculatorWith3Variables.printFiboNumbers(10, 0, 1);
	}
}
