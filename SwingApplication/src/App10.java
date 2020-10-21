
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class App10 extends JApplet implements ActionListener {
    
    JLabel l1;
    JTextField t1, t2;
    JButton b1;
    
    public void init()
    {
        FlowLayout f = new FlowLayout();
        setLayout(f);
        
        l1 = new JLabel ("Enter number");
        
        t1 = new JTextField (20);
        t1.setFont(new Font ("arial", Font.BOLD, 30));
        t1.setForeground(Color.red);
        
        t2 = new JTextField(20);
        t2.setFont(new Font ("arial", Font.BOLD, 30));
        t2.setForeground(Color.blue);
        
        b1 = new JButton ("ok");
        b1.addActionListener (this);
        
        add(l1);
        add(t1);
        add(t2);
        add(b1);        
        
    }
    
    public void actionPerformed(ActionEvent tt)
    {
        int a = Integer.parseInt(t1.getText());
        if(a%2==0)
        {
            t2.setText("Even Number" +a);
        }
        else
        {
            t2.setText("Odd Number" +a);
        }
        
    }
}


