package edu.evacodekitchen.javaexercises.houseplans;

public class HousePlan {

	private Integer id;
	private Integer totalArea;
	private Integer nrOfBedrooms;
	private Integer nrOfBathrooms;
	private boolean hasGarage;

	public HousePlan(Integer id, Integer totalArea, Integer nrOfBedrooms, Integer nrOfBathrooms, boolean hasGarage) {
		this.id = id;
		this.totalArea = totalArea;
		this.nrOfBedrooms = nrOfBedrooms;
		this.nrOfBathrooms = nrOfBathrooms;
		this.hasGarage = hasGarage;
	}

	public Integer getNrOfBathrooms() {
		return nrOfBathrooms;
	}

	public Integer getNrOfBedrooms() {
		return nrOfBedrooms;
	}

	public Integer getTotalArea() {
		return totalArea;
	}

	public boolean isHasGarage() {
		return hasGarage;
	}

	public void setHasGarage(boolean hasGarage) {
		this.hasGarage = hasGarage;
	}

	public void setNrOfBathrooms(Integer nrOfBathrooms) {
		this.nrOfBathrooms = nrOfBathrooms;
	}

	public void setNrOfBedrooms(Integer nrOfBedrooms) {
		this.nrOfBedrooms = nrOfBedrooms;
	}

	public void setTotalArea(Integer totalArea) {
		this.totalArea = totalArea;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "HousePlan [id=" + id + ", totalArea=" + totalArea + ", nrOfBedrooms=" + nrOfBedrooms
				+ ", nrOfBathrooms=" + nrOfBathrooms + ", hasGarage=" + hasGarage + "]";
	}

}
