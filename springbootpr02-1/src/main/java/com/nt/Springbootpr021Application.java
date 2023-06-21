package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nt.sbeans.Vehicle;

@SpringBootApplication
@ImportResource("com/nt/cfgs/applicationContext.xml")


public class Springbootpr021Application {

	public static void main(String[] args) {
		
		//get target container
		
	ApplicationContext ctx=	SpringApplication.run(Springbootpr021Application.class, args);
	
		//get the target class obj ref
	Vehicle vehicle = ctx.getBean("vehicle",Vehicle.class);
	
		//invoke the b.method
	vehicle.journey("bangalore","mysore");
	//close the IOC Container
	((ConfigurableApplicationContext)ctx).close();
		
	}

}
