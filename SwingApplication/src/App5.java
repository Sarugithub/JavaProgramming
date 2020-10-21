import javax.swing.*;
import java.awt.*;

 
public class App5 extends JApplet {
    
    JTextField t1;
    JButton b1;
    JCheckBox c1;
    Choice ch1;
    JLabel l1;
    JScrollBar s1;
    
    public void init ()
    {
        setLayout(new FlowLayout());
        t1 = new JTextField(20);
        l1 = new JLabel("Hello SWING");
        b1 = new JButton("SUBMIT");
        c1 = new JCheckBox("India");
        
        ch1 = new Choice();
        
        ch1.addItem("Mumbai");
        ch1.addItem("Pune");
        ch1.addItem("Delhi");
        ch1.addItem("Chandigarh");
        
        s1 = new JScrollBar(JScrollBar.HORIZONTAL,10,10,1,25);
        
        add(l1);
        add(t1);
        add(b1);
        add(c1);
        add(ch1);
        add(s1);
        
    }
    
    
    
}
