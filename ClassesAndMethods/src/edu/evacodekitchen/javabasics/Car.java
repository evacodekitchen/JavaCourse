package edu.evacodekitchen.javabasics;

public class Car {

	String licensePlateNumber;
	String brand;
	String type;
	int numberOfSeats;
	int currentSpeed;
	static String licensePlateNumberFormat = "LLL-NNN";

	Car() {

	}

	public Car(String licensePlateNumber, String brand, String type, int numberOfSeats, int currentSpeed) {
		this.licensePlateNumber = licensePlateNumber;
		this.brand = brand;
		this.type = type;
		this.numberOfSeats = numberOfSeats;
		this.currentSpeed = currentSpeed;
	}

	void accelerate(int desiredSpeed) {
		while (currentSpeed < desiredSpeed) {
			currentSpeed++;
			System.out.println("Accelerating to " + desiredSpeed + ". Current speed: " + currentSpeed);
		}
	}

	void accelerate() {
		currentSpeed++;
	}

	void stop() {
		currentSpeed = 0;
		System.out.println("Stopped. Current speed: " + currentSpeed);
	}

	String getFullName() {
		String fullName = brand + " " + type;
		return fullName;
	}

	@Override
	public String toString() {
		return "Car [licensePlateNumber=" + licensePlateNumber + ", brand=" + brand + ", type=" + type
				+ ", numberOfSeats=" + numberOfSeats + ", currentSpeed=" + currentSpeed + "]";
	}

}
