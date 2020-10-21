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
      try {
    m();  
      }catch(ArithmeticException e){
          
      }
  }  
  
  void p(){  
   try{    // checked exception
    n();  
   }catch(IOException e){System.out.println("exception handled");
        System.out.println(e);
        e.printStackTrace();
   
   }  
  }  
  
  public static void main(String args[]){  
   Testthrows1 obj=new Testthrows1();  
   obj.p();  
   System.out.println("normal flow...");  
  }  
}
