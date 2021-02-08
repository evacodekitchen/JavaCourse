package edu.evacodekitchen.javabasics.enums.iterationovervalues;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("The cheapest for 2 kg: " + ShippingMethod.getTheCheapest(2000));
		System.out.println("The cheapest for 1 kg: " + ShippingMethod.getTheCheapest(1000));
	}

}
