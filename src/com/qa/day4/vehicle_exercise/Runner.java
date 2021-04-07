package com.qa.day4.vehicle_exercise;

public class Runner {

	public static void main(String[] args) {
		// Vehicle Block
		Car cOne = new Car("black", "Ford", 4, 25999.99, 1, 5, false);
		Motorcycle mOne = new Motorcycle("yellow", "ducati", 2, 19999.99, 2, 50);
		Van vOne = new Van("red", "mercedes", 4, 24999.99, 3, 5000);
		
		// Garage Block
		Garage garage = new Garage();
		garage.addVehicle(cOne);
		garage.addVehicle(mOne);
		garage.addVehicle(vOne);
		
		// Method test block
		garage.printAll();
		garage.calculateBills();
		garage.removeVehicleById(1);
		garage.printAll();
		garage.removeVehiclesByType(Van.class);
		garage.printAll();
		garage.emptyGarage();
		garage.printAll();
		
	}
}
