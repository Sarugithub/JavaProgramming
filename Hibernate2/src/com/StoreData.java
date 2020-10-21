package com;
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
      Employee2 e1=new Employee2();  
    e1.setId(11);  
    e1.setFirstName("saru");  
    e1.setLastName("aggarwal");  
      
    session.persist(e1);//persisting the object  
      
    tx.commit();//transaction is commited  
    session.close();  
      
    System.out.println("successfully saved");  
      
}  
}  