/**
 * 
 */
package com.javatraining.polymorphism.overloading;

/**
 * @author kiran
 *
 */
public class OverloadingExample {
	
	
	public OverloadingExample() {
		System.out.println("Inside Default Constructor");
	}
	public OverloadingExample(int i) {
		System.out.println("Inside Overloaded Constructor "+i);
	}
	public void methodOne() {
		System.out.println("Inside method one...");
	}
	public void methodOne(int j) {
		System.out.println("Inside method one "+j);
	}
	public void methodOne(float j) {
		System.out.println("Inside method one float "+j);
	}
	public void methodOne(double j) {
		System.out.println("Inside method one  double param "+j);
	}
	public void methodOne(String j) {
		System.out.println("Inside method one  String param "+j);
	}
	public void methodOne(String j, int i) {
		System.out.println("Inside method one  String param "+j+" int param "+i);
	}
	
	public void createAccount() {
		
	}
	public void createAccount(String cpcCode) {
		
	}
	public void createAccount(String cpcCode, String offerId) {
		
	}
	
	public static void staticMethodOne() {
		System.out.println("Inside default static method");
	}
	public static void staticMethodOne(int i) {
		System.out.println("Inside overloaded static method "+i);
	}
	

}
