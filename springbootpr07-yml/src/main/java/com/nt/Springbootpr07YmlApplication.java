package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.sbeans.customer;

@SpringBootApplication
public class Springbootpr07YmlApplication {

	public static void main(String[] args) {
	ApplicationContext ctx =	SpringApplication.run(Springbootpr07YmlApplication.class, args);
	customer Customer = ctx.getBean("cust",customer.class);
	System.out.println(Customer);
	
	}

}
