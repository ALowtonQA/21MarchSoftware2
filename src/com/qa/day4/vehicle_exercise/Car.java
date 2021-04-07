package com.qa.day4.vehicle_exercise;

public class Car extends Vehicle {

	private boolean hasSunRoof;
	private int numOfDoors;
	
	public Car(String colour, String manufacturer, int numOfWheels, double price, int id, int numOfDoors, boolean hasSunRoof) {
		super(colour, manufacturer, numOfWheels, price, id);
		super.setType("Car");
		this.numOfDoors = numOfDoors;
		this.hasSunRoof = hasSunRoof;	
	}
	
	public void setHasSunRoof(boolean hasSunRoof) {
		this.hasSunRoof = hasSunRoof;
	}
	
	public boolean getHasSunRoof() {
		return this.hasSunRoof;
	}
	
	public void setNumOfDoors(int numOfDoors) {
		this.numOfDoors = numOfDoors;
	}
	
	public int getNumOfDoors() {
		return this.numOfDoors;
	}
}
