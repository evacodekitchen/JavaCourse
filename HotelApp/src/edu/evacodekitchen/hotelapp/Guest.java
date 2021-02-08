package edu.evacodekitchen.hotelapp;

public class Guest {

	private String name;
	private RoomType rentedRoomType;
	private int nrOfDaysToRentTheRoom;
	private Bicycle rentedBicycle;
	private int nrOfDaysToRentTheBicycle;

	public Guest(String name, RoomType rentedRoomType, int nrOfDaysToRent) {
		this.name = name;
		this.rentedRoomType = rentedRoomType;
		this.nrOfDaysToRentTheRoom = nrOfDaysToRent;
	}

	public void rentBicycle(Bicycle bicycle, int nrOfDaysToRent) {
		this.rentedBicycle = bicycle;
		this.nrOfDaysToRentTheBicycle = nrOfDaysToRent;
	}

	public Bicycle getRentedBicyle() {
		return rentedBicycle;
	}

	public int getNrOfDaysToRentTheBicycle() {
		return nrOfDaysToRentTheBicycle;
	}

	public RoomType getRentedRoomType() {
		return rentedRoomType;
	}

	public int getNrOfDaysToRentTheRoom() {
		return nrOfDaysToRentTheRoom;
	}

}
