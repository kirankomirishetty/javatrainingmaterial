package com.java.training.examples.compoundstatements;
/**
 * 
 */

/**
 * @author kiran
 *
 */
public class IncrementDecrementDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		increment();
		decrement();
	}
	
	public static void increment() {
		// Post Increment
		int i=10;
		int j = i++;  // i++ is equal to i = i + 1;
		System.out.println("Post Increment "+j);
		System.out.println("Post Increment "+i);
		// Pre Increment
		int preIn=20;
		int preInJ = ++preIn; // i++ is equal to i = i + 1;
		System.out.println("Pre Increment "+preInJ);
		System.out.println("Pre Increment "+preIn);
	}
	
	public static void decrement() {
		// Post Increment
		int i=10;
		int j = i--;  // i++ is equal to i = i - 1;
		System.out.println("Post Decrement "+j);
		System.out.println("Post Decrement "+i);
		// Pre Increment
		int preIn=20;
		int preInJ = --preIn; // i++ is equal to i = i - 1;
		System.out.println("Pre Decrement "+preInJ);
		System.out.println("Pre Decrement "+preIn);
	}

}
