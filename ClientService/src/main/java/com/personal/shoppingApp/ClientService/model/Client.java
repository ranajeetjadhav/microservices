/**
 * 
 */
package com.personal.shoppingApp.ClientService.model;

/**
 * @author e1077874
 *
 */
public class Client {

	private long clientId;
	private String order;	
	
	/**
	 * 
	 */
	public Client() {		
	}

	/**
	 * @param clientId
	 * @param order
	 */
	public Client(long clientId, String order) {
		this.clientId = clientId;
		this.order = order;
	}
	
	/**
	 * @return the clientId
	 */
	public long getClientId() {
		return clientId;
	}
	
	/**
	 * @param clientId the clientId to set
	 */
	public void setClientId(long clientId) {
		this.clientId = clientId;
	}
	
	/**
	 * @return the order
	 */
	public String getOrder() {
		return order;
	}
	
	/**
	 * @param order the order to set
	 */
	public void setOrder(String order) {
		this.order = order;
	}
}
