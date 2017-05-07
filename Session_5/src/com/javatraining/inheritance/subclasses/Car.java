/**
 * 
 */
package com.javatraining.inheritance.subclasses;

import com.javatraining.inheritance.superclasses.Vehicle;
import com.javatraining.inheritance.test.VehicleType;

/**
 * @author kiran
 *
 */
public class Car extends Vehicle {
	
	public Car() {
		super();
	}
	public Car(String model, String make, String noOfTiers, String noOfSeats, String gearType) {
		super(model, make, noOfTiers,noOfSeats,gearType);
	}
	
	public String buildCar() {
		return super.getModel()+" "+super.getMake()+" "+super.getNoOfSeats()+" "+super.getNoOfTiers() ;
	}
	public void configureCarSpped() {
		super.configureSpeed(VehicleType.CAR,0, 150);
	}
	




}
