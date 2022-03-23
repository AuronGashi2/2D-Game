import java.awt.*;
import java.awt.event.MouseEvent;

public class Pema implements Figura{
    Figura objektet[] = new Figura[12];
    public Pema(){
        objektet[0] = new Trungu(30,50);
        objektet[1] = new Kurora(300,300);
        objektet[2] = new Portokalli(30,400);
        objektet[3] = new Portokalli(30,450);
        objektet[4] = new Portokalli(30,500);
        objektet[5] = new Portokalli(30,550);
        objektet[6] = new Portokalli(30,600);
        objektet[7] = new Portokalli(70,400);
        objektet[8] = new Portokalli(70,450);
        objektet[9] = new Portokalli(70,500);
        objektet[10] = new Portokalli(70,550);
        objektet[11] = new Portokalli(70,600);


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
