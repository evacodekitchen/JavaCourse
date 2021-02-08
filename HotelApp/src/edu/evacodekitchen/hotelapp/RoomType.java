package edu.evacodekitchen.hotelapp;

public enum RoomType implements Rentable {
	
	SINGLE(200), DOUBLE(400), LUXORY(600), FAMILY(500);

	private int pricePerDay;

	RoomType(int pricePerDay) {
		this.pricePerDay = pricePerDay;
	}

	@Override
	public int getPricePerDay() {
		return pricePerDay;
	}
}
