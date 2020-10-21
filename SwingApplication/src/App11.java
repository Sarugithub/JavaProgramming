
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class App11 extends JApplet implements MouseListener {
    
    public void init()
    {   
        addMouseListener(this);
    }
    
    public void mousePressed (MouseEvent tt)
    {
        getContentPane().setBackground(Color.red);
    }
    
    public void mouseClicked (MouseEvent tt)
    {
        getContentPane().setBackground(Color.green);
    }
    
    public void mouseReleased (MouseEvent tt)
    {
        getContentPane().setBackground(Color.blue);
    }
    
    public void mouseEntered (MouseEvent tt)
    {
        getContentPane().setBackground(Color.pink);
    }
    
    public void mouseExited(MouseEvent tt)
    {
        getContentPane().setBackground(Color.yellow);
    }    
}
