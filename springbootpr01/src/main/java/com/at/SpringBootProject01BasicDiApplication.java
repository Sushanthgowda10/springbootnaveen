package com.at;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.at.beans.WishMessageGenerator;

@SpringBootApplication
public class SpringBootProject01BasicDiApplication {

	@Bean(name = "ldt")
	public LocalDateTime createLDT() {
		System.out.println("SpringBootProj01BasicDi1Application.createLDT()");
		return LocalDateTime.now();
	}

	public static void main(String[] args) {
		ApplicationContext factory = SpringApplication.run(SpringBootProject01BasicDiApplication.class, args);
		WishMessageGenerator generator = factory.getBean("wmg", WishMessageGenerator.class);
		String message = generator.showWishMessage("sush");
		System.out.println(message);
		((ConfigurableApplicationContext) factory).close();
	}
}