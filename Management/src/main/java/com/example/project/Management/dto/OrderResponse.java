package com.example.project.Management.dto;



public class OrderResponse {
	private String name;
	private String productName;
	
	
	public OrderResponse() {
		super();
	}
	//prameteraized Constructor
	public OrderResponse(String name, String productName) {
		super();
		this.name = name;
		this.productName = productName;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	//toString Method.
	@Override
	public String toString() {
		return "OrderResponse [name=" + name + ", productName=" + productName + "]";
	}	
}
