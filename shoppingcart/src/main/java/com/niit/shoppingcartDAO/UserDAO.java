/*package com.niit.shoppingcartDAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.shoppingcart.model.User;
@Repository("userDAO")
public interface UserDAO {
	public boolean save(User user);
	public boolean update(User user);
	public void delete(String id);
	public User get(String id);
	public List<User> list();

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

import com.niit.shoppingcart.model.User;




public interface UserDAO 
{
	public void addUser(User user);
	public User getUser(String id);
	public void delete(int id);
	public List<User> list();
	public User getByName(String name);


}