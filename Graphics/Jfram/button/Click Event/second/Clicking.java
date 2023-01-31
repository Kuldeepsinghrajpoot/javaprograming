import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;
import javax.swing.JButton;

public class Clicking{
	private  void demo(){
		JFrame window = new JFrame("circle");
		window.getContentPane().addMouseListener(new ClickListner());
	     add(new AwtCanvas());
		
		window.setSize(500,500);
        window.setSize(600,400);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	public static void main(String[] args) {
		 Clicking c = new Clicking();
		c.demo();	
	}
}
class ClickListner extends MouseAdapter {
	public void mouseClicked(MouseEvent e){
              System.out.println(e.getX()+""+e.getY());
             // repaint();
	}
}
class AwtCanvas{
		public void paint(Graphics g){
			//setBackground(Color.white);
			g.setSize(400,300);
			g.setColor(Color.BLUE);
			g.setBackground(Color.white);
			//g.fillRect(10,10,150,100);
			//g.drawRect()
			//g.drawLine(50,50,450,50);
			g.drawLine(50,50,450,50);//line --//
			g.drawLine(50,450,450,450);//bottom line//
			g.drawLine(50,50,50,450);//left line
			g.drawLine(450,50,450,450);//right line
			g.drawLine(250,50,250,450); //top line /2
			g.drawLine(50,250,450,250);
			g.drawLine(50,150,450,150);
			g.drawLine(150,50,150,450);
			g.drawLine(50,350,450,350);
			g.drawLine(350,50,350,450);
			g.drawLine(250,50,50,250);
			g.drawLine(450,250,250,450);
			g.drawLine(250,450,50,250);
			g.drawLine(250,50,450,250);
			g.drawLine(50,50,450,450);
			g.drawLine(50,450,450,50);

            g.drawRect(25,225,50,50);
		}
	}