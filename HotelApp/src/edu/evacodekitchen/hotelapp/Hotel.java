package edu.evacodekitchen.hotelapp;

public class Hotel {

	private RoomType[] roomTypes;
	private Bicycle[] bicyles;
	
	private Guest[] guests;
	private int currentNrOfGuests = 0;

	public Hotel(RoomType[] roomTypes, Bicycle[] bicyles) {
		this.roomTypes = roomTypes;
		this.bicyles = bicyles;
		guests = new Guest[10];
	}

	public void addGuest(Guest guest) {
		currentNrOfGuests++;
		guests[currentNrOfGuests - 1] = guest;
	}

	public int calculateFinalPrice(Guest guest) {
		int finalPrice = 0;
		
		Bicycle bicycle = guest.getRentedBicyle();
		if (bicycle != null) {
			int nrOfDaysToRentTheBicycle = guest.getNrOfDaysToRentTheBicycle();
			finalPrice = bicycle.getPricePerDay() * nrOfDaysToRentTheBicycle;			
		}
		
		RoomType rentedRoomType = guest.getRentedRoomType();
		int nrOfDaysToRentTheRoom = guest.getNrOfDaysToRentTheRoom();
		finalPrice += rentedRoomType.getPricePerDay() * nrOfDaysToRentTheRoom;
		
		return finalPrice;
	}

}
