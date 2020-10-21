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
public class MyFilter3 implements Filter {
    
    FilterConfig config;
    
    public void init (FilterConfig config) throws ServletException
    {
            this.config = config;
    }
    
    public void doFilter (ServletRequest req, ServletResponse resp, FilterChain chain)throws IOException, ServletException
    {
        PrintWriter out=resp.getWriter();  
          
        String s=config.getInitParameter("construction");  
        
            if(s.equals("no")){  
         out.print("This page is under construction");  
            }  
             else{  	
         chain.doFilter(req, resp);//sends request to next resource  
            } 
    }
    
    public void destroy()
    {}
    
            
}
