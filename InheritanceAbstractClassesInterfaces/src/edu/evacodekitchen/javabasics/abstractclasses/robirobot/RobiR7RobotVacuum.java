package edu.evacodekitchen.javabasics.abstractclasses.robirobot;

import edu.evacodekitchen.javabasics.interfaces.FloorMap;

public class RobiR7RobotVacuum extends RobiRobotVacuum{

	@Override
	public void startCleaning() {
		// some implementation with cleaning algorithm V2
	}

	@Override
	public void stopCleaning() {
		// some other implementation
	}

	@Override
	public FloorMap getLastCleaningMap() {
		// some other implementation
		return null;
	}

}
