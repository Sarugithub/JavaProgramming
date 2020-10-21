/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

/**
 *
 * @author SACHIN AGRAWAL
 */


import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;




public class StoreData {
    
    public static void main(String args[])
    {
    
    SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();  

      Session session = sessionFactory.openSession();
       
      Transaction tx = session.beginTransaction();  
      /*
      Query query = session.createQuery("delete from Employee where id = :id");
     
      query.setLong("id", 115);
      int result = query.executeUpdate();
      System.out.println("Address delete Status=" +result);
      tx.commit();
      
      sessionFactory.close();
      
      */
      
      Query query = session.createQuery("update Employee set firstName= :firstName where id = :id");
     
      query.setParameter("firstName" , "Seema" );
      query.setLong("id", 117);
      int result = query.executeUpdate();
      System.out.println("Employee Update Status=" +result);
      tx.commit();
      sessionFactory.close();
      
      
      
  
      
      
      //Query query = session.createQuery("from Employee");
   // List<Employee> empList = query.list();
	//for(Employee emp : empList){
    
              //  System.out.println("List of Employees::"+emp.getId()+","+emp.getFirstName());
		}
    }


    
   
