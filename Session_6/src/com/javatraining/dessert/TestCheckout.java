/**
 * 
 */
package com.javatraining.dessert;

/**
 * @author kiran
 *
 */
public class TestCheckout {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Checkout checkout = new Checkout();
		checkout.addItem(new Candy("Hershes M&M", 5,5));
		checkout.addItem(new Candy("Hershes Snickers", 10,10));
		checkout.addItem(new Candy("Hershes Reeses", 15,2));
		checkout.addItem(new Cookies("Oat Meal Cookie", 15,15));
		checkout.addItem(new Cookies("Oat Meal Cookie with Raisins", 16,16));
		
		System.out.println("Total cost with tax is "+checkout.getTotalCost());

	}

}
