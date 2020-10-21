package test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mahesh
 */
public class Exc1 {
    static void subroutine() {
    int d = 0;
    int a = 10 / d;
    }
    public static void main(String args[]) {
        B.subroutine1();
        subroutine();
        
    }
}
 class B
{
     static void subroutine1(){
         System.out.println("In B");
      //   int d = 0;
     //    int a = 15 / d;
}
}
