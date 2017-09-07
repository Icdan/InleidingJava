import java.applet.*;
import java.awt.*;

public class H6Punt2 extends Applet {
    int a, b, c, d, uitkomsta, uitkomstb, uitkomstc;


    public void init() {
        a = 60;
        b = 60;
        c = 24;
        d = 365;
        uitkomsta = a * b;
        uitkomstb = uitkomsta * c;
        uitkomstc = uitkomstb * d;
    }

    public void paint(Graphics g){
        g.drawString("Er zitten " + uitkomsta + " seconden in een uur.", 20 ,20);
        g.drawString("Er zitten " + uitkomstb + " seconden in een dag.", 20 ,35);
        g.drawString("Er zitten " + uitkomstc + " seconden in een jaar.", 20 ,50);


    }

}
