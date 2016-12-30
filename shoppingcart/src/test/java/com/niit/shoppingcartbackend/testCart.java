/*package com.niit.shoppingcartbackend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.model.Cart;
import com.niit.shoppingcartDAO.CartDAO;


public class testCart {
public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		CartDAO cartDAO = (CartDAO)context.getBean("CartDAO");
		Cart cart = (Cart) context.getBean("cart");
		cart.setId("101");
		 cart.setOrder_Id("234");
		 cart.setBilling_address_id("01");
		 cart.setShipping_address_id("020");
		 cart.setPaymentmethod("creditcard");
		 
		 
		 
		//System.out.println(cartDAO.save(cart));
			//cartDAO.delete(cart);
		//cartDAO.update(cart);
				//System.out.println("Data deleted in DB");
		      // System.out.println("data inserted in db");
			//System.out.println("data updated");
			List<Cart> clist=cartDAO.list();
			for(Cart c:clist)
			{
				
				System.out.println("Cart id:"+c.getOrder_Id());
			}
			
			}
			
			

}
*/