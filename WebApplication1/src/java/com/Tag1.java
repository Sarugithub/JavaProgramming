/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.TagSupport;

/**
 *
 * @author SACHIN AGRAWAL
 */
public class Tag1 extends TagSupport {

    @Override
    public int doStartTag() throws JspException {
        JspWriter out=pageContext.getOut();
        
        try
        {
            out.println("Welcome");
            
        }
        
        catch(Exception e)
               {
               }
        return SKIP_BODY;
    }
    
    
    

 
    }
    
