package edu.evacodekitchen.javabasics;

public class DoWhileLoopExample {

	public static void main(String[] args) {
		int[] fiboNumbers = new int[10];
		fiboNumbers[0] = 1;
		fiboNumbers[1] = 1;
		int i = 2;
		do {
			fiboNumbers[i] = fiboNumbers[i - 1] + fiboNumbers[i - 2];
			i = i + 1;
		} while (i < 10);

		System.out.println(java.util.Arrays.toString(fiboNumbers));

	}

}
