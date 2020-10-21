
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class App17 extends JFrame implements ActionListener
{
    JButton b1;
    public App17()
    {
        FlowLayout f1 = new FlowLayout();
        setLayout(f1);
        
        b1 = new JButton("Choose Color");
        b1.addActionListener(this);
        add(b1); 
       setSize(300,300);
       show();          
    }
    
    public void actionPerformed(ActionEvent tt)    
    {
        if (tt.getSource() == b1)
        {
            Color cc = JColorChooser.showDialog(this, "colorChooser", getBackground());
            getContentPane().setBackground(cc);
        }
        
        
    }
    
    public static void main (String args[])
    {
        new App17();
    }
            
}

