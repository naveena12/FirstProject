/*package com.niit.shoppingcartbackend;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.model.Cart;
import com.niit.shoppingcartDAO.CartDAO;




public class Carttestcase {
	@Autowired
	AnnotationConfigApplicationContext context;
	@Autowired
	Cart cart;
	@Autowired
	CartDAO cartDAO;
	public void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		CartDAO cartDAO = (CartDAO) context.getBean("cartDAO");
		Cart cart = (Cart) context.getBean("cart");
	}
	//start writing junit test cases
	//for each method defined in DAO
	//@Test
public void createCartTestCase()
	{
		cart.setId("101");
		cart.setOrder_Id("123");
	cart.setBilling_address_id("1234");
		cart.setShipping_address_id("567");
		cart.setPaymentmethod("debitcard");
		boolean status= cartDAO.save(cart);

	Assert.assertEquals("Create Cart Test Case",true,status);		
	}
}
   
	


*/