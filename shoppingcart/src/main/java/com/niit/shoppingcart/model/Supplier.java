package com.niit.shoppingcart.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component

public class Supplier {
	private String supplier_id;
	private String name;
	private String address;
	
	
	public String getName() {
		return name;
	}
	@Id
	public String getSupplier_id() {
		return supplier_id;
	}
	public void setSupplier_id(String supplier_id) {
		this.supplier_id = supplier_id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}
