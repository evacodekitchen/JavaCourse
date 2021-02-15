package edu.evacodekitchen.javabasics.series;

import java.util.Arrays;

import edu.evacodekitchen.javabasics.series.fibo.FiboNumberGeneretor;
import edu.evacodekitchen.javabasics.series.harmonic.HarmonicSerieGenerator;

public class Main {
	
	public static void main(String[] args) {
		FiboNumberGeneretor fiboGenerator = new FiboNumberGeneretor(10);
	    System.out.println(Arrays.toString(fiboGenerator.calculateElements()));

	    HarmonicSerieGenerator harmonicGenerator = new HarmonicSerieGenerator(10);
	    System.out.println(Arrays.toString(harmonicGenerator.calculateElements()));
	}
	
}
