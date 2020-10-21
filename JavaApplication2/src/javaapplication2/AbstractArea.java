/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

abstract class Figure{
    double dim1;
    double dim2;
    
    Figure(double a, double b)
    {
        dim1=a;
        dim2=b;
    }
    // Area is now abstract method
    
    abstract double area();
    
    

}

class Rectangle extends Figure{
    Rectangle (double a , double b)
    {
        super(a,b);
     
    }
    
    double area(){
        System.out.println("Rectangle area is =");
        return dim1*dim2;
        
    }
   
}

class Triangle extends Figure{
    
    Triangle (double a, double b){
            super(a,b);
    }
    double area(){
        System.out.println("Trianle area is =");
        return dim1*dim2 / 2;
        
    }
            
}
public class AbstractArea {
    public static void main(String args[])
    {
        Triangle t1 = new Triangle(10,30);
        Rectangle r1 = new Rectangle(20,40);
        Figure f;
        f=t1;
        System.out.println(f.area());
         f=r1;
        System.out.println(f.area());
    }
    
    
}
