package com.qa.day3.animal_exercise;

public class Runner {

	public static void main(String[] args) {
		// Testing stuff 
		Cat cat = new Cat("black", 4, 9, "Tabby");
		System.out.println(cat.getBreed());
		cat.makeNoise();
		System.out.println(cat.getAge());
		System.out.println(cat);
		System.out.println(Animal.numOfAnimals);
		Dog dog = new Dog("brown", 4, 3, "Staffy");
		dog.makeNoise();
		System.out.println(Animal.numOfAnimals);
	}	
}
