
import javax.swing.*;
import java.awt.*;

public class RegisterationForm extends JApplet{
    
    JButton b1,b2,b3,b4;
    JTextField t1,t2,t3,t4;
    JLabel l1,l2,l3,l4;
    
    public void init()
    {
    setLayout(null);
    l1 = new JLabel("User Id");
    l1.setBounds(245,115,45,45);
    
    t1 = new JTextField(30);
    t1.setBounds(300,125,100,20);
    
    l2 = new JLabel("Password");
    l2.setBounds(245,130,145,145);
    
    t2 = new JTextField(30);
    t2.setBounds(300,150,100,20);
    
    add(l1);
    add(t1);
    add(l2);
    add(t2);
    
    }
}
