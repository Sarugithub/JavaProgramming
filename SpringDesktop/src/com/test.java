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

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  

public class test {
    
    public static void main (String args[])
    {
        Resource resource  = new ClassPathResource("applicationContext.xml");
         BeanFactory factory=new XmlBeanFactory(resource);  
           Student student=(Student)factory.getBean("studentbean");  
            student.displayInfo();  
    }
}
