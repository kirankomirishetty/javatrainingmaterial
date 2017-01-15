/**
 * 
 */
package com.javatraining.session4;

import static com.javatraining.session4.Constants.STU_NAME_COLUMN;
import static com.javatraining.session4.Constants.getRandomNumber;

/**
 * @author kiran
 *
 */
public class StaticTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVSInstance svis = new StaticVSInstance();
		System.out.println("svis  staticCount "+svis.getStaticCount()+" count "+svis.getCount());
		System.out.println("svis  staticCount "+svis.getStaticCount()+" count "+svis.getCount());

		
		StaticVSInstance svis1 = new StaticVSInstance();
		System.out.println("svis1  staticCount "+svis1.getStaticCount()+" count "+svis1.getCount());
		System.out.println("svis1  staticCount "+svis1.getStaticCount()+" count "+svis1.getCount());
		
		System.out.println("===> "+STU_NAME_COLUMN);
		System.out.println("===> "+STU_NAME_COLUMN);
		System.out.println("===> "+STU_NAME_COLUMN);
		System.out.println("===> "+Constants.STU_NAME_COLUMN);
		System.out.println("===> "+Constants.STU_NAME_COLUMN);
		System.out.println("===> "+Constants.STU_NAME_COLUMN);
		
		System.out.println("Static method import ===>1 "+getRandomNumber());
		System.out.println("Static method import ===>2 "+getRandomNumber());
		System.out.println("Static method import ===>3 "+Constants.getRandomNumber());
		
	}

}
