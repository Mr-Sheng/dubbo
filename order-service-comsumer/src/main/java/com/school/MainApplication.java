package com.school;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.school.gmail.service.OrderService;

public class MainApplication {

	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("comsumer.xml");
		
		OrderService orderService = applicationContext.getBean(OrderService.class);
		
		orderService.initOrder("1");
		
		System.out.println("end ....");
		
		System.in.read();
		
		
	}
	
}
