/**
 * 
 */
package com.java.training.examples.controlstatementsdemo;

/**
 * @author kiran
 *
 */
public class WhileDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ifDemo(15);
		whileDemo(15);
		doWhileDemo(15);
	}
	
	public static void ifDemo(int i) {
		System.out.println("Inside If demo......");
		if(i<20) {
			System.out.println("i Is less than 20: "+i);
		}
		
	}
	
	public static void whileDemo(int i) {
		System.out.println("Inside While demo......");
		while(i<=20){
			System.out.println("value of i is "+(i++));
			// i++ is equal to (i = i + 1)
		}
	}
	public static void doWhileDemo(int i) {
		System.out.println("Inside Do While......");
		do{
			System.out.println("The value of i is "+(i++));
		}while (i<=20);
	}

}
