import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class ClickEvents extends MouseAdapter{
      JFrame f;
      int x1=0,x2=0,y1=0,y2=0;
     public static void main(String[] args) {
    	new ClickEvents();
    }
    ClickEvents(){
        f = new JFrame("click");
        f.setVisible(true);
        f.setSize(500,500);
        f.setLayout(null);
        f.addMouseListener(this);
    }
    public void mouseClick(MouseEvent e){
    	Graphics g = f.getGraphics();
    	x1=e.getX();y1=e.getY();
    	g.fillOval(x1,y1,10,10);
    }
}