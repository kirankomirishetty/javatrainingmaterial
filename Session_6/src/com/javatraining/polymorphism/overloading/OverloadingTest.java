/**
 * 
 */
package com.javatraining.polymorphism.overloading;

/**
 * @author kiran
 *
 */
public class OverloadingTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingExample overloadingExample = new OverloadingExample();
		overloadingExample.methodOne();
		overloadingExample.methodOne(10);
		overloadingExample.methodOne(10f);
		overloadingExample.methodOne(10d);
		overloadingExample.methodOne("XYZ");
		overloadingExample.methodOne("ABC",10);
		
		OverloadingExample overloadingExample1 = new OverloadingExample(10);
		
		OverloadingExample.staticMethodOne();
		OverloadingExample.staticMethodOne(10);

	}

}
