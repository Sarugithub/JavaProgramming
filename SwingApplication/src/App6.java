/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SACHIN AGRAWAL
 */


import javax.swing.*;
import java.awt.*;

public class App6 extends JApplet {
    
    JButton b1,b2,b3,b4,b5;
    public void init()
    {
        FlowLayout f = new FlowLayout (FlowLayout.LEADING,20,30);
        setLayout(f);
        
        b1 = new JButton("First");
        b2 = new JButton("Last");
        b3 = new JButton ("Next");
        
        add(b1);
        add(b2);
        add(b3);
        
    }
    
}
