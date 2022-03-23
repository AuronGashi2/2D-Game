import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Provuese extends JPanel implements MouseMotionListener {
    Vetura vetura = new Vetura();
    Pema pema = new Pema();

    public Provuese() {

        JFrame korniza = new JFrame();
        korniza.getContentPane().add(this);
        korniza.setSize(800, 800);
        korniza.setVisible(true);
        korniza.addMouseMotionListener(this);
        korniza.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paintComponent(Graphics g) {
        Color c = g.getColor();
        g.setColor(Color.white);
        g.fillRect(0, 0, 1000, 1000);
        g.setColor(c);
        vetura.vizato(g);
        //pema.vizato(g);
        repaint();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        vetura.kontrollo(e);
        //pema.kontrollo(e);
        /*Graphics g = this.getGraphics();
        paintComponent(g);*/
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    public static void main(String[] args) {
        new Provuese();
    }
}
