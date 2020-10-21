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

class Student
{
    String name;
    int id;
    String dept;
    
    Student (String name, int id, String dept)
    {
        this.name = name;
        this.id = id;
        this.dept = dept;
    }
    
}

class Department
{
    String name;
    private List<Student> students;
    
    Department ()
    
}

public class Aggregation {
    
}
