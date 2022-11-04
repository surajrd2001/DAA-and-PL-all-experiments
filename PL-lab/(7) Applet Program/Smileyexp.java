import java.applet.Applet;
import java.awt.*;
public class Smileyexp extends Applet 
{
 Font f1;
 public void init()
 {
 	f1 = new Font("Arial",Font.BOLD,18);
 }
 public void paint(Graphics g)
 {
 g.setFont(f1);
 g.drawString("Smiley Face created in java applet by Gaurav ",150, 20);
 g.setColor(Color.yellow);
 g.fillOval(20,20,150,150); 
 g.setColor(Color.red);
 g.fillOval(50,60,15,25); 
 g.fillOval(120,60,15,25);
 int x[] = {95,85,106,95};
 int y[] = {85,104,104,85};
 g.drawPolygon(x, y, 4); 
 g.drawArc(55,95,78,50,0,-180);
 g.drawLine(50,126,60,116); 
 g.drawLine(128,115,139,126); 
 }
} 

