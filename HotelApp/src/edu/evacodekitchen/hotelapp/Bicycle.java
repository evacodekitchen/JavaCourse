package edu.evacodekitchen.hotelapp;

public class Bicycle implements Rentable{

	private int id;

	public Bicycle(int id) {
		this.id = id;
	}

	@Override
	public int getPricePerDay() {
		return 100;
	}

}
