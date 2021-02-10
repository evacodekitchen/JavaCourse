package edu.evacodekitchen.javabasics.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaExampleWithStreams {
	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(new Product("Ceres bread", 10, Category.FOOD));
		products.add(new Product("Jokenyer bread", 13, Category.FOOD));
		products.add(new Product("doll", 50, Category.TOYS));
		products.add(new Product("orange", 20, Category.FOOD));
		products.add(new Product("trousers", 60, Category.CLOTHES));
		products.add(new Product("car", 40, Category.TOYS));

		List<Product> nameSearchResult = search(products, p -> p.getName().contains("bread"));

		System.out.println(nameSearchResult);

		List<Product> priceSearchResult = search(products, p -> p.getPrice() < 40);

		System.out.println(priceSearchResult);

		List<Product> priceAndNameSearchResult = search(products,
				p -> p.getName().contains("bread") && p.getPrice() < 40);

		System.out.println(priceAndNameSearchResult);
	}

	private static List<Product> search(List<Product> products, Predicate<Product> productChecker) {
		return products.stream().filter(productChecker).collect(Collectors.toList());
	}
}
