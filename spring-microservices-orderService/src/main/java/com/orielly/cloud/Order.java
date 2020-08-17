package com.orielly.cloud;

public class Order {
	
	private final int id;
	private final int customerId;	
	private final String customerName;
	
	public int getId() {
		return id;
	}

	public int getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	
	
	Order(final int id, final int customerId, final String customerName){
		this.id = id;
		this.customerId = customerId;
		this.customerName = customerName;
	}

}
