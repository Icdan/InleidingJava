import java.applet.*;
import java.awt.*;

public class H6Punt3 extends Applet {
    int a, b, c;

    public void init() {
        a = 2147483647;
        b = 1;
        c = a + b;

    }

    public void paint(Graphics g){
        g.setColor(Color.black);
        g.drawString("" + c, 20, 20);
    }
}
