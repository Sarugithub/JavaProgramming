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
      Employee e1=new Employee();  
    e1.setId(117);  
    e1.setFirstName("sonoo");  
    e1.setLastName("jaiswal");  
      
    session.persist(e1);//persisting the object  
      
    tx.commit();//transaction is commited  
    session.close();  
      
    System.out.println("successfully saved");  
      
}  
}  
