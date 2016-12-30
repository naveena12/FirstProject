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

import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcartDAO.CategoryDAO;

@EnableTransactionManagement
@SuppressWarnings("deprecation")
@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO 
{
	@Autowired
	private SessionFactory sessionFactory; 
	
	public CategoryDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
	
	@Transactional
	public void addCategory(Category category)
	{
		sessionFactory.getCurrentSession().saveOrUpdate(category);
	}
	
	@Transactional
	public void delete(String id)
	{
		Category category=new Category();
		category.setCategory_id(id);
		sessionFactory.getCurrentSession().delete(category);
	}
	
	@Transactional
	public Category getCategory(String id)
	{
		String hql="from Category where category_id="+"'"+id+"'";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		List<Category> list=(List<Category>) query.list();
		if(list!=null&& !list.isEmpty())
		{
			return list.get(0);
		}
		return null;
		
	}
	
	@Transactional
	public Category getByName(String name)
	{
		String hql="from Category where name="+"'"+ name +"'";
		@SuppressWarnings("rawtypes")
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Category> list= query.list();
		if(list!=null && !list.isEmpty())
		{
			return list.get(0);
		}
		return null;
		
	}
	
	@Transactional
	public List<Category> list()
	{
		List<Category> list= (List<Category>) sessionFactory.getCurrentSession().createCriteria(Category.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return list;
				
	}
}