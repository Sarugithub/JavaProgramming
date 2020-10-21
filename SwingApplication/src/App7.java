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

public class App7 extends JApplet {
    
    Button b1, b2, b3, b4, b5;
    
    public void init()
    {
        BorderLayout b = new BorderLayout (50,40);
        setLayout(b);
        
        b1 = new Button ("First");
        b2 = new Button ("Second");
        b3 = new Button ("Third");
        b4 = new Button ("Previous");
        b5 = new Button ("Middle");
        
        add (b1, BorderLayout.EAST);
        add (b2, BorderLayout.WEST);
        add (b3, BorderLayout.NORTH);
        add (b4, BorderLayout.SOUTH);
        add(b5, BorderLayout.CENTER);
        
    }
}
