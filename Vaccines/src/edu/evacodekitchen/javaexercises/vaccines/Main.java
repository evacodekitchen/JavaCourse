package edu.evacodekitchen.javaexercises.vaccines;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		LocalDate calculatedDateOfSecondShotForPfizer = Vaccine.PFIZER.calculateDateOfSecondShot(LocalDate.now());
		System.out.println("second shot should be given on: " + calculatedDateOfSecondShotForPfizer);
		
		LocalDate calculatedDateOfSecondShotOfModerna = Vaccine.MODERNA.calculateDateOfSecondShot(LocalDate.of(2021, 01, 10));
		System.out.println("second shot should be given on: " + calculatedDateOfSecondShotOfModerna);
		
		LocalDate calculatedDateOfSecondShotOfJohnson = Vaccine.JOHNSON_AND_JOHNSON.calculateDateOfSecondShot(LocalDate.of(2021, 03, 01));
		System.out.println("second shot should be given on: " + calculatedDateOfSecondShotOfJohnson);
		
	}
}
