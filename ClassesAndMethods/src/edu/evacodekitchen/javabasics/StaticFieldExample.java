package edu.evacodekitchen.javabasics;

public class StaticFieldExample {

	public static void main(String[] args) {

		System.out.println("original format: " + Car.licensePlateNumberFormat);

		Car car1 = new Car();
		Car car2 = new Car();
		
		System.out.println("car1 format: " + car1.licensePlateNumberFormat);
		
		Car.licensePlateNumberFormat = "LLLNNN";
		
		System.out.println("modified format: " + Car.licensePlateNumberFormat);
		System.out.println("car1 format: " + car1.licensePlateNumberFormat);
		System.out.println("car1 format: " + car2.licensePlateNumberFormat);
	}

}
