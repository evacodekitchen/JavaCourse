package edu.evacodekitchen.javabasics;

public class ObjectExampleWithCar {
	
	public static void main(String[] args) {
		
		Car toyotaPrius = new Car();
		toyotaPrius.brand = "Toyota";
		toyotaPrius.type = "Prius";
		toyotaPrius.licensePlateNumber = "ABCC123";
		toyotaPrius.currentSpeed = 0;
		toyotaPrius.numberOfSeats = 5;
		
		Car suzukiSwift = new Car();
		suzukiSwift.brand = "Suzuki";
		suzukiSwift.type = "Swift";
		suzukiSwift.licensePlateNumber = "DEF456";
		suzukiSwift.currentSpeed = 0;
		suzukiSwift.numberOfSeats = 5;
		
		System.out.println(suzukiSwift);
		
		Car nissanLeaf = new Car("XYZ345", "Nissan", "Leaf", 5, 0);
		System.out.println(nissanLeaf);
		
		Car someCar = new Car();
		System.out.println(someCar);
		
		nissanLeaf.accelerate(10);
		
		nissanLeaf.stop();
		
		String fullName = nissanLeaf.getFullName();
		System.out.println(fullName);
		
		System.out.println(nissanLeaf.getFullName());
		
		Car someOtherCar = new Car();
		someOtherCar.accelerate();
	}

}
