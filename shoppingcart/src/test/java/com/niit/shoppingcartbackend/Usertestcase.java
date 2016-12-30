/*package com.niit.shoppingcartbackend;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.model.User;
import com.niit.shoppingcartDAO.UserDAO;




public class Usertestcase {
	@Autowired
	AnnotationConfigApplicationContext context;
	@Autowired
	User user;
	@Autowired
	UserDAO userDAO;
	public void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		UserDAO userDAO = (UserDAO) context.getBean("userDAO");
		User user = (User) context.getBean("user");
	}
	//start writing junit test cases
	//for each method defined in DAO
	@Test
	public void createUserTestCase()
	{
		user.setId("010");
		user.setName("teja");
		boolean status=userDAO.save(user);

	Assert.assertEquals("Create User Test Case",true,status);		
	}
}
  




*/