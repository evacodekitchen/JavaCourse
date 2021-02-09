package edu.evacodekitchen.javabasics.interfaces.withinterfaces;

import edu.evacodekitchen.javabasics.interfaces.Battery;

public abstract class Rechargeable {
	
	private Battery battery;
		
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
