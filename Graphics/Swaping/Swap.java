import java.awt.JFrame.*;
import java.awt.Color.*;
import java.awt.ActionEvent;
import java.awt.JButton.*;


public class Swap extends JFrame {

    int x = 100;
    int y = 100;

    Swap() {
        super("Circle");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.pink);
        JButton f = new JButton("circle");
        f.addActionListener(new re());
        add(f, BorderLayout.NORTH);
    }

    private class re implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            for (int i = 1; i < 50; i++) {
                x++;
                y++;
                repaint();
            }
        }
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawOval(x, y, 100, 100);
    }

    public static void main(String[] args) {
        Swap l = new Swap();
        l.setVisible(true);
    }
}