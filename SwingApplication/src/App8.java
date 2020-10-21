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

public class App8 extends JApplet{
    
    Button b1,b2,b3,b4,b5;
    
    public App8()
    {
        GridLayout g = new GridLayout (2,3,20,30);
        setLayout(g);
        
        b1 = new Button("First");
        b2 = new Button("Second");
        b3 = new Button ("Third");
        b4 = new Button ("Last");
        
        add(b1);
        add(b2);
        add(b3);
        add(b4);
    }
}
