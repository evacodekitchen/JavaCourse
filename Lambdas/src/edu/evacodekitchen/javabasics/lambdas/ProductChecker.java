package edu.evacodekitchen.javabasics.lambdas;

@FunctionalInterface
public interface ProductChecker {
	boolean checkForCriteria(Product product);
}
