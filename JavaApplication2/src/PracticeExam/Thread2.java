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

class Hey implements Runnable
{
    
    public void run()
    {
        for(int i=0;i<=5;i++)
        {
            System.out.println("Hey");
             try {Thread.sleep(1000);} catch(Exception e) {}
        }
    }
}

class Sionara implements Runnable
{
    public void run()
    {
       for(int i=0;i<=5;i++)
        {
            System.out.println("Sionara");
            try {Thread.sleep(1000);} catch(Exception e) {}
        }
    }
    
}

public class Thread2 {
                
                    public static void main(String[] args)
                    {
                        Runnable obj1 = new Hey();
                        Runnable obj2 = new Sionara();
                        
                        Thread t1 = new Thread(obj1);
                        Thread t2 = new Thread(obj2);
                        
                        t1.start();
                          try {Thread.sleep(1000);} catch(Exception e) {}
                        t2.start();
                        
                    }
    
    
}