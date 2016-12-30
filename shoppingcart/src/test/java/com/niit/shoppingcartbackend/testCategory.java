package com.niit.shoppingcartbackend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcartDAO.CategoryDAO;

public class testCategory {
	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
		CategoryDAO categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
		Category category = (Category) context.getBean("category");
		

		
		
//
category.setCategory_id("MOB010");
category.setName("iries");
category.setDescription("it is a lava company");
////		 
//
//			category.setId("MOB008");
//			 category.setName("iries x8");
//			 category.setDescription("it is a lava company");
			 
	//System.out.println(categoryDAO.saveorupdate(category));
	//categoryDAO.delete(category);
	//categoryDAO.update(category);
		//System.out.println("Data deleted in DB");
        System.out.println("data inserted in db");
//	System.out.println("data updated");
//	List<Category> clist=categoryDAO.list();
//	for(Category c:clist)
//	{
//		System.out.println("Category name:"+c.getName());
//		System.out.println("Category id:"+c.getId());
//	}
	
	}
	
		
		
			
	}


