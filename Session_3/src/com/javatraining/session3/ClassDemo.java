/**
 * 
 */
package com.javatraining.session3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kiran
 *
 */
public class ClassDemo {

	static HelloWorld helloWorld = new HelloWorld();
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Initial value "+helloWorld.operation+" value of i: "+helloWorld.i);
		helloWorld.sayHello("Java Training");
		helloWorld.operation = "LOGOUT";
		helloWorld.sayHello("Java Training");
		
		HelloWorld helloWorld1 = new HelloWorld("LOGOUT");
		System.out.println("Initial value for helloWorld1: "+helloWorld1.operation+" value of i: "+helloWorld1.i);

		HelloWorld helloWorld2 = new HelloWorld("KIRAN",500);
		System.out.println("Initial value for helloWorld2: "+helloWorld2.operation+" value of i: "+helloWorld2.i);

		//		callHelloWorld();
		int i=10;
		String s="Testing";
		helloWorld.primitiveTypesExample(i);
		System.out.println("value of i after method calll "+i);
		helloWorld.primitiveTypesExample(s);
		System.out.println("value of s after method call "+s);
		
		List list = new ArrayList<>();
		list.add("INITAL ELEMENT");
		System.out.println("Before method call "+list);
		helloWorld.referenceTypes(list);
		System.out.println("After method call "+list);
		
		list.add(10);
		
		int ii=10;
		long l = 1000;
		Long longValue = new Long(1000);
		
		Integer integer = new Integer(10);
		System.out.println("int ii "+ii+" integer "+integer);
		
		
		/*
		 * byte
		 * short
		 * int
		 * long
		 * float
		 * double
		 */
		byte b=10;
		int intCast = b;
		
		System.out.println("value of b "+b+" value of intcast "+ intCast);
		
		float floatvalue = 100.56f;
		int explictCast = (int) floatvalue;
		System.out.println("explicit cast "+explictCast+"  long vlaue "+floatvalue);

	}
	
	public static void callHelloWorld() {
		
		helloWorld.sayHello("Method");
	}

}
