
import java.awt.event.*; 
import java.awt.*; 
import javax.swing.*; 
class combo extends JFrame implements ItemListener { 
  
    // frame 
    static JFrame f; 
  
    // label 
    static JLabel l, l1; 
  
    // combobox 
    static JComboBox c1; 
  
    
  
    
    // main class 
    public static void main(String[] args) 
    { 
        // create a new frame 
        f = new JFrame("frame"); 
  
        // create a object 
        combo s = new combo(); 
  
        // set layout of frame 
        f.setLayout(new FlowLayout()); 
  
        // array of string contating cities 
        String s1[] = { "bangalore", "Mumbai", "Noida", "Kolkata", "New Delhi" }; 
  
        // create checkbox 
        c1 = new JComboBox(s1); 
  
        // add ItemListener 
        c1.addItemListener(s); 
  
        // create labels 
        l = new JLabel("select your city "); 
        l1 = new JLabel("bangalore selected"); 
  
        // set color of text 
        l.setForeground(Color.red); 
        l1.setForeground(Color.blue); 
  
        // create a new panel 
        JPanel p = new JPanel(); 
  
        p.add(l); 
  
        // add combobox to panel 
        p.add(c1); 
  
        p.add(l1); 
  
        // add panel to frame 
        f.add(p); 
  
        // set the size of frame 
        f.setSize(400, 300); 
  
        f.show(); 
        f.setLayout(new FlowLayout()); 
        
    
        
        // create checkboxxxxxx
        JCheckBox c1 = new JCheckBox("checkbox 1"); 
        JCheckBox c2 = new JCheckBox("checkbox 2"); 
  
        // create a new panel 
        JPanel p1 = new JPanel(); 
  
        // add checkbox to panel 
        p1.add(c1); 
        p1.add(c2); 
  
        // add panel to frame 
        f.add(p1); 
  
        // set the size of frame 
        f.setSize(300, 300); 
  
        f.show(); 
        
        
        //text fielddddd
        JFrame f= new JFrame("TextField Example");  
        JTextField t1,t2;  
        t1=new JTextField("howdyyyyy.");  
        t1.setBounds(50,100, 200,30);  
        t2=new JTextField("JERRY");  
        t2.setBounds(50,150, 200,30);  
        f.add(t1); f.add(t2);  
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  
        
        combo m=new combo();  
        JFrame f1=new JFrame();  
        f1.add(m);  
        f1.setSize(400,400);  
        f1.setVisible(true);  
        
        
        
        
    } 
    public void itemStateChanged(ItemEvent e) 
    { 
        // if the state combobox is changed 
        if (e.getSource() == c1) { 
  
            l1.setText(c1.getSelectedItem() + " selected"); 
        } 
    } 
    
   
    
} 