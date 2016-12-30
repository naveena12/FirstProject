
/* package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.shoppingcart.model.Product;
import com.niit.shoppingcartDAO.ProductDAO;




@Controller
public class ProductController {
	@Autowired
	private ProductDAO productDAO;
	@Autowired
private Product product;
	
	@RequestMapping(value="/product",method=RequestMethod.GET)
	public String listCategories(Model model)
	{
		//log.debug("starting of list categories");
		model.addAttribute("product", new Product());
		model.addAttribute("productlist",productDAO.list());
		model.addAttribute("isAdminClickedProduct","true");
		//log.debug("Endof listcategory");
		
		return "product";
	}
	
	@RequestMapping(value="/manage_product_add",method=RequestMethod.POST)
	public String addproduct(@ModelAttribute("product")Product product,Model model)
	{
	//log.debug("start of add categy");
	//log.debug("id+category.getid");
	if (productDAO.save(product)==true)
	{
		model.addAttribute("msg","successfully created the product");
	}
	else
	{
		model.addAttribute("msg","not  created the table from product");
	}
	model.addAttribute("product",product);
	model.addAttribute("productlist",productDAO.list());
	model.addAttribute("isAdminClickedProduct","true");
	//log.debug("End of addcategory");
	return "product";
	}

	@RequestMapping(value="/manage_product_edit/{id}")
	public String editProduct(@PathVariable("id") String id, Model model)
	{
		model.addAttribute("product",this.productDAO.get(id));
		model.addAttribute("productlist",this.productDAO.list());
		
		
		return "product";
	}
	
	@RequestMapping(value="/manage_product_delete/{id}")
	public String deleteProduct(@PathVariable("id") String id, Model model)
	{
		productDAO.delete(id);
		
		//model.addAttribute("category",this.categoryDAO.delete(category)("id"));
		//model.addAttribute("categorylist",categoryDAO.list());
		
	
		return "redirect:/product";
	}
}
*/
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

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcart.model.Product;
import com.niit.shoppingcart.model.Supplier;
import com.niit.shoppingcart.util.FileUtil;
import com.niit.shoppingcartDAO.CategoryDAO;
import com.niit.shoppingcartDAO.ProductDAO;
import com.niit.shoppingcartDAO.SupplierDAO;




@Controller 
public class ProductController
{
	@Autowired
	ProductDAO productDAO;
	
	@Autowired
	Product product;
	
	@Autowired
	CategoryDAO categoryDAO;
	
	@Autowired
	Category category;
	
	@Autowired
	SupplierDAO supplierDAO;
	
	@Autowired
	Supplier supplier;

	private Path path;

	
	
	//for add and update category both
		@RequestMapping(value="/product/add", method=RequestMethod.POST)
		public String addProduct(Model model, @Valid @ModelAttribute("product") Product product,HttpServletRequest request)
		{
			Category category=categoryDAO.getByName(product.getCategory().getName());
			categoryDAO.addCategory(category);
			Supplier supplier=supplierDAO.getByName(product.getSupplier().getName());
			supplierDAO.addSupplier(supplier);
			
			product.setCategory(category);
			product.setSupplier(supplier);
			
			product.setCategory_id(category.getCategory_id());
			product.setSupplier_id(supplier.getSupplier_id());
			
			
			
			productDAO.addProduct(product);
			
			
			MultipartFile file=product.getImage();
			String rootDirectory=request.getSession().getServletContext().getRealPath("/");
			path = Paths.get(rootDirectory + "\\WEB-INF\\resources\\images\\"+product.getId()+".jpg");
			if(file!=null && !file.isEmpty())
			{
				try{
					
					file.transferTo(new File(path.toString()));
					System.out.println("image uploaded....:");
				}
				 catch(Exception e)
				{
					 e.printStackTrace();
					 throw new RuntimeException("image saving failed",e);
					 
				}
			}
			FileUtil.upload(path.toString(), file, product.getId()+ ".jpg");
			//return "category";
			System.out.println("image uploaded....: "+product.getId());
			return "redirect:/product";
		}
		
		@RequestMapping("product/remove/{id}")
		public String deleteProduct(@PathVariable("id") String id, ModelMap model) throws Exception {

			try {
				productDAO.delete(id);
				model.addAttribute("message", "Successfully Added");
			} catch (Exception e) {
				model.addAttribute("message", e.getMessage());
				e.printStackTrace();
			}
			// redirectAttrs.addFlashAttribute(arg0, arg1)
			return "redirect:/product";
		}
		

		@RequestMapping("product/edit/{id}")
		public String editProduct(@PathVariable("id") String id, Model model) {
			System.out.println("editProduct");
			model.addAttribute("product", this.productDAO.getProduct(id));
			model.addAttribute("productList", this.productDAO.list());
			model.addAttribute("categoryList",this.categoryDAO.list());
			model.addAttribute("supplierList",this.supplierDAO.list());
			return "product";
		}
		
		
			@RequestMapping(value = "/product", method = RequestMethod.GET)
			public String listProducts(Model model){
				model.addAttribute("product", new Product());
				model.addAttribute("category",new Category());
				model.addAttribute("supplier",new Supplier());
				model.addAttribute("productList",this.productDAO.list());
				model.addAttribute("categoryList",this.categoryDAO.list());
				model.addAttribute("supplierList",this.supplierDAO.list());
				return "product";
			
		}
			
		
	
}