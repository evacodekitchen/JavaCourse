package edu.evacodekitchen.javabasics;

public class ContructorExample {
	
	public static void main(String[] args) {
		
		Car suzukiSwift = new Car();
		suzukiSwift.brand = "Suzuki";
		suzukiSwift.type = "Swift";
		suzukiSwift.licensePlateNumber = "DEF456";
		suzukiSwift.currentSpeed = 0;
		suzukiSwift.numberOfSeats = 5;
		
		System.out.println(suzukiSwift);
	}

}
