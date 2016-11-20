/**
 * 
 */
package com.java.training.examples.controlstatementsdemo;

/**
 * @author kiran
 *
 */
public class SwitchDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		simpleSwitch(1);
//		simpleSwitch(2);
//		simpleSwitch(3);
		simpleSwitch(10);
		simpleSwitch(11);
		simpleSwitch(12);
	}
	
	public static void simpleSwitch(int i) {
		
		/*if(i==1){
			System.out.println("In If i is one");
		} else if (i==2) {
			System.out.println("In if i is two");
		}
		else {
			System.out.println("In if i is not one or two");
		}
		*/
		String s1="";
		if(i==12) {
			s1="C";
		}
		else if (i == 11 || i==12) {
			s1="BC";
		}
		else if(i == 10 || i == 11 || i==12) {
			System.out.println("in if value of i is 10,11,12");
			s1="ABC";
		}
		
		
		System.out.println("The value of i "+i);
		String s="";
		switch(i) {
			case 1:
			{
				System.out.println("In Case one");
				break;
			}
			case 2:
			{
				System.out.println("In Case two");
				break;
			}
			case 10:{
				s=s+"A";
			}
			case 11:{
				s=s+"B";
			}
			case 12:
			{
				s=s+"C";
				System.out.println("inside case 10,11,12");
				break;
			}
			default:
			{
				System.out.println("Not in Case one or Case Two");
			}
		}
		System.out.println("The value of s is "+s+" s1 "+s1);
	}

}
