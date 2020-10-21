/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author mahesh
 */

import java.io.*;
public class Testthrows1 {
    
      void m()throws IOException{  
    throw new IOException("device error");//checked exception  
  }  
      
      
  void n()throws IOException{  
    m();  
  }  
  
  void p(){  
   try{    // checked exception
    n();  
   }catch(Exception e){System.out.println("exception handled");}  
  }  
  
  public static void main(String args[]){  
   Testthrows1 obj=new Testthrows1();  
   obj.p();  
   System.out.println("normal flow...");  
  }  
}
