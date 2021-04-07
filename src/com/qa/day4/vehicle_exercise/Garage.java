package com.qa.day4.vehicle_exercise;

import java.util.ArrayList;
import java.util.Iterator;

public class Garage {

	private ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
	
	public void addVehicle(Vehicle vehicle) {
		this.vehicles.add(vehicle);
	}
	
	public void removeVehicle(Vehicle v) {
		if (this.vehicles.remove(v)) {
			System.out.println("\n\nVehicle removed.");
		} else {
			System.out.println("\n\nVehicle not found.");
		}
	}
	
	public void removeVehiclesByType(Class<?> c) {
	    ArrayList<Vehicle> toRemove = new ArrayList<>();
	    for (Vehicle v : this.vehicles) {
	        if (v.getClass() == c) {
	            toRemove.add(v);
	        }
	    }
	    if (this.vehicles.removeAll(toRemove)) {
	    	System.out.println("\n\nVehicle(s) removed.");
	    } else {
	    	System.out.println("\n\nVehicle(s) not found.");
	    }
	}
	
	public void removeVehicleById(int id) {
		boolean found = false;
		Iterator<Vehicle> itr = this.vehicles.iterator();
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
		this.vehicles.clear();
	}
	
	public void getBillById(int id) {
		for (Vehicle vehicle : this.vehicles) {
			if (vehicle.getId() == id) {
				System.out.println("--------------------------------------------------------------------------------------------");
				System.out.println(String.format("\nVehicle: %s %s\nID: %d\nCost to fix: %.2f", vehicle.getColour(), vehicle.getManufacturer(), id, vehicle.calculateBill()));
				break;
			}
		}
	}
	
	public void calculateIndividualBills() {
		for (Vehicle vehicle : this.vehicles) {
			System.out.println("--------------------------------------------------------------------------------------------");
			String output = String.format("\nVehicle: %s %s\nID: %d\nCost to fix: %.2f", vehicle.getColour(), vehicle.getManufacturer(), vehicle.getId(), vehicle.calculateBill());
			System.out.println(output);
		}
	}
	
	public void calculateTotalBill() {
		double total = 0;
		for (Vehicle vehicle : this.vehicles) {
			total += vehicle.calculateBill();
		}
		System.out.println("--------------------------------------------------------------------------------------------");
		System.out.println("\nThe total bill for all vehicles in the garage is: £" + total);
	}
	
	public void printAll() {
		System.out.println("\n\n--------------------------------------------------------------------------------------------");
		System.out.println("--------------------------------Full list of vehicles---------------------------------------");
		System.out.println("--------------------------------------------------------------------------------------------");
		for (Vehicle vehicle : this.vehicles) {
			System.out.println(vehicle);
			System.out.println("--------------------------------------------------------------------------------------------");
		}
	}
}
