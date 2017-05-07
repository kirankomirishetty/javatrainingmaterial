/**
 * 
 */
package com.javatraining.noinheritance;

import com.javatraining.inheritance.subclasses.Speed;

/**
 * @author kiran
 *
 */
public class Bus {

	private String model;
	
	private String make;
	
	private String noOfTiers;
	
	private String noOfSeats;
	
	private String gearType;
	
	private String subModel;
	
	private Speed speed;
	
	

	@Override
	public String toString() {
		return "Bus [model=" + model + ", make=" + make + ", noOfTiers=" + noOfTiers + ", noOfSeats=" + noOfSeats
				+ ", gearType=" + gearType + ", subModel=" + subModel + ", speed=" + speed + "]";
	}

	public Bus(String model, String make, String noOfTiers, String noOfSeats, String gearType, String subModel,
			Speed speed) {
		super();
		this.model = model;
		this.make = make;
		this.noOfTiers = noOfTiers;
		this.noOfSeats = noOfSeats;
		this.gearType = gearType;
		this.subModel = subModel;
		this.speed = speed;
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

	public String getSubModel() {
		return subModel;
	}

	public Speed getSpeed() {
		return speed;
	}
	
	

	
	
}
