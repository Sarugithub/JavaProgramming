package com;  
  
import com.opensymphony.xwork2.ActionSupport;  
  
public class RegisterAction extends ActionSupport{  
private String username,userpass;  
  
public String getUsername() {  
    return username;  
}  
  
public void setUsername(String username) {  
    this.username = username;  
}  
  
public String getUserpass() {  
    return userpass;  
}  
  
public void setUserpass(String userpass) {  
    this.userpass = userpass;  
}  
  
public String execute(){  
    return "success";  
}  
  
}  