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

import java.util.Scanner;



public class PracticeScanner {
    
    static void checkPrime(int n)
    {
        int i, m=0, flag =0;
        
        m=n/2;
        if(n==0 || n==1)
        {
            System.out.println("Its not a prime number");
            
        }
        else
        {
            for(i =2;i<=m;i++)
            {
                if (n%i==0)
                {
                    System.out.println("Not Prime");
                    flag=1;
                    break;
                }
            }
            
            if(flag==0)
            {
                System.out.println("Its a prime number");
            }
        }
    }
                    
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Number");
        int num = sc.nextInt();
        
        System.out.println("You enetered"  +num);
        checkPrime(num);
        
    }
    
}

