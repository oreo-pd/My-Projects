

import java.awt.*;
import javax.swing.*;
 
public class Layout {
    public static void main(String[] args) {
 
        JFrame frame = new JFrame("GridLayout Demo");
        JButton btn1 = new JButton("Button 1");
        JButton btn2 = new JButton("Button 2");
        JButton btn3 = new JButton("Button 3");
        JButton btn4 = new JButton("Button 4");
        JButton btn5 = new JButton("Button 5");
        
        JPanel panel = new JPanel(new GridLayout(3,2,10,10));
        // add buttons to the panel
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btn4);
        panel.add(btn5);
 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,150);
        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}