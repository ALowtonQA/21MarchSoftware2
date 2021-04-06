package com.qa.day3.animal_exercise;

public class Cat extends Animal {
	
	private String breed;
	
	public Cat (String colour, int legs, int age, String breed) {
		this.setColour(colour);
		this.setLegs(legs);
		this.setAge(age);
		this.breed = breed;
	}
	
	public String getBreed() {
		return this.breed;
	}
	
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public void makeNoise() {
		System.out.println("Meooooow");
	}
}
