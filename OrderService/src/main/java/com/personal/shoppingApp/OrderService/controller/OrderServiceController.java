/**
 * 
 */
package com.personal.shoppingApp.OrderService.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.personal.shoppingApp.OrderService.model.Order;
import com.personal.shoppingApp.OrderService.service.OrderService;

/**
 * @author e1077874
 *
 */
@RestController
@RequestMapping("/orderService")
public class OrderServiceController {

	private static final Logger LOGGER = LoggerFactory.getLogger(OrderServiceController.class);

	@Autowired
	private OrderService orderService;

	@Autowired
	private Environment env;

	@GetMapping("/")
	public String home() {
		return "Order service running on port:" + env.getProperty("server.port");
	}
	
	@GetMapping("/initOrder")
	public Order getOrder() throws Exception {
		LOGGER.info("enter init order method");
		try{
			int a= 12/0; 
		}catch(Exception ex){
			throw new Exception("order can not be processed");
		}
		
		LOGGER.info("return init order method");		
		 return orderService.getAllOrders();
	}

	@GetMapping("/verify")
	public Order verifyOrder() {
		return orderService.getAllOrders();
	}

	@GetMapping("/confirm")
	public Order confirmOrder() {
		return orderService.getAllOrders();
	}
}
