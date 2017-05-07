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
public class Bus extends Vehicle {
	
	
	public Bus(String model, String make, String noOfTiers, String noOfSeats, String gearType) {
		super(model, make, noOfTiers,noOfSeats,gearType);
	}
	
	public void configureBusSeating(int noOf2seats, int noof3seats){
		
		if((noOf2seats + noof3seats) > Integer.parseInt(super.getNoOfSeats())) {
			System.out.println("No of seats cant be greater than "+super.getNoOfSeats());
			return;
		}
		
		System.out.println("Bus seating conifugred successfully with No of 2 seats "+noOf2seats+" and 3 seats "+noof3seats);
	}
	
	public void configureBusSpeed() {
		
		super.configureSpeed(VehicleType.BUS, 0, 250);
//		speed = new Speed(minSpeed, maxSpeed);
	}
	
	


}
