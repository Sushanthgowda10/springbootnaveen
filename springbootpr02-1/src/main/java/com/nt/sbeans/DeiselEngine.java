package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("dEngine")
public class DeiselEngine implements IEngine {
 
	
	public  DeiselEngine() {
		System.out.println("DieselEngine::0-param constructor");
	}

	public void start() {
		// TODO Auto-generated method stub
		System.out.println("DieselEngine.started");
	}

	public void stop() {
		System.out.println("DieselEngine.started");
		// TODO Auto-generated method stub
		
	}
}
