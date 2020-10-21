/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SACHIN AGRAWAL
 */
package com;  
  
import java.util.Map;  
import org.apache.struts2.dispatcher.SessionMap;  
import org.apache.struts2.interceptor.SessionAware;  
  
public class Login implements SessionAware {
    
    private String username, userpass;
    private SessionMap <String, String> sessionmap;

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the userpass
     */
    public String getUserpass() {
        return userpass;
    }

    /**
     * @param userpass the userpass to set
     */
    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }

    /**
     * @return the sessionmap
     */
    public SessionMap <String, String> getSessionmap() {
        return sessionmap;
    }

    /**
     * @param sessionmap the sessionmap to set
     */
    
    public String execute()
    {
      if (LoginDao.validate(username, userpass))
      {
          return "success";
      }
      else
      {
          return "error";
      }
          
    }
    
    
    public void setSession(Map map)
    {
            sessionmap= (SessionMap)map;
            sessionmap.put("login","true");
    }
    
    public String logout()
    {  
        sessionmap.invalidate();  
        return "success";  
    }
}
