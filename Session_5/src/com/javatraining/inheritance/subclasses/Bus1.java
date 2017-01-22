/**
 * 
 */
package com.javatraining.inheritance.subclasses;

/**
 * @author kiran
 *
 */
public class Bus1 {
	
	private String model;
	
	private String make;
	
	private String noOfTiers;
	
	private String noOfSeats;
	
	private String gearType;
	
	private String subModel;

	public Bus1(){
		super();
		
	}
	public Bus1(String model, String make, String noOfTiers, String noOfSeats, String gearType) {
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
	
	public void configureBusSeating(int noOf2seats, int noof3seats){
		
		if((noOf2seats + noof3seats) > Integer.parseInt(getNoOfSeats())) {
			System.out.println("No of seats cant be greater than "+getNoOfSeats());
			return;
		}
		
		System.out.println("Bus seating conifugred successfully with No of 2 seats "+noOf2seats+" and 3 seats "+noof3seats);
	}



}
