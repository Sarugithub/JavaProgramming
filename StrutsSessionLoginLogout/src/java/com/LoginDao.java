/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.sql.*;  


public class LoginDao {
    
    public static boolean validate (String username, String userpass)
    {
        boolean status = false;
        Connection con;
        try
        {   
            Class.forName("com.mysql.jdbc.Driver"); 
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","admin123"); 
            PreparedStatement ps  = con.prepareStatement("select * from user33 where name=? and password=?");
             ps.setString(1,username);  
             ps.setString(2,userpass);  
             ResultSet rs=ps.executeQuery();  
             status=rs.next();  
            
        }
        
        catch(Exception e){e.printStackTrace();}  
        
        return status;
        
    }
}
