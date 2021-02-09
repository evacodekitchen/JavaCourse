package edu.evacodekitchen.javabasics;

public class CarWithCharArray {
	
	char[] licensePlateNumber;
	char[] brand;
	char[] type;
	int numberOfSeats;
	int currentSpeed;
	
	void accelerate() {
		currentSpeed++;
	}
	
	void stop() {
		currentSpeed = 0;
	}
	
}
