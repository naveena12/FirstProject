/*package com.niit.shoppingcart.DAO.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcart.model.Product;
import com.niit.shoppingcartDAO.ProductDAO;

@Repository("productDAO")
@EnableTransactionManagement
public class ProductDAOimpl implements ProductDAO {
	@Autowired
	SessionFactory sessionFactory;
	public ProductDAOimpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
    @Transactional
	public boolean save(Product product) {
    	try {
			sessionFactory.getCurrentSession().save(product);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		
		// TODO Auto-generated method stub
		return false;
	}}
    @Transactional
	public boolean update(Product product) {
    	try {
			sessionFactory.getCurrentSession().update(product);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		// TODO Auto-generated method stub
		return false;
	}}
    @Transactional
	public void delete(String id) {
    	Product product=new Product();
		product.setId(id);
    
			sessionFactory.getCurrentSession().delete(product);
			
	}
    @Transactional
	public Product get(String id) {
    	{
    		String hql="from Product where id="+"'"+id+"'";
    		Query query=sessionFactory.getCurrentSession().createQuery(hql);
    		 List<Product> li=(List<Product>)query.list();
    		 if(li==null||li.isEmpty())
    			 return null;
    		 else
    			 return li.get(0);
    	
		// TODO Auto-generated method stub
    	}
	}
     @Transactional
	public List<Product> list() {
    	
    		   String hql ="from Product";
    		   List<Product> li=sessionFactory.getCurrentSession().createQuery(hql).list();
    			// TODO Auto-generated method stub
    			return li;
    	   	
    		}
		// TODO Auto-generated method stub
	
	
	
	

}
*/
package com.niit.shoppingcart.DAO.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.model.Product;
import com.niit.shoppingcartDAO.ProductDAO;



@EnableTransactionManagement
@SuppressWarnings("deprecation")
@Repository("productDAO")
public class ProductDAOimpl implements ProductDAO 
{
	@Autowired
	private SessionFactory sessionFactory; 
	
	public ProductDAOimpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
	
	@Transactional
	public void addProduct(Product product)
	{
		sessionFactory.getCurrentSession().saveOrUpdate(product);
	}
	
	@Transactional
	public void delete(String id)
	{
		Product product=new Product();
		product.setId(id);
		sessionFactory.getCurrentSession().delete(product);
	}
	
	@Transactional
	public Product getProduct(String id)
	{
		String hql="from Product where id="+"'"+id+"'";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		List<Product> list=(List<Product>) query.list();
		if(list!=null&& !list.isEmpty())
		{
			return list.get(0);
		}
		return null;
		
	}
	
	@Transactional
	public Product getByName(String name)
	{
		String hql="from Product where name="+"'"+ name +"'";
		@SuppressWarnings("rawtypes")
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Product> list= query.list();
		if(list!=null && !list.isEmpty())
		{
			return list.get(0);
		}
		return null;
		
	}
	
	@Transactional
	public List<Product> list()
	{
		List<Product> list= (List<Product>) sessionFactory.getCurrentSession().createCriteria(Product.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return list;
				
	}
}