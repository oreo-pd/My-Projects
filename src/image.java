import java.awt.*;  
import javax.swing.JFrame;  
  
public class image extends Canvas{  
      
    public void paint(Graphics g) {  
  
        Toolkit t=Toolkit.getDefaultToolkit();  
        Image i=t.getImage("C:\\Users\\HP\\Pictures\\vk.png");  
        g.drawImage(i, 120,100,this);  
          
    }  
        public static void main(String[] args) {  
        image m=new image();  
        JFrame f=new JFrame();  
        f.add(m);  
        f.setSize(400,400);  
        f.setVisible(true);  
    }  
  
}  