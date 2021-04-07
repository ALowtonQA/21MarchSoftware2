package com.qa.day4.vehicle_exercise;

public class Vehicle {

	private String manufacturer;
	private String colour;
	private String type;
	private int numOfWheels;
	private double price;
	private int id;
	
	public Vehicle (String colour, String manufacturer, int numOfWheels, double price, int id) {
		this.colour = colour;
		this.manufacturer = manufacturer;
		this.numOfWheels = numOfWheels;
		this.price = price;
		this.id = id;
	}
	
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getManufacturer() {
		return this.manufacturer;
	}
	
	public String getColour() {
		return this.colour;
	}
	
	public int getNumOfWheels() {
		return this.numOfWheels;
	}
	
	public Double getPrice() {
		return this.price;
	}
	
	public String getType() {
		return this.type;
	}
	
	public int getId() {
		return this.id;
	}
	
	@Override
	public String toString() {
		if (this.type != null) {
			return String.format("This vehicle is a %s %s made by %s, with %d wheels and costs %.2f", colour, type, manufacturer, numOfWheels, price);
		} else {
			return String.format("This a %s vehicle made by %s, with %d wheels and costs %.2f", colour, manufacturer, numOfWheels, price);
		}
	}
}
