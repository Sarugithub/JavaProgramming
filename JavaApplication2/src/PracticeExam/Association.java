/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeExam;

/**
 *
 * @author SACHIN AGRAWAL
 */

import java.io.*;

class Bank
{
    String name;
    
    Bank(String name)
    {
        this.name= name;
    }
    
    public String getBankName()
    {
        return this.name;
    }
    
}

class Employee
{
    private String name;
    
    Employee (String name)
    {
        this.name = name;
    }
    public String getEmployeeName()
    {
        return this.name;
    }
    
}

public class Association {
    
                public static void main(String args[])
                {
                    Bank bank = new Bank("Axis Bank");
                    Employee emp = new Employee ("Neha");
                    
                    System.out.println(emp.getEmployeeName() +"Is employee of" +bank.getBankName());
                }
                
                
                
    
}
