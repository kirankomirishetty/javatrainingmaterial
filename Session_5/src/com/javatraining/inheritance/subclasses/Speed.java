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
	
	int speedLock;

	public Speed(int minSpeed, int maxSpeed, int speedLock) {
		super();
		this.minSpeed = minSpeed;
		this.maxSpeed = maxSpeed;
		this.speedLock = speedLock;
	}

	
	public int getSpeedLock() {
		return speedLock;
	}


	public int getMinSpeed() {
		return minSpeed;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	
	public String configureSpeed(VehicleType vehicleType) {
		return "Min Speed : "+getMinSpeed()+" MaxSpeed : "+getMaxSpeed()+" for vehicleType "+vehicleType.name()+" configured successfully";
	}
	
}
