import java.awt.*;
import java.awt.event.MouseEvent;

public class Vetura implements Figura{
    Figura objektet[] = new Figura[5];
    public Vetura(){
        objektet[0] = new Rrota(30,50);
        objektet[1] = new Rrota(30, 150);
        objektet[2] = new Auspuh(30,220);
        objektet[3] = new Dritaret(300,100);
        objektet[4] = new Trupi(200,250);

    }
    @Override
    public void vizato(Graphics g) {
        for (int i = 0; i < objektet.length; i++) {
            objektet[i].vizato(g);
        }
    }

    @Override
    public void kontrollo(MouseEvent e) {
        for (int i = 0; i < objektet.length; i++) {
            objektet[i].kontrollo(e);
        }
    }
}
