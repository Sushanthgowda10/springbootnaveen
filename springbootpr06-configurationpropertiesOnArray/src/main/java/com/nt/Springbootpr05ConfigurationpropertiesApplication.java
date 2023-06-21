package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Employee;

@SpringBootApplication
public class Springbootpr05ConfigurationpropertiesApplication {

	public static void main(String[] args) {
	ApplicationContext ctx=	SpringApplication.run(Springbootpr05ConfigurationpropertiesApplication.class, args);
	
	Employee emp =ctx.getBean("emp",Employee.class);
	System.out.println(emp);
	
	
	((ConfigurableApplicationContext) ctx).close();
	}

}
