import java.applet.*;
import java.awt.*;

public class H6Praktijk extends Applet {
    double a, b, c, d, e;

    public void init() {
        a = 5.9;
        b = 6.3;
        c = 6.9;
        d = 3;
        e = a + b + c / e;
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawString("Het gemiddelde is: " + e, 20, 20);
    }

}
