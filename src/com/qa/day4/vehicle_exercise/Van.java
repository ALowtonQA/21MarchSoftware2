package com.qa.day4.vehicle_exercise;

public class Van extends Vehicle{

	private int storageSpace;
	
	public Van(String colour, String manufacturer, int numOfWheels, double price, int id, int storageSpace) {
		super(colour, manufacturer, numOfWheels, price, id);
		this.storageSpace = storageSpace;
	}
	
	public void setStorageSpace(int storageSpace) {
		this.storageSpace = storageSpace;
	}
	
	public int getStorageSpace() {
		return this.storageSpace;
	}
}
