package com.example.springdemo;

public class Car implements Vehicle {
	private String name;
	
	
 public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

@Override
public void run() {
	System.out.println(name+" is running");
}
}
