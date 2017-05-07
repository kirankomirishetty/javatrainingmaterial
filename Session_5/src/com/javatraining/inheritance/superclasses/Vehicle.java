/**
 * 
 */
package com.javatraining.inheritance.superclasses;

import com.javatraining.inheritance.subclasses.Speed;
import com.javatraining.inheritance.test.VehicleType;

/**
 * @author kiran
 *
 */
public class Vehicle {
	
	private String model;
	
	private String make;
	
	private String noOfTiers;
	
	private String noOfSeats;
	
	private String gearType;
	
	private String subModel;
	
	private Speed speed;

	public Vehicle(){
		super();
		
	}
	public Vehicle(String model, String make, String noOfTiers, String noOfSeats, String gearType) {
		super();
		this.model = model;
		this.make = make;
		this.noOfTiers = noOfTiers;
		this.noOfSeats = noOfSeats;
		this.gearType = gearType;
	}

	private void testMethod(){
		System.out.println("inside test method..");
	}
	
	public String getSubModel() {
		return subModel;
	}
	public void setSubModel(String subModel) {
		this.subModel = subModel;
	}
	public String getModel() {
		return model;
	}

	public String getMake() {
		return make;
	}

	public String getNoOfTiers() {
		return noOfTiers;
	}

	public String getNoOfSeats() {
		return noOfSeats;
	}

	public String getGearType() {
		return gearType;
	}
	protected void configureSpeed(VehicleType vehicleType, int minSpeed, int maxSpeed) {
		switch(vehicleType) {
		case CAR:
		{
			speed = new Speed(minSpeed, maxSpeed,70);
		}
		case BUS:
		{
			speed = new Speed(minSpeed, maxSpeed,100);
		}
		}
		
		System.out.println(speed.configureSpeed(vehicleType));
	}

}
