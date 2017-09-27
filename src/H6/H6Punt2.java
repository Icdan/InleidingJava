package H6;

import java.applet.*;
import java.awt.*;

public class H6Punt2 extends Applet {
    int uur, dag, jaar;


    public void init() {
        uur = 60 * 60;
        dag = uur * 24;
        jaar = dag * 365;

    }

    public void paint(Graphics g){
        g.drawString("Er zitten " + uur + " seconden in een uur.", 20 ,20);
        g.drawString("Er zitten " + dag + " seconden in een dag.", 20 ,35);
        g.drawString("Er zitten " + jaar + " seconden in een jaar.", 20 ,50);


    }

}
