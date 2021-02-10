package edu.evacodekitchen.javabasics.lambdas;

@FunctionalInterface
public interface FilteringCriteria {
	boolean criteriaMatches(Product product);
}
