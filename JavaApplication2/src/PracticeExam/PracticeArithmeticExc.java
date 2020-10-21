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
public class PracticeArithmeticExc {
    
            public static void main (String args[])
            {
                try
                {
                    int num1 = 20, num2=0;
                    int output = num1/num2;
                    System.out.println("Result"+output);
                    
                }
                catch(ArithmeticException e)
                {
                    System.out.println("Cant divide by 0");
                }
            }
    
}
