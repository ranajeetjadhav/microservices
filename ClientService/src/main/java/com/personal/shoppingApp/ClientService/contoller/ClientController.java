package com.personal.shoppingApp.ClientService.contoller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.personal.shoppingApp.ClientService.model.Client;

@RestController
@RequestMapping("/")
public class ClientController {

	private static final Logger LOGGER = LoggerFactory.getLogger(ClientController.class);
	
	@Autowired	
	private RestTemplate restTemplate;
	
	@Autowired
	private Environment env;
	
	@GetMapping("/")
	public String home(){
		return "Client service running on port"+env.getProperty("server.port");
	}
	
	@HystrixCommand(fallbackMethod="fallback")
	@GetMapping("/myOrders")
	public Client getClientOrdes(){
		LOGGER.info("enter getClientOrdes method");
		String order = this.restTemplate.getForObject("http://order-service/orderService/initOrder", String.class);
		
		Client client = new Client();
		client.setClientId(1);
		client.setOrder(order);
		
		LOGGER.info("return getClientOrdes method");
		
		return client;
	}
	
	public Client fallback(Throwable hystrixCommand){
		return new Client(1,null);
	}
}
