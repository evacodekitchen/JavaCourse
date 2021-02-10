package edu.evacodekitchen.javabasics.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LearningLambdas {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(new Product("Ceres bread", 10, Category.FOOD));
		products.add(new Product("Jokenyer bread", 13, Category.FOOD));
		products.add(new Product("doll", 50, Category.TOYS));
		products.add(new Product("orange", 20, Category.FOOD));
		products.add(new Product("trousers", 60, Category.CLOTHES));
		products.add(new Product("car", 40, Category.TOYS));

		String searchedProductNamePart = "bread";
		List<Product> productsFilteredByName = products.stream()
				.filter(p -> p.getName().contains(searchedProductNamePart)).collect(Collectors.toList());
		System.out.println(productsFilteredByName);

		int productPriceLessThan = 12;
		List<Product> productsFilteredByPrice = products.stream().filter(p -> p.getPrice() < productPriceLessThan)
				.collect(Collectors.toList());
		System.out.println(productsFilteredByPrice);

		List<Product> productsFilteredByNameAndPrice = products.stream()
				.filter(p -> p.getName().contains(searchedProductNamePart) && p.getPrice() < productPriceLessThan)
				.collect(Collectors.toList());

		System.out.println(productsFilteredByNameAndPrice);

		List<Product> productsFilteredByCategories = products.stream()
				.filter(product -> product.getCategory().equals(Category.CLOTHES)
						|| product.getCategory().equals(Category.TOYS))
				.collect(Collectors.toList());
		
		System.out.println(productsFilteredByCategories);
		
		Map<Object, List<Product>> productsGroupedByCategory = products.stream().collect(Collectors.groupingBy(p -> p.getCategory()));
		
		System.out.println(productsGroupedByCategory);
		

	}
}