package com.qa.day4.vehicle_exercise;

public class Motorcycle extends Vehicle {

	private int handleBarWidth;
	
	public Motorcycle(String colour, String manufacturer, int numOfWheels, double price, int id, int handleBarWidth) {
		super(colour, manufacturer, numOfWheels, price, id);
		this.handleBarWidth = handleBarWidth;
	}
	
	public void setHandleBarWidth(int handleBarWidth) {
		this.handleBarWidth = handleBarWidth;
	}
	
	public int getHandleBarWidth() {
		return this.handleBarWidth;
	}
	
	public void popWheelie() {
		System.out.println("I should probably never do this again...");
	}

	@Override
	public double calculateBill() {
		return this.getHandleBarWidth() * 39.99;
	}
}
