package com.example.project.Management.dto;


import com.example.project.Management.entity.Category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


public class OrderRequest {
	private Category category;
	
	

	public OrderRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

     //parameterized constructor
	
	public OrderRequest(Category category) {
		super();
		this.category = category;
	}
	
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	//toString Method.
	@Override
	public String toString() {
		return "OrderRequest [category=" + category + "]";
	}

	
	
	
}
