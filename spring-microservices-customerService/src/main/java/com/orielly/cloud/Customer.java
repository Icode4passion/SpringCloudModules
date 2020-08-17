package com.orielly.cloud;

public class Customer {
	
	private final int Id;
	private final String name;
	
	public int getId() {
		return Id;
	}

	public String getName() {
		return name;
	}

	
	
	Customer(int Id , String name){
		this.Id = Id;
		this.name= name;
	}

}
