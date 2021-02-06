package edu.evacodekitchen.javabasics;

import java.util.Arrays;

public class ArrayExamples {
	
	public static void main(String[] args) {
		int[] diceSides = new int[] {1, 2, 3, 4, 5, 6};

		System.out.println(diceSides[0]);
		System.out.println(diceSides[5]);

		diceSides[5] = 10;

		System.out.println(Arrays.toString(diceSides));
	}

}
