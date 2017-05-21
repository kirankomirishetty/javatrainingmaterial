/**
 * 
 */
package com.javatraining.ploymorphism.overrriding;

import java.io.IOException;

/**
 * @author kiran
 *
 */
public class Parent {
	
	public Parent(){
		System.out.println("Inside default constructor");
	}
	public Parent(int i) {
		System.out.println("Inside overloaded constructor "+i);
	}
	
	public void methodOne() {
		System.out.println("Inside Parent method one");
	}
	public void methodTwo(int i) {
		System.out.println("inside Parent method two "+i);
	}
	protected void methodThree() {
		System.out.println("inside protected parent method");
	}
	public void methodFour() throws IOException {
		System.out.println("inside IOException parent class");
	}
	
	public void methodFive() throws Exception {
		System.out.println("inside Exception parent class");
	}
	/*private void methodSix() {
		System.out.println("insie parent method six");
	}
*/
}
