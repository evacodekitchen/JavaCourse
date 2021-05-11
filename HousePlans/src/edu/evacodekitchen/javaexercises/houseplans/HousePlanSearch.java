package edu.evacodekitchen.javaexercises.houseplans;

import java.util.Arrays;

public class HousePlanSearch {

	public static void main(String[] args) {
		HousePlan housePlan1 = new HousePlan(1, 100, 2, 1, false);
		HousePlan housePlan2 = new HousePlan(2, 240, 6, 3, true);
		HousePlan housePlan3 = new HousePlan(3, 220, 4, 1, true);
		
		HousePlan[] housePlans = new HousePlan[] {housePlan1, housePlan2, housePlan3};
		
		HousePlan[] smallHouses = searchForSmallerThan(housePlans, 221);
		System.out.println(Arrays.toString(smallHouses));

		HousePlan[] cheapHouses = searchForCheaperThan(housePlans, 21000f);
		System.out.println(Arrays.toString(cheapHouses));
		
	}

	public static HousePlan[] searchForSmallerThan(HousePlan[] housePlans, Integer aTotalArea){
		HousePlan[] searchResult = new HousePlan[housePlans.length];
		Integer indexOfActualFoundHousePlan = 0;
		for (HousePlan housePlan : housePlans) {
			if (housePlan.getTotalArea() < aTotalArea) {
				searchResult[indexOfActualFoundHousePlan++] = housePlan;
			}
		}
		return searchResult;
	}

	public static HousePlan[] searchForCheaperThan(HousePlan[] housePlans, Float aPrice){
		HousePlan[] searchResult = new HousePlan[housePlans.length];
		Integer indexOfActualFoundHousePlan = 0;
		for (HousePlan housePlan : housePlans) {
			if (HouseImplementationCostCalulator.caculateCostOfImplementationOf(housePlan) < aPrice) {
				searchResult[indexOfActualFoundHousePlan++] = housePlan;
			}
		}
		return searchResult;
	}
	
}
