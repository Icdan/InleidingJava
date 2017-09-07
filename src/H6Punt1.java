import java.applet.*;
import java.awt.*;

public class H6Punt1 extends Applet {
    int a, b;
    float uitkomst;



    public void init() {
        a = 113;
        b = 4;
        uitkomst = (float) 113 / 4;
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawString("Jan krijgt " + uitkomst, 20, 20);
        g.drawString("Ali krijgt " + uitkomst, 20, 35);
        g.drawString("Jeanette krijgt " + uitkomst, 20, 50);
        g.drawString("Liam krijgt " + uitkomst, 20, 65);
    }
}