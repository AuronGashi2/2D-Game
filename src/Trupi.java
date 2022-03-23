import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.geom.GeneralPath;

public class Trupi implements Figura {
    int x = 200;
    int y = 200;
    public Trupi(int x_pos , int y_pos){
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
        gp.lineTo(x+550,y);
        gp.lineTo(x+550,y+150);
        gp.lineTo(x+450,y+150);
        gp.curveTo(x+450,y+150,x+415,y+100,x+385,y+150);
        gp.lineTo(x+180,y+150);
        gp.curveTo(x+180,y+150,x+155,y+100,x+115,y+150);
        gp.lineTo(x,y+150);
        gp.closePath();
        g2.setStroke(new BasicStroke(4));
        g2.draw(gp);
        g2.setColor(new Color(207, 29, 44));
        g2.fill(gp);
    }
    public void ndrroVleren(int x1,int y1){
        x=x1;
        y=y1;
    }
}
