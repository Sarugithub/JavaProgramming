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
public class PracticeArrayExc {
    
    
    public static void main (String args[])
    {
        try
        {
            int a[] = new int[10]; // Array has 10 elements
            a[11] = 9;
            
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
             System.out.println("Array Index Out of Bounds");
        }
        
        
    }
}
