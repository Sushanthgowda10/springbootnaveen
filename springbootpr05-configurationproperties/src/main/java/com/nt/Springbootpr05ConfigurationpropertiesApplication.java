package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.company;

@SpringBootApplication
public class Springbootpr05ConfigurationpropertiesApplication {

	public static void main(String[] args) {
	ApplicationContext ctx=	SpringApplication.run(Springbootpr05ConfigurationpropertiesApplication.class, args);
	
	company Company =ctx.getBean("comp",company.class);
	System.out.println(Company);
	
	
	((ConfigurableApplicationContext) ctx).close();
	}

}
