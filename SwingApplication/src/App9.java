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
import java .awt.event.*;

public class App9 extends JApplet implements ActionListener 
{
        
        JLabel l1;
        JTextField t1, t2;
        JButton b1;

        public void init()
        {
            FlowLayout f  = new FlowLayout();
            setLayout (f);
            
            l1= new JLabel("Enter a message:");
            t1= new JTextField(20);
            Font obj = new Font("arial", Font.BOLD,30);
            t1.setFont(obj);
            t1.setBackground(Color.red);
            
            t2 = new JTextField (20);
            t2.setFont(new Font("arial", Font.BOLD, 30));
            t2.setForeground (Color.blue);
            
            b1 = new JButton ("OK");
            b1.addActionListener(this);
            
            add(l1);
            add(t1);
            add(t2);
            add(b1);
        }
        
        public void actionPerformed(ActionEvent tt)
        {
            String a = t1.getText();
            t2.setText ("" +a);
        }
               
    }
        
    

