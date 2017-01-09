/**
 * 
 */
package com.hibernate.testing;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.pojo.States;

/**
 * A sample program that demonstrates how to perform simple CRUD operations with
 * Hibernate framework.
 * 
 * @author VAIBHAVREDDYGUDDETI Jan 8, 2017
 */
public class StatesHibernateTest {
	public static void main(String[] args) {
		listStates();
	}

	/* Method to READ all the states */
	public static void listStates( ){
		SessionFactory sessionFactory;
		sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
	      Transaction tx = null;
	      try{
	         tx = session.beginTransaction();
	         List employees = session.createQuery("FROM States").list(); 
	         for (Iterator iterator = 
	                           employees.iterator(); iterator.hasNext();){
	            States statesObj = (States) iterator.next(); 
	            System.out.print("Id: " + statesObj.getiD()); 
	            System.out.print("   State Name: " + statesObj.getState()); 
	            System.out.println("  population: " + statesObj.getPopulation()); 
	         }
	         tx.commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	      }
	   }
}
