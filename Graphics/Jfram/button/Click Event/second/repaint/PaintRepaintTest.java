import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class PaintRepaintTest extends JPanel implements MouseListener {
   private Vector v;
   public PaintRepaintTest() {
      v = new Vector();
      setBackground(Color.white);
      addMouseListener(this);
   }
   public void paint(Graphics g) { // paint() method
      super.paint(g);
         g.setColor(Color.black);
         g.setColor(Color.BLUE);
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
         g.fillRect(25,225,50,50);
      
      Enumeration enumeration = v.elements();
      while(enumeration.hasMoreElements()) {
         Point p = (Point)(enumeration.nextElement());
         g.drawRect(p.x-20, p.y-20, 40, 40);
      }
   }
  public void mousePressed(MouseEvent me) {
      v.add(me.getPoint());
      repaint(); // call repaint() method
   }
   public void mouseClicked(MouseEvent me) {}
   public void mouseEntered(MouseEvent me) {}
   public void mouseExited(MouseEvent me) {}
   public void mouseReleased(MouseEvent me) {}
   public static void main(String args[]) {
      JFrame frame = new JFrame();
      frame.getContentPane().add(new PaintRepaintTest());
      frame.setTitle("PaintRepaint Test");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLocationRelativeTo(null);
      frame.setSize(500, 500);
      frame.setVisible(true);
   }
}