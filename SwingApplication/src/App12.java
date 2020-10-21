
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class App12 extends JApplet implements ItemListener 
{
    
       int x;
       JComboBox cb1;
       
       public void init()
       {
           FlowLayout f1 = new FlowLayout();
           setLayout(f1);
           
           cb1 = new JComboBox();
           cb1.addItem("Circle");
           cb1.addItem("Rectangle");
           cb1.addItem("Line");
           add(cb1);
           cb1.addItemListener(this);     
       }
       
       public void itemStateChanged(ItemEvent tt)
       {
           x = cb1.getSelectedIndex();
           repaint();
       }
       
       public void paint(Graphics gg)
       {
           switch(x)
           {
               case 0: gg.setColor(Color.red);
                       gg.fillOval(100,100,30,30);
                       break;
               
               case 1: gg.setColor(Color.green);
                       gg.drawRect(200,200,30,30);
                       break;
               
               case 2: gg.setColor(Color.yellow);
                        gg.drawLine(10,10,30,30);
                        break;
           }
       }
    }
    
    
