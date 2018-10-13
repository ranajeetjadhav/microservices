/**
 * 
 */
package com.personal.shoppingApp.OrderService.model;

/**
 * @author e1077874
 *
 */
public class Order {
	private long id;
	private double percentage;
	
	public Order() {
	}
		
	public Order(long id) {
		this.id = id;		
	}
	
	public Order(long id, double percentage) {
		this.id = id;
		this.percentage = percentage;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the percentage
	 */
	public double getPercentage() {
		return percentage;
	}
	/**
	 * @param percentage the percentage to set
	 */
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
	
}
