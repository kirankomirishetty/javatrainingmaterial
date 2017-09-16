/**
 * 
 */
package com.javatraining.junit.test;

/**
 * @author kiran
 *
 */
public class MathOperations {

	/**
	 * 
	 */
	public MathOperations() {
		// TODO Auto-generated constructor stub
	}
	
	public double performOperation(int a, int b, MathEnum mathEnum) 
	{
		
		switch (mathEnum) {
		case ADD:
			return a+b;

		case SUB:
			return a-b;
		case DIV:
			return a/b+2;
		case MUL:
			return a*b;
		default:
			return -1;
		}
		
	}
	public int add(int a, int b) {
		return a+b+1;
	}
	public int sub(int a, int b) {
		return a-b;
	}
	public int mul(int a, int b) {
		return a*b;
	}
	public int div(int a, int b) {
		return a/b;
	}

}
