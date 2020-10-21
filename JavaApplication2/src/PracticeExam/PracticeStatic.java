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
class StudentDe
{
    int rollno;
    String name;
    static String colname = "ITS";
    
    StudentDe (int r, String n)
    {
        rollno = r;
        name = n;
    }
    
    void display()
    {
        System.out.println(rollno+"  "+name +"  "+colname);
    }
}

public class PracticeStatic {
    
        public static void main(String args[])
        {       
        StudentDe obj1 = new StudentDe (101, "Saru");
        StudentDe obj2 = new StudentDe (102, "Reha");
         obj1.display();
         obj2.display();
        }
        
    
}
