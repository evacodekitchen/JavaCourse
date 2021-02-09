package edu.evacodekitchen.javabasics.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
	
	public static void main(String[] args) {
		List<String> cities = new ArrayList<>();
		cities.add("Budapest");
		cities.add("Debrecen");
		cities.add("Szolnok");
		cities.add("Kolozsv�r");
		cities.add("Temesv�r");
		
		System.out.println(cities);
		int size = cities.size();
		System.out.println(size);
		System.out.println("Does it contain Kolozsv�r? " + cities.contains("Kolozsv�r"));
		cities.remove(3);
		System.out.println(cities);
		System.out.println("Does it contain Kolozsv�r? " + cities.contains("Kolozsv�r"));
		
		for (int i = 0; i < cities.size(); i++) {
			System.out.println("index of item: " + i + ", item: " + cities.get(i));
		}
		
		for (String city : cities) {
			System.out.println("item: " + city);
		}
	}

}
