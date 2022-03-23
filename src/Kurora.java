import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.geom.GeneralPath;

public class Kurora implements Figura {
    int x = 200;
    int y = 200;
    public Kurora(int x_pos , int y_pos){
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
        Graphics2D g2 = (Graphics2D)g;
        GeneralPath gp = new GeneralPath();
        g2.setColor(Color.BLACK);
        gp.moveTo(x,y);
        gp.curveTo(x,y,x-40,y,x-40,y-40);
        gp.curveTo(x-40,y-40,x-80,y-40 ,x-80,y-80);
        gp.curveTo(x-80,y-80,  x-120,y-110 , x-80,y-140);
        gp.curveTo( x-80,y-140,x-100,y-180,x-40,y-180);
        gp.curveTo(x-40,y-180,x-50, y-220,x,y-220);
        gp.curveTo(x,y-220,x+40,y-270,x+70,y-220);
        gp.curveTo(x+70,y-220,x+110,y-220,x+110,y-180);
        gp.curveTo(x+110,y-180,x+140,y-200, x+150, y-140);
        gp.curveTo(x+150,y-140,x+190,y-110,x+150,y-80);
        gp.curveTo(x+150,y-80,x+150,y-40,x+110,y-40);
        gp.curveTo(x+110,y-40,x+110,y,x+70,y);
        gp.closePath();
        g2.setStroke(new BasicStroke(4));
        g2.draw(gp);

        g2.setColor(Color.GREEN);
        g2.fill(gp);
    }
    public void ndrroVleren(int x1,int y1){
        x=x1;
        y=y1;
    }
}
