package edu.evacodekitchen.fibonaccicalculator;

public class FibonacciCalculatorWith3Variables implements FibonacciCalculator {

	private int first;
	private int second;
	private int third;

	@Override
	public void printFiboNumbers(int n, int firstFiboNumber, int secondFiboNumber) {
		first = firstFiboNumber;
		second = secondFiboNumber;
		System.out.print(first + " ");
		System.out.print(second + " ");
		
		int currentFiboIndex = 2;
		while (currentFiboIndex < n) {
			third = first + second;
			System.out.print(third + " ");
			first = second;
			second = third;
			currentFiboIndex++;
		}
	}

}
