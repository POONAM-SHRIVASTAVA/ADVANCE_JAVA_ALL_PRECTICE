package com.example.springanotetiondemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Car implements Vehicle {
	@Autowired
	private Engine engine; // engine is a dependency of car
	
	
	public Engine getEngine() {
		return engine;
	}


	public void setEngine(Engine engine) {
		this.engine = engine;
	}


	public void run() {
		System.out.println("car is running");
		System.out.println("Engine is "+engine);
		
	}

}
