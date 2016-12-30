/*package com.niit.shoppingcartbackend;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.niit.shoppingcart.model.Product;
import com.niit.shoppingcartDAO.ProductDAO;

public class Producttestcase {
	@Autowired
	AnnotationConfigApplicationContext context;
	@Autowired
	Product product;
	@Autowired
	ProductDAO productDAO;
	public void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		ProductDAO productDAO = (ProductDAO) context.getBean("productDAO");
		Product product = (Product) context.getBean("product");
	}
	//start writing junit test cases
	//for each method defined in DAO
	@Test
	public void createProductTestCase()
	{
		product.setId("mob4");
		product.setDescription("this is the electronic device");
		product.setName("mobile product");
		boolean status= productDAO.save(product);

	Assert.assertEquals("Create Product Test Case",true,status);		
	}
}
   



*/