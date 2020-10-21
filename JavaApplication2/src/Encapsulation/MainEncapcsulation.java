/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulation;

/**
 *
 * @author SACHIN AGRAWAL
 */
public class MainEncapcsulation {
    
             public static void main (String args[])
             {
                 EncapsulationDemo obj1 = new EncapsulationDemo();
                 obj1.setId(20);
                 obj1.setName("Saru");
                 
                 System.out.println(obj1.getId());
                 System.out.println(obj1.getName());
              
                 try{
                int d=1;
                 int a=42/d;
                 }catch(Exception e)
                 {
                     System.out.println(e);
                 }
             }

                 
}
