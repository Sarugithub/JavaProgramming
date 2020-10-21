package com;  
  
  
import org.hibernate.*;  
import org.hibernate.cfg.*;  
  
public class StoreData2 {  
    
public static void main(String[] args) {  
SessionFactory sessionFactory=new AnnotationConfiguration().configure().buildSessionFactory();  
System.out.println("welcome");
      Session session = sessionFactory.openSession();
       
      Transaction tx = session.beginTransaction();      
    Employee2 e1=new Employee2();  
    e1.setId(1001);  
    e1.setFirstName("saru");  
    e1.setLastName("jaiswal");  
      
    Employee2 e2=new Employee2();  
    e2.setId(1002);  
    e2.setFirstName("vimal");  
    e2.setLastName("jaiswal");  
      
    session.persist(e1);  
    session.persist(e2);  
      
    tx.commit();  
    session.close();  
    System.out.println("successfully saved");  
}  
}  
