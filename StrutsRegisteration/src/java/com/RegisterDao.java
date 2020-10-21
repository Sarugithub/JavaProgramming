/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;
import java.sql.*;  

/**
 *
 * @author SACHIN AGRAWAL
 */
public class RegisterDao {
    
    public static int  save(RegisterAction r)
    {
        
        int status =0;
        Connection con;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");  
           
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","admin123");  
            
            PreparedStatement ps=con.prepareStatement("insert into stud values(?,?,?,?,?)");  
            ps.setString(1,r.getName());  
            ps.setString(2,r.getPassword());  
            ps.setString(3,r.getEmail());  
            ps.setString(4,r.getGender());
            ps.setString(5,r.getCountry());
            status=ps.executeUpdate(); 
    
        }
        catch (Exception e)
        {
            e.printStackTrace();
            
        }
        return status;
     //  System.out.println(status);
        
    }
    
}
