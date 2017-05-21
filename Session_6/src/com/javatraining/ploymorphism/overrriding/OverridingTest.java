/**
 * 
 */
package com.javatraining.ploymorphism.overrriding;

import java.io.IOException;

/**
 * @author kiran
 *
 */
public class OverridingTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child p = new Child();
		p.methodOne();
		p.methodTwo(10);
		p.methodThree();
		try {
			p.methodFour();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			p.methodFive();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*p = new Parent();
		p.methodOne();
		p.methodTwo(10);
		p.methodThree();
		try {
			p.methodFour();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			p.methodFive();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
*/
	}

}
