package edu.evacodekitchen.javabasics.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Quiz {
	public static void main(String[] args) {
		System.out.println(foo(Arrays.asList("one", "two", "three"), s -> s.length()));
	}
	
	private static List<Integer> foo(List<String> strings, Function<String, Integer> function) {
		return strings.stream().map(function).collect(Collectors.toList());
	}
}
