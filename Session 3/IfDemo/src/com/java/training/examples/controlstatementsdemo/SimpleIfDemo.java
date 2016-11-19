/**
 * 
 */
package com.java.training.examples.controlstatementsdemo;

/**
 * @author kiran
 *
 */
public class SimpleIfDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 0;
		
		if(i == 0) {
			System.out.println("The value of i is zero");
		}
		
		if(i==0) {
			System.out.println("The value of i is zero in if else ");
		}
		else {
			System.out.println("The value of i is not zero in if else ");
		}
		
		String operation = "ADD";
		if(operation.equals("ADD")) {
			System.out.println("Result of addition is "+(10+20));
		}
		nestedIfDemo(0);
	}
	public static void nestedIfDemo(int value) {
		System.out.println("Nested If....");
		if(value == 0) {
			System.out.println("The value is Zero ");
		} else if (value < 0) {
			System.out.println("The value is Negative");
		} else {
			System.out.println("The value is Positive");
		}
	}

}
