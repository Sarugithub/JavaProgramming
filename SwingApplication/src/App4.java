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


public class App4 extends JApplet {
    
            public void paint(Graphics gg)
            {
                gg.drawLine(10,10,100,100);
                gg.drawOval(100,100,100,150);
                gg.drawRect(300,300,200,150);
                gg.drawRoundRect(500,500,200,150,20,20);
                gg.drawArc(70,60,100,100,180,180);
            }
   
}
