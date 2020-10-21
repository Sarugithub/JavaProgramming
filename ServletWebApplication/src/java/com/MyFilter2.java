/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 *
 * @author SACHIN AGRAWAL
 */
public class MyFilter2 implements Filter {
    
    public void init(FilterConfig arg0) throws ServletException {}  
      
public void doFilter(ServletRequest req, ServletResponse resp,  
        FilterChain chain) throws IOException, ServletException { 
    resp.setContentType("text/html");  
          
    PrintWriter out=resp.getWriter();  
          
    String password=req.getParameter("password");  
    if(password.equals("admin")){  
    chain.doFilter(req, resp);//sends request to next resource  
    }  
    else{  
    out.println("username or password error!");  
   RequestDispatcher rd=req.getRequestDispatcher("HtmlSample3.html");  
    rd.include(req, resp);  
    }  
          
}  
    public void destroy() {}  
  

    
}
