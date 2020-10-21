/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package bean;
import java.sql.*;

/**
 *
 * @author SACHIN AGRAWAL
 */
public class LoginDao {
    
    public static boolean validate(LoginBean bean){  
boolean status=false;  
try{  
    Class.forName("com.mysql.jdbc.Driver");
    System.out.println("welcome");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/PAGE","root","admin123");
              
PreparedStatement ps=con.prepareStatement(  
    "select * from user432 where email=? and pass=?");  
  
ps.setString(1,bean.getEmail());  
ps.setString(2, bean.getPassword());  
              
ResultSet rs=ps.executeQuery();  
status=rs.next();  
              
}catch(Exception e){}  
  
return status;  
  
}  
}  

    

