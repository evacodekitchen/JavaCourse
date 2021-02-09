package edu.evacodekitchen.javabasics.collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	public static void main(String[] args) {
		Map<String, String> phoneBook = new HashMap<>();
		
		phoneBook.put("Kis Mikl�s", "+36201234567");
		phoneBook.put("B�r� R�za", "+36301234545");
		phoneBook.put("Jakucs Pista", "+36200124598");
		
		System.out.println(phoneBook);
		int size = phoneBook.size();
		System.out.println(size);
		System.out.println("Does it contain B�r� R�za? " + phoneBook.containsKey("B�r� R�za"));
		phoneBook.remove("B�r� R�za");
		System.out.println(phoneBook);
		System.out.println("Does it contain B�r� R�za? " + phoneBook.containsKey("B�r� R�za"));
		System.out.println("Phone number of B�r� R�za is: " + phoneBook.get("B�r� R�za"));
		System.out.println("Phone number of Jakucs Pista is: " + phoneBook.get("Jakucs Pista"));
		System.out.println("All contacts: " + phoneBook.keySet());
		phoneBook.put("Jakucs Pista", "+36201111111");
		System.out.println(phoneBook);
	}
}
