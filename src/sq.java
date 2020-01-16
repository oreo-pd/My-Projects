
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
 
public class sq extends Applet{
 
	public void paint(Graphics g){
		
		
	
		g.draw3DRect(100,200,50,50,true);
		
		g.setColor(Color.orange);
		
		g.fill3DRect(10,200,50,100,true);
		
		g.draw3DRect(100,100,50,50,true);	
		g.setColor(Color.green);
		
		g.fill3DRect(100,100,50,50,true);
		
		        
		g.drawRoundRect(250, 300, 150, 50, 55, 45);
		g.setColor(Color.CYAN);
		g.fillRoundRect(250, 300, 150, 50, 55, 45);
		
		g.drawRoundRect(350, 400, 100, 100, 55, 45);
		g.setColor(Color.black);
		g.fillRoundRect(350, 400, 100, 100, 55, 45);
		
		
		g.setColor(Color.magenta);
	 g.drawOval(25, 50, 50, 50);
	g.fillOval(25, 50, 50, 50);
	}
}