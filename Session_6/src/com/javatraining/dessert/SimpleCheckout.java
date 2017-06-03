/**
 * 
 */
package com.javatraining.dessert;

/**
 * @author kiran
 *
 */
public class SimpleCheckout {
	
	public static void main(String[] args) {
		DessertItem cookie = new Cookies("Chocolate Chip Cookie", 12, 20);
		System.out.println("The cost of the "+cookie.getName()+" is "+cookie.getCost());
		
		Candy candy = new Candy("Hersheys Reeses", 10,10);
		System.out.println("The cost of the "+candy.getName()+" is "+candy.getCost());
	}

}
