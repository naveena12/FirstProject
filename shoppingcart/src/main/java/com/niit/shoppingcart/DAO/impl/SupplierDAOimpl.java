/*package com.niit.shoppingcart.DAO.impl;

import java.util.List;


import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.model.Product;
import com.niit.shoppingcart.model.Supplier;
import com.niit.shoppingcartDAO.SupplierDAO;

@Repository("supplierDAO")
@EnableTransactionManagement
public class SupplierDAOimpl implements SupplierDAO {
@Autowired
SessionFactory sessionFactory;
public SupplierDAOimpl(SessionFactory sessionFactory)
{
	this.sessionFactory=sessionFactory;
}
 @Transactional
	public boolean save(Supplier supplier) {
	 try {
		
		sessionFactory.getCurrentSession().save(supplier);
		return true;
	} catch (HibernateException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	
		// TODO Auto-generated method stub
		return false;
	}}
 @Transactional
	public boolean update(Supplier supplier) {
		// TODO Auto-generated method stub
	 try {
		sessionFactory.getCurrentSession().update(supplier);
		return true;
	} catch (HibernateException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return false;
	}
 }
 @Transactional
	public void delete(String id) {
	 Supplier supplier=new Supplier();
		supplier.setId(id);
		// TODO Auto-generated method stub
	 
		sessionFactory.getCurrentSession().delete(supplier);
		
	}
	 
 @Transactional
	public Supplier get(String id) {
	 String hql="from String where id="+"'"+id+"'";
	 Query query=sessionFactory.getCurrentSession().createQuery(hql);
	 List<Supplier> li=(List<Supplier>)query.list();
	 if(li==null||li.isEmpty())
		 return null;
	 else
		 return li.get(0);
 
		// TODO Auto-generated method stub
		
	}
 @Transactional
	public List<Supplier> list() {
	 String hql ="from Supplier";
	   List<Supplier> li=sessionFactory.getCurrentSession().createQuery(hql).list();
		// TODO Auto-generated method stub
		return li;
 	
	
		// TODO Auto-generated method stub
	
	}


}
*/
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
import com.niit.shoppingcartDAO.CategoryDAO;

@Repository("categoryDAO")
@EnableTransactionManagement
public class CategoryDAOimpl implements CategoryDAO {
	@Autowired
	SessionFactory sessionFactory;
	public CategoryDAOimpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
  @Transactional
	public void saveorupdate(Category category) 
  {
		try {
		
			sessionFactory.getCurrentSession().saveOrUpdate(category);
	
			//return true;
		} catch ( HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
			//return false;
	}
}
 
  
  
  //@Transactional
  //public void saveCat(Category category)
  //{
//	  sessionFactory.getCurrentSession().save(category);
	//  System.out.println("Data Inserted.....");
  //}
	@Transactional
	public void delete(String id) {
		Category category=new Category();
		category.setId(id);
			sessionFactory.getCurrentSession().delete(category);
			
		
	}
	
	@Transactional
	public Category get(String id) 
	{
		String hql="from Category where id="+"'"+id+"'";
	 Query query=sessionFactory.getCurrentSession().createQuery(hql);
	 List<Category> li=(List<Category>)query.list();
	 if(li==null && li.isEmpty())
		 return null;
	 else
		 return li.get(0);
		 
		// TODO Auto-generated method stub
		
	}
   @Transactional
	public List<Category> list() {
	   String hql ="from Category";
	   List<Category> li=sessionFactory.getCurrentSession().createQuery(hql).list();
		// TODO Auto-generated method stub
		return li;
   	
	}
//	public boolean save(Category category){
//		try {
//			sessionFactory.getcurrentsession().save(category);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return false;
//	}
//
//	public boolean update(Category category){
//		try {
//			sessionFactory.getcurrentsession().update(category);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return false;
//	}
//	public boolean delete(Category category){
//		try {
//			sessionFactory.getcurrentsession().delete(category);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return false;
//	}
//	public Category get(String id){
//		sessionFactory.getcurrentsession().delete(category);
//		return null;
//	}
//	public List <Category> List(){
//		return null;
//	}
	@Transactional
	public boolean update(Category category) {
		try {
			sessionFactory.getCurrentSession().update(category);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		// TODO Auto-generated method stub
		return false;
	}
  }
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

import com.niit.shoppingcart.model.Supplier;
import com.niit.shoppingcartDAO.SupplierDAO;



@EnableTransactionManagement
@SuppressWarnings("deprecation")
@Repository("supplierDAO")
public class SupplierDAOimpl implements SupplierDAO 
{
	@Autowired
	private SessionFactory sessionFactory; 
	
	public SupplierDAOimpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
	
	@Transactional
	public void addSupplier(Supplier supplier)
	{
		sessionFactory.getCurrentSession().saveOrUpdate(supplier);
	}
	
	@Transactional
	public void delete(String id)
	{
		Supplier supplier=new Supplier();
		supplier.setSupplier_id(id);
		sessionFactory.getCurrentSession().delete(supplier);
	}
	
	@Transactional
	public Supplier getSupplier(String id)
	{
		String hql="from Supplier where supplier_id="+"'"+id+"'";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		List<Supplier> list=(List<Supplier>) query.list();
		if(list!=null&& !list.isEmpty())
		{
			return list.get(0);
		}
		return null;
		
	}
	
	@Transactional
	public Supplier getByName(String name)
	{
		String hql="from Supplier where name="+"'"+ name +"'";
		@SuppressWarnings("rawtypes")
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Supplier> list= query.list();
		if(list!=null && !list.isEmpty())
		{
			return list.get(0);
		}
		return null;
		
	}
	
	@Transactional
	public List<Supplier> list()
	{
		List<Supplier> list= (List<Supplier>) sessionFactory.getCurrentSession().createCriteria(Supplier.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return list;
				
	}
}