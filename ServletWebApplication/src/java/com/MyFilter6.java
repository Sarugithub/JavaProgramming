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
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 *
 * @author SACHIN AGRAWAL
 */
public class MyFilter6 implements Filter {
    
        static int count=0;  
    public void init(FilterConfig arg0) throws ServletException {}  
  
    public void doFilter(ServletRequest req, ServletResponse res,  
            FilterChain chain) throws IOException, ServletException {  
      
        PrintWriter out=res.getWriter();  
        chain.doFilter(req,res);  
          
        out.print("<br/>Total visitors "+(++count));  
        out.close();  
          
    }  
    public void destroy() {}  

    
}
