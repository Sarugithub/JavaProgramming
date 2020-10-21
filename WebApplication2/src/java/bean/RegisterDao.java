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
public class RegisterDao {
    
    
   public static int register(User u)
{
    Connection con;
    int status=0;  
    try{  
            Class.forName("com.mysql.jdbc.Driver");  
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/PAGE","root","admin123");  
            PreparedStatement ps=con.prepareStatement("insert into USER432 values(?,?,?)");  
            ps.setString(1,u.getUname());  
            ps.setString(2,u.getUemail());  
            ps.setString(3,u.getUpass());  
              
            status=ps.executeUpdate();  
}
    catch(Exception e){}  
      
return status;  
}  
  

}
