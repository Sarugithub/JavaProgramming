/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author SACHIN AGRAWAL
 */
public class Main1 {
    public static void main(String args[]){
        A obj = new A();
        obj.i=10;
        obj.j=20;
        obj.showij();
        B obj2 = new B();
        obj2.i=50;
        obj2.j=100;
        obj2.k=200;
        obj2.sum();
        obj2.showij();
    }
        
    
}
