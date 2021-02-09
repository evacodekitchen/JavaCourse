package edu.evacodekitchen.javabasics.interfaces.withinterfaces;

import edu.evacodekitchen.javabasics.interfaces.FloorMap;

public class RobiR3RobotVacuum extends Rechargeable implements AutomatedCleaner{

	@Override
	public void startCleaning() {
		// some implementation with cleaning algorithm V1
	}

	@Override
	public void stopCleaning() {
		// some implementation
	}

	@Override
	public FloorMap getLastCleaningMap() {
		// some implementation
		return null;
	}

	
}
