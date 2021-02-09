package edu.evacodekitchen.javabasics.generics;

import edu.evacodekitchen.javabasics.collections.Product;

public class MyGenericClassExample {
	
	public static void main(String[] args) {
		MyContainer<Integer> container = new MyContainer<Integer>(3);
		
		System.out.println(container.getItem());
		
		MyContainer<Product> wrappedProduct = new MyContainer<Product>(new Product("chocolate", 20));
		System.out.println(wrappedProduct.getItem());
	}
	
	public static class MyContainer<E>{
		
		private E item;
		
		public MyContainer(E item) {
			this.item = item; 
		}

		public E getItem() {
			return item;
		}
		
	}

}
