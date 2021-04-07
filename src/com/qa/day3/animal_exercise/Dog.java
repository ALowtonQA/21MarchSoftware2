package com.qa.day3.animal_exercise;

public class Dog extends Animal {

	private String breed;
	
	public Dog (String colour, int legs, int age, String breed) {
		this.setColour(colour);
		this.setLegs(legs);
		this.setAge(age);
		this.breed = breed;
		Animal.numOfAnimals++;
	}
	
	public String getBreed() {
		return this.breed;
	}
	
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public void makeNoise() {
		System.out.println("Woof");
	}
}
