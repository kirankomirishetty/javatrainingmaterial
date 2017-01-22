/**
 * 
 */
package com.javatraining.inheritance.subclasses;

/**
 * @author kiran
 *
 */
public class Car1 {
	
	private String model;
	
	private String make;
	
	private String noOfTiers;
	
	private String noOfSeats;
	
	private String gearType;
	
	private String subModel;

	public Car1(){
		super();
		
	}
	public Car1(String model, String make, String noOfTiers, String noOfSeats, String gearType) {
		super();
		this.model = model;
		this.make = make;
		this.noOfTiers = noOfTiers;
		this.noOfSeats = noOfSeats;
		this.gearType = gearType;
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
	
	public String buildCar() {
		return getModel()+" "+getMake()+" "+getNoOfSeats()+" "+getNoOfTiers() ;
	}


}
