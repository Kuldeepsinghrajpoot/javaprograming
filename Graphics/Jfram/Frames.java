import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Frames extends JFrame {
   public Frames() {
      JPanel panel = new JPanel();
      getContentPane().add(panel);
      setSize(550, 300);
   }
   public void paint(Graphics gp) { 
   	  super.paint(gp); 
   	  Graphics2D graphics = (Graphics2D) gp;  
      Line2D line = new Line2D.Float(50,50,450,50);
     // Line2D line = new Line2D.Float(50,450,450,450);
      graphics.draw(line);
   }
   public static void main(String[] args) {
      Frames demo = new Frames();
      demo.setVisible(true);
   }
}