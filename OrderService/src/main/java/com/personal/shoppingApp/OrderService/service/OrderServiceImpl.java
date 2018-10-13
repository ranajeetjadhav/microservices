/**
 * 
 */
package com.personal.shoppingApp.OrderService.service;

import org.springframework.stereotype.Service;

import com.personal.shoppingApp.OrderService.model.Order;

/**
 * @author e1077874
 *
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService{

	@Override
	public Order getAllOrders() {
		return new Order(1,25.50);				
	}	
}
