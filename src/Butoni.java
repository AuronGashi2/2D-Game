import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Butoni extends JButton implements ActionListener {
    Loja l;
    public Butoni(Loja l)
    {
        super("Ndrro Imazhin");
        this.l = l;
        addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        l.filloLojen();
    }
}
