package edu.evacodekitchen.javabasics;

public class ObjectExampleWithCarWithCharArray {
	
	public static void main(String[] args) {
		CarWithCharArray toyotaPrius = new CarWithCharArray();
		toyotaPrius.brand = new char[] {'T', 'o', 'y', 'o', 't', 'a'};
		toyotaPrius.type = new char[] {'P', 'r', 'i', 'u', 's'};
		toyotaPrius.licensePlateNumber = new char[] {'A', 'B', 'C', '1', '2', '3'};
		toyotaPrius.currentSpeed = 0;
		toyotaPrius.numberOfSeats = 5;
		
		CarWithCharArray suzukiSwift = new CarWithCharArray();
		suzukiSwift.brand = new char[] {'S', 'u', 'z', 'u', 'k', 'i'};
		suzukiSwift.type = new char[] {'S', 'w', 'i', 'f', 't'};
		suzukiSwift.licensePlateNumber = new char[] {'D', 'E', 'F', '4', '5', '6'};
		suzukiSwift.currentSpeed = 0;
		suzukiSwift.numberOfSeats = 5;
		
	}

}
