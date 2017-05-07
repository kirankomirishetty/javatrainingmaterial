package com.javatraining.noinheritance;

import com.javatraining.inheritance.subclasses.Speed;
import com.javatraining.inheritance.superclasses.Vehicle;
import com.javatraining.inheritance.test.VehicleType;

public class NoInheritanceDemo {
	
	public static void main(String[] args) {
		Speed busSpeed = new Speed(0,140,70);
		Bus bus = new Bus("Corolla", "2001","4","5","Automatic", "LE", busSpeed);
		
		System.out.println("Bus... "+bus.toString());
		
		Speed carSpeed = new Speed(0,100,70);
		Car car = new Car("Corolla", "2001","4","5","Automatic", "LE", busSpeed);
		
		System.out.println("Car... "+car.toString());
		
		Car car1 = new Car("Corolla", "2001","4","5","Automatic", "XLE", busSpeed, true);
		
		System.out.println("Car1... "+car1.toString());
		
		Vehicle vehicle = new Vehicle();
//		vehicle.configureSpeed(VehicleType.BUS, 0, 250);
	}

}
