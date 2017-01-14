/**
 * 
 */
package com.javatraining.session3;

import java.util.List;

/**
 * @author kiran
 *
 */
public class HelloWorld {
	
	public String operation;
	public int i;
	
	public HelloWorld() {
		this.operation="LOGIN";
		this.i = 200;
	}
	public HelloWorld(String operation) {
		this.operation = operation;
	}
	public HelloWorld(String operation, int i) {
		this.operation = operation;
		this.i = i;
	}
	public void sayHello(String name) {
		if("LOGIN".equalsIgnoreCase(operation)) {
			System.out.println("Welcome "+name);
		}
		else if ("LOGOUT".equalsIgnoreCase(operation)) {
			System.out.println("Goodbye "+name);
		}
	}
	public void sayHello(String name, String operation) {
		String xyz="";
		if("LOGIN".equalsIgnoreCase(operation)) {
			System.out.println("Welcome "+name);
		}
		else if ("LOGOUT".equalsIgnoreCase(operation)) {
			System.out.println("Goodbye "+name);
		}
	}
	
	public void primitiveTypesExample(int ii) {
		System.out.println("Value of i "+ii);
		ii=100;
		System.out.println("value of i after change: "+ii);
//		return ii;
	}
	public void primitiveTypesExample(String s) {
		System.out.println("Value of s "+s);
		s+=" ABC";
		System.out.println("value of s after change: "+s);
	}
	
	public void referenceTypes(List test) {
		System.out.println("value of test "+test);
		test.add("NEW ELEMENT");
		System.out.println("value after change "+test);
	}


}
