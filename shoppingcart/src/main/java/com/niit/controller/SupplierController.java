/* package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.shoppingcart.model.Supplier;
import com.niit.shoppingcartDAO.SupplierDAO;

 

@Controller
public class SupplierController {
	@Autowired
	private SupplierDAO supplierDAO;
	@Autowired
private Supplier supplier;
	
	@RequestMapping(value="/supplier",method=RequestMethod.GET)
	public String listCategories(Model model)
	{
		//log.debug("starting of list categories");
		model.addAttribute("supplier", new Supplier());
		model.addAttribute("supplierlist",supplierDAO.list());
		model.addAttribute("isAdminClickedSupplier","true");
		
		//log.debug("Endof listcategory");
		
		return "supplier";
	}
	
	@RequestMapping(value="/manage_supplier_add",method=RequestMethod.POST)
	public String addsupplier(@ModelAttribute("supplier")Supplier supplier,Model model)
	{
	//log.debug("start of add categy");
	//log.debug("id+category.getid");
	if (supplierDAO.save(supplier)==true)
	{
		model.addAttribute("msg","successfully created the supplier");
	}
	else
	{
		model.addAttribute("msg","not  created the table from supplier");
	}
	model.addAttribute("supplier",supplier);
	model.addAttribute("supplierlist",supplierDAO.list());
	model.addAttribute("isAdminClickedSupplier","true");
	//log.debug("End of addcategory");
	return "supplier";
	}

	@RequestMapping(value="/manage_supplier_update/{id}")
	public String editSupplier(@PathVariable("id") String id, Model model)
	{
		model.addAttribute("supplier",this.supplierDAO.get(id));
		model.addAttribute("supplierlist",this.supplierDAO.list());
		
		
		return "supplier";
	}
	
	@RequestMapping(value="/manage_supplier_delete/{id}")
	public String deleteSupplier(@PathVariable("id") String id, Model model)
	{
		supplierDAO.delete(id);
		
		//model.addAttribute("category",this.categoryDAO.delete(category)("id"));
		//model.addAttribute("categorylist",categoryDAO.list());
		
	
		return "redirect:/supplier";
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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.shoppingcart.model.Supplier;
import com.niit.shoppingcartDAO.SupplierDAO;




@Controller 
public class SupplierController
{
	@Autowired
	SupplierDAO supplierDAO;
	
	@Autowired
	Supplier supplier;
	//for add and update category both
		@RequestMapping(value="/supplier/add", method=RequestMethod.POST)
		public String addSupplier(@ModelAttribute("supplier") Supplier supplier)
		{
			supplierDAO.addSupplier(supplier);
			return "redirect:/supplier";
			//return "category";

		}
		
		@RequestMapping("supplier/remove/{id}")
		public String deleteSupplier(@PathVariable("id") String id, ModelMap model) throws Exception {

			try {
				supplierDAO.delete(id);
				model.addAttribute("message", "Successfully Added");
			} catch (Exception e) {
				model.addAttribute("message", e.getMessage());
				e.printStackTrace();
			}
			// redirectAttrs.addFlashAttribute(arg0, arg1)
			return "redirect:/supplier";
		}
		

		@RequestMapping("supplier/edit/{id}")
		public String editSupplier(@PathVariable("id") String id, Model model) {
			System.out.println("editSupplier");
			model.addAttribute("supplier", this.supplierDAO.getSupplier(id));
			model.addAttribute("listSupplier", this.supplierDAO.list());
			return "supplier";
		}
		
		
			@RequestMapping(value = "/supplier", method = RequestMethod.GET)
			public String listSuppliers(Model model){
				model.addAttribute("supplier", supplier);
				model.addAttribute("supplierList",this.supplierDAO.list());
				return "supplier";
			
		}
			
		
	
}