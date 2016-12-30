/* package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.shoppingcart.model.User;
import com.niit.shoppingcartDAO.UserDAO;


  

@Controller
public class UserController {
	@Autowired
	private UserDAO userDAO;
	@Autowired
private User user;
	
	@RequestMapping(value="/user",method=RequestMethod.GET)
	public String listUsers(Model model)
	{
		//log.debug("starting of list categories");
		model.addAttribute("user", new User());
		model.addAttribute("userlist",userDAO.list());
		model.addAttribute("isAdminClickedUser","true");
		//log.debug("Endof listcategory");
		
		return "user";
	}
	
	@RequestMapping(value="/manage_user_add",method=RequestMethod.POST)
	public String adduser(@ModelAttribute("user")User user,Model model)
	{
	//log.debug("start of add categy");
	//log.debug("id+category.getid");
	if (userDAO.save(user)==true)
	{
		model.addAttribute("msg","successfully created the user");
	}
	else
	{
		model.addAttribute("msg","not  created the table from user");
	}
	model.addAttribute("user",user);
	model.addAttribute("userlist",userDAO.list());
	model.addAttribute("isAdminClickedUser","true");
	//log.debug("End of addcategory");
	return "user";
	}

	@RequestMapping(value="/manage_user_edit/{id}")
	public String editUser(@PathVariable("id") String id, Model model)
	{
		model.addAttribute("user",this.userDAO.get(id));
		model.addAttribute("userlist",this.userDAO.list());
		
		
		return "user";
	}
	
	@RequestMapping(value="/manage_user_delete/{id}")
	public String deleteUser(@PathVariable("id") String id, Model model)
	{
		userDAO.delete(id);
		
		//model.addAttribute("category",this.categoryDAO.delete(category)("id"));
		//model.addAttribute("categorylist",categoryDAO.list());
		
	
		return "redirect:/user";
	}
}*/
/* package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcartDAO.CategoryDAO;  

@Controller
public class CategoryController {
	
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	
	@Autowired
	private Category category;
	
	@RequestMapping(value="/category",method=RequestMethod.GET)
	public String listCategories(Model model)
	{
		//log.debug("starting of list categories");
		model.addAttribute("category",new Category());
		model.addAttribute("categorylist",categoryDAO.list());
		model.addAttribute("isAdminClickedCategory",true);
		//log.debug("Endof listcategory");
		
		return "category";
	}
	
//	@ModelAttribute("category")
//	public Category f1()
//	{
//		return new Category();
//	}
	
	@RequestMapping(value="/manage_category_add",method=RequestMethod.POST)
	public String addcategory(@ModelAttribute("category")Category category, BindingResult result, Model model)
	{
	//log.debug("start of add categy");
	//log.debug("id+category.getid")
		//String id=category.getId();
		//category.setId(id);
	categoryDAO.saveorupdate(category);
//	{
//		model.addAttribute("msg","successfully created the category");
//	}
//	else
//	{
//		model.addAttribute("msg","not created the table from category");
//	}
	//model.addAttribute("category",category);
	//model.addAttribute("categorylist",categoryDAO.list());
	//model.addAttribute("isAdminClickedCategory","true");
	//log.debug("End of addcategory");
	return "redirect:/category";
	}

	@RequestMapping(value="/manage_category_edit-{id}")
	public String editCategory(@PathVariable("id") String id, Model model)
	{
		System.out.println("editing category "+id);
		model.addAttribute("category",this.categoryDAO.get(id));
		model.addAttribute("categorylist",this.categoryDAO.list());
		
		
		return "category";
	}


//	
	@RequestMapping(value="/manage_category_delete-{id}")
	public String deleteCategory(@PathVariable("id") String id, Model model)
	{
		categoryDAO.delete(id);
		
		//model.addAttribute("category",this.categoryDAO.delete(category)("id"));
		//model.addAttribute("categorylist",categoryDAO.list());
		
	
		return "redirect:/category";
	}
}*/
package com.niit.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.model.User;
import com.niit.shoppingcartDAO.UserDAO;


@Controller 
public class UserController
{
	@Autowired
	UserDAO userDAO;
	
	@Autowired
	User user;
	
	
	@RequestMapping("/register")
	public ModelAndView getRegister(Model m)
	{
		m.addAttribute("user",new User());
		ModelAndView model=new ModelAndView("register");
				
	    return model;
	}
	
	@RequestMapping(value="register/add",method=RequestMethod.POST)
	public String addUser(Model model,@ModelAttribute("user") User user)
	{
		user.setRole("ROLE_USER");
		
		userDAO.addUser(user);
		ModelAndView mv=new ModelAndView("/");
		mv.addObject("success","data updated sucessfully");
		return "redirect:/";
		
	}
	@RequestMapping("/login")
	public String f1()
	{
		return "login";
	}

	@RequestMapping(value="/loginsheet")
	public String login(@RequestParam(value="error",required = false) String error,@RequestParam(value="logout", required = false) String logout,Model model)
	{ if(error!=null)
	{
		System.out.println("Error");
		model.addAttribute("loginerror","invalid username and password");
	}
	if(logout!=null)
	{
		System.out.println("Logout called");
		model.addAttribute("loginmsg","you have been logged out");
	}

		return "login";
	}
//	//for add and update category both
//		@RequestMapping(value="/user/add", method=RequestMethod.POST)
//		public String addUser(@ModelAttribute("user") User user)
//		{
//			userDAO.addUser(user);
//			return "redirect:/user";
//			//return "category";
//
//		}
//		
//		@RequestMapping("user/remove/{id}")
//		public String deleteUser(@PathVariable("id") String id, ModelMap model) throws Exception {
//
//			try {
//				userDAO.delete(id);
//				model.addAttribute("message", "Successfully Added");
//			} catch (Exception e) {
//				model.addAttribute("message", e.getMessage());
//				e.printStackTrace();
//			}
//			// redirectAttrs.addFlashAttribute(arg0, arg1)
//			return "redirect:/user";
//		}
//		
//
//		@RequestMapping("user/edit/{id}")
//		public String editUser(@PathVariable("id") String id, Model model) {
//			System.out.println("editUser");
//			model.addAttribute("user", this.userDAO.getUser(id));
//			model.addAttribute("userList", this.userDAO.list());
//			return "user";
//		}
//		
//		/*
			@RequestMapping(value = "/user", method = RequestMethod.GET)
		public String listUsers(Model model){
				model.addAttribute("user", user);
				model.addAttribute("userList",this.userDAO.list());
				return "index";
			
		}
			
		
	
}