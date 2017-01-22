/**
 * 
 */
package com.javatraining.inheritance.subclasses;

import com.javatraining.inheritance.test.VehicleType;

/**
 * @author kiran
 *
 */
public class Speed {
	
	int minSpeed;
	
	int maxSpeed;

	public Speed(int minSpeed, int maxSpeed) {
		super();
		this.minSpeed = minSpeed;
		this.maxSpeed = maxSpeed;
	}

	public int getMinSpeed() {
		return minSpeed;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	
	public String configureSpeed(VehicleType vehicleType) {
		return "Min Speed : "+getMinSpeed()+" MaxSpeed : "+getMaxSpeed()+"for vehicleType "+vehicleType.name()+" configured successfully";
	}
	
}
