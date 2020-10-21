/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import org.hibernate.Session;  
import org.hibernate.Transaction;  
import org.hibernate.cfg.Configuration; 


public class RegisterDao {
    
    public static int saveUser(User u)
    {
        Session session = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        
        int i = (Integer)session.save(u);
        t.commit();  
        session.close();  
        return i;  
        
    }
    
}
