package com.niit.shoppingcart.model;


import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="Category")
@Component
public class Category {
	//id,name,description
	//These property names better to take same name as fields names
	//in the category table
	
	private String category_id;
	//Column(name="name") //optional if the property name in this class
	//same as field name in the table
	//@Column(name="dogname")
	private String name;
	//Column(name="description") //optional
	private String description;
	private Set<Product> products;
	
	@OneToMany(mappedBy="category",fetch=FetchType.EAGER)
	public Set<Product> getProducts() {
		return products;
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	@Id
	public String getCategory_id() {
		return category_id;
	}
	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	}


