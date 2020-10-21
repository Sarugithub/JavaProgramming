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

class MyException1 extends Exception{
    String str1;
    MyException1(String str2) {
       str1=str2;
    }
    public String toString(){ 
       return ("Output String = "+str1) ;
    }
}

class CustomException{
    public static void main(String args[]){
       try{
          throw new MyException1("Custom");
          // I'm throwing user defined custom exception above
       }
       catch(MyException1 exp){
          System.out.println("Hi this is my catch block") ;
          System.out.println(exp) ;
       }
    }
}