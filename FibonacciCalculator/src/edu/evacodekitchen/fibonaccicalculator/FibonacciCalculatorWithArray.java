package edu.evacodekitchen.fibonaccicalculator;

import java.util.Arrays;

public class FibonacciCalculatorWithArray implements FibonacciCalculator {
	
	int[] fiboNumbers;

	@Override
	public void printFiboNumbers(int n, int firstFiboNumber, int secondFiboNumber) {
		fiboNumbers = new int[n];
		fiboNumbers[0] = firstFiboNumber;
		fiboNumbers[1] = secondFiboNumber;
		for (int currentIndex = 2; currentIndex < n; currentIndex++) {
			fiboNumbers[currentIndex] = fiboNumbers[currentIndex - 2] + fiboNumbers[currentIndex - 1];
		}
		for (int i = 0; i < fiboNumbers.length; i++) {
			System.out.print(fiboNumbers[i] + " ");
		}
	}

}
