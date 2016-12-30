/*package com.niit.shoppingcartbackend;


import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.niit.shoppingcart.model.Supplier;
import com.niit.shoppingcartDAO.SupplierDAO;

public class Suppliertestcase {

	@Autowired
	AnnotationConfigApplicationContext context;
	@Autowired
	Supplier supplier;
	@Autowired
	SupplierDAO supplierDAO;
	public void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		SupplierDAO supplierDAO = (SupplierDAO) context.getBean("supplierDAO");
		Supplier supplier = (Supplier) context.getBean("supplier");
	}
	//start writing junit test cases
	//for each method defined in DAO
	@Test
	public void createSupplierTestCase()
	{
		supplier.setId("mob4");
		supplier.setName("navee");
		supplier.setAddress("gandhiroad");
		boolean status= supplierDAO.save(supplier);

	Assert.assertEquals("Create Supplier Test Case",true,status);		
	}
}
*/