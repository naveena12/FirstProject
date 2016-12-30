/*package com.niit.shoppingcartDAO;



import java.util.List;

import com.niit.shoppingcart.model.Supplier;




public interface SupplierDAO {
	public  boolean save(Supplier supplier);
	public boolean update(Supplier supplier);
	public void delete(String id);
	public Supplier get(String id);
	public List<Supplier> list();
	}



*/
/*package com.niit.shoppingcartDAO;



import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.shoppingcart.model.Category;

public interface CategoryDAO {
public  void saveorupdate(Category category);
//public boolean update(Category category);
public void delete(String id);
public Category get(String id);
public List<Category> list();


}
*/
package com.niit.shoppingcartDAO;

import java.util.List;

import com.niit.shoppingcart.model.Supplier;




public interface SupplierDAO 
{
	public void addSupplier(Supplier supplier);
	public Supplier getSupplier(String id);
	public void delete(String id);
	public List<Supplier> list();
	public Supplier getByName(String name);


}