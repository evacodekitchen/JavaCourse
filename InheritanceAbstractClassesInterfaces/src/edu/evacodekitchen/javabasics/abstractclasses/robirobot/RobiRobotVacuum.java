package edu.evacodekitchen.javabasics.abstractclasses.robirobot;

import edu.evacodekitchen.javabasics.interfaces.Battery;
import edu.evacodekitchen.javabasics.interfaces.FloorMap;

public abstract class RobiRobotVacuum {
	
	private Battery battery;
	
	public final static int NR_OF_SIDE_BRUSHES = 1;
	
	public abstract void startCleaning();
	
	public abstract void stopCleaning();
		
	public abstract FloorMap getLastCleaningMap();
	
	public float getRemainingBatteryPercentage() {
		return 100 - battery.getActualPercentage();
	}
	
	public void startCharging() {
		battery.startCharging();
	}

	public void stopCharging() {
		battery.stopCharging();
	}

}
