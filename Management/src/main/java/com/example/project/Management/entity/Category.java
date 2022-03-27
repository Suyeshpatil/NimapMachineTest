package com.example.project.Management.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class Category {
	@Id
	@GeneratedValue
	//Auto generator
	private int id;
	private String name;
	
	
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	//Parameterized Constructor
	public Category(int id, String name, List<Product> products) {
		super();
		this.id = id;
		this.name = name;
		
	}

	//Getter Setter Method.
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {	
		this.name = name;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}	
	//one to Many Relationship
	@OneToMany(targetEntity=Product.class,cascade=CascadeType.ALL)
	@JoinColumn(name="forigen_key",referencedColumnName="id")
	private List<Product> products;
	//toString Method
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", products=" + products + "]";
	}
}
