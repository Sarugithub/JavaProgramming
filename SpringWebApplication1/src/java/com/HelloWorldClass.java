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
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.servlet.ModelAndView;  



    
    @Controller
    public class HelloWorldController
    {
        @RequestMapping("/hello")
        public ModelAndView helloWorld()
        {
            String message  = "HELLO SPRING MVC HOW ARE YOU";
            
            return new ModelAndView("hellopage", "message", message);  
        }
        
    }
    
    
    
}
