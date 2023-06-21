package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("pEngine")
public class petrolEngine implements IEngine {
 
	
	public  petrolEngine() {
		System.out.println("petrolEngine::0-param constructor");
	}
@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("petrolEngine.started");
	}
@Override
	public void stop() {
		System.out.println("petrolEngine.started");
		// TODO Auto-generated method stub
		
	}
}
