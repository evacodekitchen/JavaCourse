package edu.evacodekitchen.javabasics.collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample2 {
	
	public static void main(String[] args) {
		Map<Device, Report> reportsPerDevices = new HashMap<>();
		Device device1 = new Device(12, "someManifacturer1", "someType1");
		reportsPerDevices.put(device1, new Report("some text1"));
		reportsPerDevices.put(new Device(234, "someManifacturer2", "someType2"), new Report("some text2"));
		reportsPerDevices.put(new Device(567, "someManifacturer3", "someType3"), new Report("some text3"));
		
		System.out.println(reportsPerDevices.containsKey(device1));
		Device device1Again = new Device(12, "someManifacturer1", "someType1");
		System.out.println("hascode of device1Again: " + device1Again);
		System.out.println(reportsPerDevices.containsKey(device1Again));
		
		System.out.println(reportsPerDevices.keySet());
	}

}
