import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Loja extends JPanel implements MouseMotionListener {
    String tipi;
    Pema pema;
    Vetura vetura;
    Roboti roboti;
    public Loja() {
        pema = new Pema();
        vetura = new Vetura();
        roboti = new Roboti();
        JFrame korniza = new JFrame();
        korniza.getContentPane().add(this);
        korniza.setSize(1400, 800);
        korniza.setVisible(true);
        korniza.addMouseMotionListener(this);
        korniza.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Butoni b = new Butoni(this);
        b.setBounds(400,550 , 150,40);
        this.add(b);
        filloLojen();
    }
    public void filloLojen()
    {
        int i = (int) (Math.random()*2.999999999);
        switch (i){
            case 0 :
                tipi = "Pema";
                break;
            case 1 :
                tipi = "Vetura";
                break;
            case 2 :
                tipi = "Roboti";
                break;
            default: break;
        }
    }

    public void vizatoPemen(Graphics g)
    {
        Image image = new ImageIcon(this.getClass().getResource("Pema.png")).getImage();
        pema.vizato(g);
        g.drawImage(image,750,100,this);
    }
    public void vizatoVeturen(Graphics g)
    {
        Image image = new ImageIcon(this.getClass().getResource("Vetura.png")).getImage();
        vetura.vizato(g);
        g.drawImage(image,850,100,this);
    }
    public void vizatoRobotin(Graphics g)
    {
        Image image = new ImageIcon(this.getClass().getResource("Roboti.png")).getImage();
        roboti.vizato(g);
        g.drawImage(image,850,100,this);
    }

    public void paintComponent(Graphics g) {
        Color c = g.getColor();
        g.setColor(Color.white);
        g.fillRect(0, 0, 1400, 1000);
        g.setColor(c);
        g.setFont(new Font("TimesRoman" , Font.ITALIC , 20));
        g.drawString("Formo figuren e dhene" , 400,40);
        switch (tipi){
            case "Pema" :
                vizatoPemen(g);
                break;
            case "Vetura" :
                vizatoVeturen(g);
                break;
            case "Roboti" :
                vizatoRobotin(g);
                break;
            default: break;
        }
        repaint();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        //vetura.kontrollo(e);
        //pema.kontrollo(e);
        switch (tipi){
            case "Pema" :
                pema.kontrollo(e);
                break;
            case "Vetura" :
                vetura.kontrollo(e);
                break;
            case "Roboti" :
                roboti.kontrollo(e);
            default: break;
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    public static void main(String[] args) {
        new Loja();
    }
}
