/**
 * 
 */
package com.javatraining.dessert;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kiran
 *
 */
public class Checkout {
	
	List<DessertItem> desertItem = new ArrayList<DessertItem>();
	
//	Candy[] candyArray = new Candy[10];
//	Cookies[] CookiesArray = new Cookies[10];
	
	/*
	 * Create 2 addItem methods one for Candy and one of Cookie 
	 * and add items to the above defined arrays respectively.
	 * Perform the calculation in the getTotalCost() for the total cost of 
	 * the items in shopping cart
	 * 
	 */
	
	public void addItem(DessertItem dessertItem) {
		this.desertItem.add(dessertItem);
	}
	
	public double getTotalCost() {
		double totalCost = 0d;
		for(int i = 0; i<this.desertItem.size();i++) {
			System.out.println("Calculating the cost for "+this.desertItem.get(i).getClass().getSimpleName());
			totalCost += this.desertItem.get(i).getCost();
		}
		return (totalCost + (totalCost * DessertShoppee.TAX_RATE));
	}

}
