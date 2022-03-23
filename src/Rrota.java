import java.awt.*;
import java.awt.event.MouseEvent;

public class Rrota implements Figura {
    int x = 200;
    int y = 200;
    public Rrota(int x_pos , int y_pos){
        x = x_pos;
        y = y_pos;
    }
    @Override
    public void kontrollo(MouseEvent e) {
        if (Math.abs(x - e.getX())<20)
        if (Math.abs(y-e.getY())<20)
            ndrroVleren(e.getX(),e.getY());
    }

    @Override
    public void vizato(Graphics g) {
        Graphics2D g2 = (Graphics2D )g;
        Stroke s = g2.getStroke();
        g2.setStroke(new BasicStroke(10));
        g2.setColor(new Color(155, 151, 155));
        g2.fillOval(x-25,y-45 ,50 ,50);
        g2.setColor(Color.BLACK);
        g2.drawOval(x-25,y-45,50,50);
        g2.setColor(new Color(102, 94, 78));
        g2.fillOval(x-10,y-30 ,7 ,7);
        g2.fillOval(x+5,y-30 ,7 ,7);
        g2.fillOval(x-10,y-15 ,7 ,7);
        g2.fillOval(x+5,y-15 ,7 ,7);
        g2.setStroke(s);
    }
    public void ndrroVleren(int x1,int y1){
        x=x1;
        y=y1;
    }
}
