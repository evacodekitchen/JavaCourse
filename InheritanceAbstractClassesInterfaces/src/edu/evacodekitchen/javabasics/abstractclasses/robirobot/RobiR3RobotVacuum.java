package edu.evacodekitchen.javabasics.abstractclasses.robirobot;

import edu.evacodekitchen.javabasics.interfaces.FloorMap;

public class RobiR3RobotVacuum extends RobiRobotVacuum{

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
