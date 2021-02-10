package edu.evacodekitchen.javabasics.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaExampleWithStreams2 {
	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(new Product("Ceres bread", 10, Category.FOOD));
		products.add(new Product("Jokenyer bread", 13, Category.FOOD));
		products.add(new Product("doll", 50, Category.TOYS));
		products.add(new Product("orange", 20, Category.FOOD));
		products.add(new Product("trousers", 60, Category.CLOTHES));
		products.add(new Product("car", 40, Category.TOYS));

		List<Product> nameSearchResult = products.stream().filter((Predicate<Product>) p -> p.getName().contains("bread")).collect(Collectors.toList());

		System.out.println(nameSearchResult);

		List<Product> priceSearchResult = products.stream().filter((Predicate<Product>) p -> p.getPrice() < 40).collect(Collectors.toList());

		System.out.println(priceSearchResult);

		List<Product> priceAndNameSearchResult = products.stream().filter((Predicate<Product>) p -> p.getName().contains("bread") && p.getPrice() < 40).collect(Collectors.toList());

		System.out.println(priceAndNameSearchResult);
		
		List<Product> categorySearchResult = products.stream().filter(p -> p.getCategory().equals(Category.CLOTHES) || p.getCategory().equals(Category.TOYS)).collect(Collectors.toList());
		System.out.println(categorySearchResult);
		
		Map<Category, List<Product>> groupedProducts = products.stream().collect(Collectors.groupingBy((product) -> product.getCategory()));
		
		System.out.println(groupedProducts);
	}
}
