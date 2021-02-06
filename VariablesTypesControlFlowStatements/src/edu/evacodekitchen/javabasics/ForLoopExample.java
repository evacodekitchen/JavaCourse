package edu.evacodekitchen.javabasics;

public class ForLoopExample {

	public static void main(String[] args) {
		int[] fiboNumbers = new int[10];
		fiboNumbers[0] = 1;
		fiboNumbers[1] = 1;
		for (int i = 2; i < 10; i++) {
			fiboNumbers[i] = fiboNumbers[i - 1] + fiboNumbers[i - 2];
		}
		System.out.println(java.util.Arrays.toString(fiboNumbers));
		
		for(int j = 199; j > 100; j--) {
			System.out.println(j);
		}
	}

}
