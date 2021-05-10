package edu.evacodekitchen.javaexercises.houseplans;

public class HouseImplementationCostCalulator {
	
	public static Float caculateCostOfImplementationOf(HousePlan housePlan) {
		return housePlan.getTotalArea() * 100.0f;
	}

}
