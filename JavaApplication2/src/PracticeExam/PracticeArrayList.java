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

import java.util.*;


public class PracticeArrayList {
    
    public static void main (String args[])
    {
    ArrayList <String> list = new ArrayList <String>(); // Creating arraylist
    list.add("Ravi");
    list.add("Saru");
    list.add("Reha");
    
    Iterator itr = list.iterator();
    while(itr.hasNext())
    {
        System.out.println(itr.next());
    }
    }
    
    
    
}
