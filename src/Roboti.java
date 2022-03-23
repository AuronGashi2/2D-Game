import java.awt.*;
import java.awt.event.MouseEvent;

public class Roboti implements Figura{
    Figura objektet[] = new Figura[6];
    public Roboti(){
        objektet[0] = new Koka(20,10);
        objektet[1] = new TrupiR(30,90);
        objektet[2] = new Kemba(30,280);
        objektet[3] = new Kemba(80,280);
        objektet[4] = new DoraM(150,400);
        objektet[5] = new DoraD(250,400);
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
