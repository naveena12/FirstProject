package com.niit.shoppingcartbackend;



import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.model.Supplier;
import com.niit.shoppingcartDAO.SupplierDAO;




public class testSupplier {
public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
		SupplierDAO supplierDAO = (SupplierDAO) context.getBean("supplierDAO");
		Supplier supplier = (Supplier) context.getBean("supplier");
		

		
		

		supplier.setSupplier_id("MOB007");
		supplier.setName("navee");
		supplier.setAddress("gandhiroad");
		
		
		supplier.setSupplier_id("01");
		supplier.setName("spurthi");
		supplier.setAddress("gandhiroad");
		//System.out.println(supplierDAO.save(supplier));
		//supplierDAO.delete(supplier);
		//supplierDAO.update(supplier);
			//System.out.println("Data deleted in DB");
	        //System.out.println("data inserted in db");
		//System.out.println("data updated");
		List<Supplier> plist=supplierDAO.list();
		for(Supplier p:plist)
		{
			System.out.println("Supplier name:"+p.getName());
			System.out.println("Supplier id:"+p.getSupplier_id());
		}
		
	}
	}
		

