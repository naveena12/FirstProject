package com.niit.shoppingcartbackend;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcartDAO.CategoryDAO;

public class Categorytestcase {
	static AnnotationConfigApplicationContext context;
	
	@Autowired
	static Category category;
	@Autowired
	static CategoryDAO categoryDAO;
	@Before
	public void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		 categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
		 category = (Category) context.getBean("category");
	}
	//start writing junit test cases
	//for each method defined in DAO
	@Test
	public void createCategoryTestCase()
	{
		category.setCategory_id("mob4");
		category.setDescription("this is the electronic device");
		category.setName("mobile Category");
		

	//Assert.assertEquals("Create Category Test Case",true,categoryDAO.saveorupdate(category));
	}
	@Test
	public void updateCategoryTestCase()
	{
		category.setCategory_id("mob4");
		category.setDescription("this is a  device");
		category.setName("mobile Category");
		

	//Assert.assertEquals("update Category Test Case",true,categoryDAO.saveorupdate(category));
	}
	@Test
	public void deleteCategoryTestCase()
	{
		category.setCategory_id("mob4");
		category.setDescription("this is a  device");
		category.setName("mobile Category");
	

	
	//Assert.assertEquals("delete Category Test Case",true,categoryDAO.delete(id);
	}
}
   
	