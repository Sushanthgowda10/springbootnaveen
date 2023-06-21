package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle {
	@Autowired
//	@Qualifier("pEngine")
	@Qualifier("engg")
	private IEngine Engine;

	public Vehicle() {
		System.out.println("Vehicle :: 0-param constructor");
	}

public void journey(String startplace, String destplace) {
	Engine.start();
System.out.println("Journey is started at ::" + startplace);
System.out.println("Journey is going..on");Engine.start();
System.out.println("Journey ended at ::" + destplace);}
}