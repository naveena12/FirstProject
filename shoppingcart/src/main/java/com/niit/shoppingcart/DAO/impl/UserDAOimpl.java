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
import com.niit.shoppingcart.model.User;
import com.niit.shoppingcartDAO.UserDAO;

@Repository("userDAO")
@EnableTransactionManagement
public class UserDAOimpl  implements UserDAO {
	@Autowired
	SessionFactory sessionFactory;
	public UserDAOimpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
   @Transactional
	public boolean save(User user) {
	   try {
		sessionFactory.getCurrentSession().save(user);
		return true;
	} catch (HibernateException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	
		// TODO Auto-generated method stub
		return false;
	}}
   
   @Transactional
	public boolean update(User user) {
	   try {
		sessionFactory.getCurrentSession().update(user);
		return true;
	} catch (HibernateException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	
		// TODO Auto-generated method stub
		return false;
	}}
   
    @Transactional
	public void delete(String id) {
    	User user=new User();
		user.setId(id);
    	
			sessionFactory.getCurrentSession().delete(user);
			
	}
    
    @Transactional
	public User get(String id) {
    	{
    		String hql="from User where id="+"'"+id+"'";;
    		 Query query=sessionFactory.getCurrentSession().createQuery(hql);
    		 List<User> li=(List<User>)query.list();
    		 if(li==null||li.isEmpty())
    			 return null;
    		 else
    			 return li.get(0);
    	
		// TODO Auto-generated method stub
    	}
	
		// TODO Auto-generated method stub
	
	}
    
    
    @Transactional
	public List<User> list() {
    	 String hql ="from User";
		   List<User> li=sessionFactory.getCurrentSession().createQuery(hql).list();
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

import com.niit.shoppingcart.model.User;
import com.niit.shoppingcartDAO.UserDAO;



@EnableTransactionManagement
@SuppressWarnings("deprecation")
@Repository("userDAO")
public class UserDAOimpl implements UserDAO 
{
	@Autowired
	private SessionFactory sessionFactory; 
	
	public UserDAOimpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
	
	@Transactional
	public void addUser(User user)
	{
		sessionFactory.getCurrentSession().saveOrUpdate(user);
	}
	
	@Transactional
	public void delete(int id)
	{
		User user=new User();
		user.setId(id);
		sessionFactory.getCurrentSession().delete(user);
	}
	
	@Transactional
	public User getUser(String id)
	{
		String hql="from User where id="+"'"+id+"'";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		List<User> list=(List<User>) query.list();
		if(list!=null&& !list.isEmpty())
		{
			return list.get(0);
		}
		return null;
		
	}
	
	@Transactional
	public User getByName(String name)
	{
		String hql="from User where name="+"'"+ name +"'";
		@SuppressWarnings("rawtypes")
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<User> list= query.list();
		if(list!=null && !list.isEmpty())
		{
			return list.get(0);
		}
		return null;
		
	}
	
	@Transactional
	public List<User> list()
	{
		List<User> list= (List<User>) sessionFactory.getCurrentSession().createCriteria(User.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return list;
				
	}
}