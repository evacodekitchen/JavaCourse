package edu.evacodekitchen.javabasics.interfaces.withinterfaces;

import edu.evacodekitchen.javabasics.interfaces.FloorMap;

public interface AutomatedCleaner {
    final static int NR_OF_SIDE_BRUSHES = 1;
	
	void startCleaning();
	
	void stopCleaning();
		
	FloorMap getLastCleaningMap();
}
