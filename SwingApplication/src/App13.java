
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class App13 extends JApplet implements KeyListener {
    
    public void init()
    {
        addKeyListener(this);
    }
    
    public void keyPressed (KeyEvent tt)
    {
        
    }
   
    public void keyReleased (KeyEvent tt)
    {
       
    }
    
     public void keyTyped (KeyEvent tt)
    {
        
        switch(tt.getKeyChar())
        {
            case 'R': getContentPane().setBackground(Color.red);
                        break;
            
            case 'G':getContentPane().setBackground(Color.red);
                        break;
                        
            case 'B':getContentPane().setBackground(Color.red);
                        break;
                        
            default: getContentPane().setBackground(Color.red);
                        break;
        }
    
     
    }
     
}
