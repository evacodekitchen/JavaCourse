package edu.evacodekitchen.javabasics.collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample1 {
	
	public static void main(String[] args) {
		Set<String> cities = new HashSet<>();
		cities.add("Budapest");
		cities.add("Debrecen");
		cities.add("Szolnok");
		cities.add("Kolozsvár");
		cities.add("Temesvár");
		
		System.out.println(cities);
		int size = cities.size();
		System.out.println(size);
		System.out.println("Does it contain Kolozsvár? " + cities.contains("Kolozsvár"));
		cities.remove("Kolozsvár");
		System.out.println(cities);
		System.out.println("Does it contain Kolozsvár? " + cities.contains("Kolozsvár"));
	}

}
