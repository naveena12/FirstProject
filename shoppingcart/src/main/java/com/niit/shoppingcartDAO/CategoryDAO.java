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

import com.niit.shoppingcart.model.Category;


public interface CategoryDAO 
{
	public void addCategory(Category category);
	public Category getCategory(String id);
	public void delete(String id);
	public List<Category> list();
	public Category getByName(String name);


}