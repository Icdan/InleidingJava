package H6;

import java.applet.*;
import java.awt.*;

public class H6Praktijk extends Applet {
    double a, b, c, d, e, f, h, i, l;

    public void init() {
        a = 5.9;
        b = 6.3;
        c = 6.9;
        d = 3;
        e = 10;
        f = (a + b + c) / d;
        h = f * e;
        i = (int) h;
        l = i / e;
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawString("Het gemiddelde is: " + l, 20, 20);

    }

}
