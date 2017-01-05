package com.niit.controller;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.model.User;
import com.niit.shoppingcartDAO.CategoryDAO;
import com.niit.shoppingcartDAO.UserDAO;
@Controller
public class HomeController {

	@Autowired
	UserDAO userDAO;
	
	@Autowired
	User user;
	
	@Autowired
	CategoryDAO categoryDAO;
	
	@RequestMapping("/")
	public String gotohome(Model model)
	{
		System.out.println("Loading Landing Page.....");
		model.addAttribute("categoryList",this.categoryDAO.list());
		return "index";
	}
	@RequestMapping("/cart")
	public String gotocart()
	{
		System.out.println("Loading Landing Page.....");
		return "cart";
	}
	
/*@RequestMapping("/validate")
public String validate(@RequestParam(name="userID") String id,@RequestParam(name="password") String pwd, Model model)

{
//// validate-hit the database to validate
////niit
if(id.equals("niit") && pwd.equals("niit"))
{
	model.addAttribute("successmessage","you successfully logged in");

	return "index";
}
else
{
	model.addAttribute("errormessage","entered invalid credentials....please login again");
	
return "index";
}


}*/

/*@RequestMapping("/login")
public String f1()
{
	return "login";
}

@RequestMapping(value="/login")
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
}*/



@RequestMapping("/admin")
public String getAdmin()
{
//model.addAttribute("userClickedregister",true);
return "admin";
}


@RequestMapping(value="/user")
public String getUser()
{
	return "login";
}

/*@RequestMapping("/register")
public String registerhere(Model model)
{
model.addAttribute("userClickedregister",true);
return "register";
}
@RequestMapping(value="register/add", method=RequestMethod.POST)
public String registerUser(Model model, @ModelAttribute("user") User user)
{
	userDAO.addUser(user);
	model.addAttribute("userClickedregister",true);
	return "/";
}*/
@RequestMapping(value="/home")
public String ind(Model model)
{
	System.out.println("Loading Landing Page.....");
	model.addAttribute("categoryList",this.categoryDAO.list());
	return "index";
}
}	
