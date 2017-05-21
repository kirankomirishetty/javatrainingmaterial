/**
 * 
 */
package com.javatraining.ploymorphism.overrriding;

import java.io.IOException;

/**
 * @author kiran
 *
 */
public class Child extends Parent {

	public void methodOne() {
		System.out.println("inside child method one");
	}

	@Override
	public void methodTwo(int i) {
		// TODO Auto-generated method stub
		System.out.println("inside child method two "+i);
	}

	@Override
	public void methodThree() {
		// TODO Auto-generated method stub
		System.out.println("inside child method three");
	}

	@Override
	public void methodFour() throws IOException {
		// TODO Auto-generated method stub
		System.out.println("inside child method four");
	}

	@Override
	public void methodFive() throws IOException {
		// TODO Auto-generated method stub
		System.out.println("inside child method five");
	}
	
	public void methodSix() {
		System.out.println("insie Child method six");
	}
	

}
