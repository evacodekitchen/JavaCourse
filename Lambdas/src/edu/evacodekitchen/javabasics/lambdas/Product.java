package edu.evacodekitchen.javabasics.lambdas;

public class Product {
	private Category category;
	private String name;
	private int price;

	public Product(String name, int price, Category category) {
		super();
		this.name = name;
		this.price = price;
		this.category = category;
	}

	public Category getCategory() {
		return category;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", category=" + category + "]";
	}
}
