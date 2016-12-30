/*package com.niit.shoppingcartDAO;

import java.util.List;

import com.niit.shoppingcart.model.Product;

public interface ProductDAO {
	public boolean save(Product product);
	public boolean update(Product product);
	public void delete(String id);
	public Product get(String id);
	public List<Product> list();
	

}
*/
package com.niit.shoppingcartDAO;

import java.util.List;

import com.niit.shoppingcart.model.Product;




public interface ProductDAO 
{
	public void addProduct(Product product);
	public Product getProduct(String id);
	public void delete(String id);
	public List<Product> list();
	public Product getByName(String name);


}