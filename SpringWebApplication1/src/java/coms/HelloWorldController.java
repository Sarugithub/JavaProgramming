/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coms;
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
        @RequestMapping("/welcome")
        public ModelAndView welcomeSpring()
        {
            String msg="welcome to spring";
            return new ModelAndView("welcome","msg",msg);
        }
        
    }
    
    
    

