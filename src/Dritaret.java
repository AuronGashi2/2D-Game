import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.geom.GeneralPath;

public class Dritaret implements Figura {
    int x = 200;
    int y = 200;
    public Dritaret(int x_pos , int y_pos){
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
        GeneralPath gp = new GeneralPath();
        g2.setColor(Color.BLACK);
        gp.moveTo(x,y);
        gp.lineTo(x+150,y);
        gp.lineTo(x+250,y+100);
        gp.lineTo(x-100,y+100);
        gp.lineTo(x,y);
        gp.moveTo(x+50,y);
        gp.lineTo(x+50,y+100);
        gp.closePath();
        g2.setStroke(new BasicStroke(4));
        g2.draw(gp);
        g2.setColor(new Color(21, 232, 232));
        g2.fill(gp);

    }
    public void ndrroVleren(int x1,int y1){
        x=x1;
        y=y1;
    }
}
