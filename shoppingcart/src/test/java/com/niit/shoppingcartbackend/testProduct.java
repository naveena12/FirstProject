/*package com.niit.shoppingcartbackend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.niit.shoppingcart.model.Product;
import com.niit.shoppingcartDAO.ProductDAO;


public class testProduct {
public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
		ProductDAO productDAO = (ProductDAO) context.getBean("productDAO");
		Product product = (Product) context.getBean("product");
		

		
		

		product.setId("MOB007");
		product.setName("iries");
		product.setPrice("8000");
		 product.setCategory_id("0");
		 product.setSupplier_id("210");
		 product.setDescription("it is a lava company");
		 

			 
	//System.out.println(productDAO.save(product));
	//productDAO.delete(product);
	//productDAO.update(product);
		//System.out.println("Data deleted in DB");
        //System.out.println("data inserted in db");
	//System.out.println("data updated");
	List<Product> plist=productDAO.list();
	for(Product p:plist)
	{
		System.out.println("Product name:"+p.getName());
		System.out.println("Product id:"+p.getId());
	}
	
}
}
	
		
		
			
	


	


*/