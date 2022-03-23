import java.awt.*;
import java.awt.event.MouseEvent;

public class Auspuh implements Figura {
    int x = 200;
    int y = 200;
    public Auspuh(int x_pos , int y_pos){
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
        g.drawRect(x-25,y-45, 40,20);
        g.setColor(new Color(148, 156, 142));
        g.fillRect(x-25,y-45,40,20);
    }
    public void ndrroVleren(int x1,int y1){
        x=x1;
        y=y1;
    }
}
