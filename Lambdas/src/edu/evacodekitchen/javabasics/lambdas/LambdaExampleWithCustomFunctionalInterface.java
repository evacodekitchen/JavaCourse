package edu.evacodekitchen.javabasics.lambdas;

import java.util.ArrayList;
import java.util.List;

public class LambdaExampleWithCustomFunctionalInterface {
	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(new Product("Ceres bread", 10, Category.FOOD));
		products.add(new Product("Jokenyer bread", 13, Category.FOOD));
		products.add(new Product("doll", 50, Category.TOYS));
		products.add(new Product("orange", 20, Category.FOOD));
		products.add(new Product("trousers", 60, Category.CLOTHES));
		products.add(new Product("car", 40, Category.TOYS));

//		List<Product> nameSearchResult = search(products, new ProductChecker() {
//			
//			@Override
//			public boolean checkForCriteria(Product product) {
//				return product.getName().contains(productNameFromUserInput);
//			}
//		});

		List<Product> nameSearchResult = search(products, product -> product.getName().contains("bread"));

		System.out.println(nameSearchResult);

		int productPriceFromUserInput = 40;
//		
//		List<Product> priceSearchResult = search(products, new ProductChecker() {
//			
//			@Override
//			public boolean checkForCriteria(Product product) {
//				return product.getPrice() < productPriceFromUserInput;
//			}
//		});

		List<Product> priceSearchResult = search(products, p -> p.getPrice() < 40);

		System.out.println(priceSearchResult);

//		List<Product> priceAndNameSearchResult = search(products, new ProductChecker() {
//			
//			@Override
//			public boolean checkForCriteria(Product product) {
//				return product.getName().contains("bread") && product.getPrice() < productPriceFromUserInput;
//			}
//		});
//		

		List<Product> priceAndNameSearchResult = search(products,
				p -> p.getName().contains("bread") && p.getPrice() < 40);

		System.out.println(priceAndNameSearchResult);
	}

	private static List<Product> search(List<Product> products, ProductChecker productChecker) {
		List<Product> searchResult = new ArrayList<>();
		for (Product product : products) {
			if (productChecker.checkForCriteria(product)) {
				searchResult.add(product);
			}
		}
		return searchResult;
	}

//	private static List<Product> searchByPriceAndName(List<Product> products, int productPriceFromUserInput,
//			String productNameFromUserInput) {
//		List<Product> searchResult = new ArrayList<>();
//		for (Product product : products) {
//			if (product.getPrice() < productPriceFromUserInput && product.getName().contains(productNameFromUserInput)) {
//				searchResult.add(product);
//			}
//		}
//		return searchResult;
//	}

//	private static List<Product> searchByPrice(List<Product> products, int productPriceFromUserInput) {
//		List<Product> searchResult = new ArrayList<>();
//		for (Product product : products) {
//			if (product.getPrice() < productPriceFromUserInput) {
//				searchResult.add(product);
//			}
//		}
//		return searchResult;
//	}
//
//	private static List<Product> searchByName(List<Product> products, String productNameFromUserInput) {
//		List<Product> searchResult = new ArrayList<>();
//		for (Product product : products) {
//			if (product.getName().contains(productNameFromUserInput)) {
//				searchResult.add(product);
//			}
//		}
//		return searchResult;
//	}
}
