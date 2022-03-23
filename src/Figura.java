import java.awt.*;
import java.awt.event.MouseEvent;

public interface Figura {
    public abstract void vizato(Graphics g);
    public abstract void kontrollo(MouseEvent e);
}
