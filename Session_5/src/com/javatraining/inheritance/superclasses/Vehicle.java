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
	public void configureSpeed(VehicleType vehicleType, int minSpeed, int maxSpeed) {
		speed = new Speed(minSpeed, maxSpeed);
		System.out.println(speed.configureSpeed(vehicleType));
	}

}
