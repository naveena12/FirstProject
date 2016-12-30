/*package com.niit.shoppingcartbackend;




import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.model.User;
import com.niit.shoppingcartDAO.UserDAO;


public class Usertest {
public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
		UserDAO userDAO = (UserDAO) context.getBean("userDAO");
		User user = (User) context.getBean("user");
		user.setId("101");
		 user.setName("jaya");
		 user.setPassword("naveena");
		 user.setContact("1234567890");
		 user.setEmail("naveena@gmail.com");
		 user.setRole("bjbjb");
		 
		 userDAO.addUser(user);
		 
		 //user.setId("102");
		 //user.setName("teja");
		 //user.setPassword("naveena");
		 //user.setContact("1234567890");
		// user.setEmail("naveena@gmail.com");
		// user.setRole("dfjgk");
//
//			category.setId("MOB008");
//			 category.setName("iries x8");
//			 category.setDescription("it is a lava company");
			 
	//System.out.println(userDAO.save(user));
	//userDAO.delete(user);
	//userDAO.update(user);
		//System.out.println("Data deleted in DB");
       // System.out.println("data inserted in db");
	//System.out.println("data updated");
	//List<User> clist=userDAO.list();
	//for(User c:clist)
	//{
		//System.out.println("User name:"+c.getName());
		//System.out.println("User id:"+c.getId());
	//}
	
	}
	
		
		
			
	}





*/