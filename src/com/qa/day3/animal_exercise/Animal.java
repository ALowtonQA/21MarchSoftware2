package com.qa.day3.animal_exercise;

public abstract class Animal {
	
	private String colour;
	private int legs;
	private int age;

	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public void setLegs (int legs) {
		this.legs = legs;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public String getColour() {
		return this.colour;
	}
	
	public int getLegs() {
		return this.legs;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public abstract void makeNoise();
	
	@Override
	public String toString() {
		return String.format("This animal is %s, has %i legs and is %i years old.", colour, legs, age);
	}
}
