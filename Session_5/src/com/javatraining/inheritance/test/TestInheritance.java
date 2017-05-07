/**
 * 
 */
package com.javatraining.inheritance.test;

import com.javatraining.inheritance.subclasses.Bus;
import com.javatraining.inheritance.subclasses.Car;

/**
 * @author kiran
 *
 */
public class TestInheritance {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Bus bus = new Bus("VOLVO", "2015", "6", "45", "Manual");
		
		System.out.println("Bus Model "+ bus.getModel());
		System.out.println("Bus Make "+ bus.getMake());
		System.out.println("Bus Tiers "+ bus.getNoOfTiers());
		System.out.println("Bus Seats "+ bus.getNoOfSeats());
		System.out.println("Bus GearType "+ bus.getGearType());
//		bus.buildBus();
		bus.configureBusSeating(20, 27);
		bus.configureBusSpeed();
		
		System.out.println("================================");
		Car car = new Car("TOYOTA", "2017", "4", "5", "Automatic");
		car.setSubModel("EX");
		System.out.println("car Model "+ car.getModel());
		System.out.println("car Make "+ car.getMake());
		System.out.println("car Tiers "+ car.getNoOfTiers());
		System.out.println("car Seats "+ car.getNoOfSeats());
		System.out.println("car GearType "+ car.getGearType());
		System.out.println("=====================");
		System.out.println(car.buildCar());
		car.configureCarSpped();
		
		

	}

}
