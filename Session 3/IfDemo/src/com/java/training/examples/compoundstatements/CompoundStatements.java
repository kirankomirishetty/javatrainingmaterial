/**
 * 
 */
package com.java.training.examples.compoundstatements;

/**
 * @author kiran
 *
 */
public class CompoundStatements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 10 + 20;
		System.out.println("The value of i is "+i);
		
		int j = (10 + 20) * 2;
		System.out.println("The value of j is "+j);
		
		int k = 10+20*2*(4+4);
		System.out.println("The value of k is "+k);
		
		int a = 10;
		a = a + 10;
		System.out.println("value of a is "+a);
		int b=10;
		b+=10;
		System.out.println("Value of b is "+b);
		int c=10;
		c-=5;
		System.out.println("Value of c is "+c);
		int d=10;
		d/=2;
		System.out.println("the value of d is "+d);
		
		int e=10;
		int f= (10+(e+=5));
		System.out.println("value of f is "+f);
	}

}
