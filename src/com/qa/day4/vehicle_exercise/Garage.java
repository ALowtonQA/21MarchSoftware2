package com.qa.day4.vehicle_exercise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Garage {

	private ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
	
	public void addVehicle(Vehicle vehicle) {
		this.vehicles.add(vehicle);
	}
	
	public void removeVehiclesByType(Class<?> c) {
	    List<Vehicle> toRemove = new ArrayList<>();
	    for (Vehicle v : vehicles) {
	        if (v.getClass() == c) {
	            toRemove.add(v);
	        }
	    }
	    if (vehicles.removeAll(toRemove)) {
	    	System.out.println("\n\nVehicle(s) removed.");
	    } else {
	    	System.out.println("\n\nVehicle(s) not found.");
	    }
	}
	
	public void removeVehicleById(int id) {
		boolean found = false;
		Iterator<Vehicle> itr = vehicles.iterator();
	    while (itr.hasNext()) {
	      Vehicle vehicle = itr.next();
	      if (vehicle.getId() == id) {
	        itr.remove();
	        found = true;
	      }
	    }
		
		if (found) {
			System.out.println("\n\nVehicle removed.");
		} else {
			System.out.println("\n\nVehicle not found.");
		}
	}
	
	public void emptyGarage() {
		System.out.println("\n\nVehicle(s) removed.");
		vehicles.clear();
	}
	
	public void calculateBills() {
		double costToFix = 0;
		for (Vehicle vehicle : vehicles) {
			switch(vehicle.getClass().getSimpleName()) {
				case "Car":
					double cModifier = ((Car) vehicle).getNumOfDoors() * 10;
					costToFix = 49.99 * cModifier;
					System.out.println("Vehicle ID: " + vehicle.getId() + "\n Cost to fix: " + costToFix);
					break;
				case "Van":
					double vModifier = ((Van) vehicle).getStorageSpace() / 100;
					costToFix = 99.99 * vModifier;
					System.out.println("Vehicle ID: " + vehicle.getId() + "\n Cost to fix: " + costToFix);
					break;
				case "Motorcycle":
					costToFix = 39.99 * ((Motorcycle) vehicle).getHandleBarWidth();
					System.out.println("Vehicle ID: " + vehicle.getId() + "\n Cost to fix: " + costToFix);
					break;
				default:
					costToFix = 99.99;
			}
		}
		System.out.println("-----------------------------");
	}
	
	public void printAll() {
		System.out.println("\n\n---------------------------------------------------------------------------------------");
		System.out.println("--------------------------------Full list of vehicles----------------------------------");
		System.out.println("---------------------------------------------------------------------------------------");
		for (Vehicle vehicle : vehicles) {
			System.out.println(vehicle);
			System.out.println("---------------------------------------------------------------------------------------");
		}
	}
}
