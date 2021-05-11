package edu.evacodekitchen.javaexercises.vaccines;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public enum Vaccine {
	SPUTNYIK(21, 2), PFIZER(21, 2), MODERNA(28, 2), JOHNSON_AND_JOHNSON(0, 1);
	
	private Vaccine(Integer secondShotTimingInDays, Integer nrOfShotsRequired) {
		this.secondShotTimingInDays = secondShotTimingInDays;
		this.nrOfShotsRequired = nrOfShotsRequired;
	}

	private Integer secondShotTimingInDays;
	
	private Integer nrOfShotsRequired;
	
	
	public LocalDate calculateDateOfSecondShot(LocalDate dateOfFirstShot) throws SecondShotNotNeededException {
		if (nrOfShotsRequired == 1) {
			throw new SecondShotNotNeededException();
		}
		return dateOfFirstShot.plus(secondShotTimingInDays, ChronoUnit.DAYS);
	}
	
	
}
