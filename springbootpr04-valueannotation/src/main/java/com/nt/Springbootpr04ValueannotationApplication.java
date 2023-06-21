package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbens.Hotel;

@SpringBootApplication
public class Springbootpr04ValueannotationApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context =	SpringApplication.run(Springbootpr04ValueannotationApplication.class, args);
		
		Hotel hotel = context.getBean("hotel",Hotel.class);
		System.out.println(hotel);
		
	}
	

}
