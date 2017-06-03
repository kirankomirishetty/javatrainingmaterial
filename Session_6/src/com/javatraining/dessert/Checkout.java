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
