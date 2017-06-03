/**
 * 
 */
package com.javatraining.dessert;

/**
 * @author kiran
 *
 */
public class DessertItem {

	protected String name;
	
	protected int quantity;
	
	protected int cost;
	  
	
	/**
	 * Initializes DessertItem data
	 */   
	  public DessertItem(String name, int quantity, int cost) {
		  this.name = name;
		  this.quantity = quantity;
		  this.cost = cost;
	  }
	/**
	 * Returns name of DessertItem
	 * @return name of DessertItem
	 */  
	  public final String getName() {
	    return name;
	  }
	/**
	 * Returns cost of DessertItem
	 * @return cost of DessertItem
	 */  
	  public int getCost() {
		  return (this.quantity * this.cost);
	  };
}
