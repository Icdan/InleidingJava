package H4;

import java.awt.*;
import java.applet.*;


public class H4Punt7 extends Applet {


    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawRoundRect(10, 10, 40, 40, 10, 10);
        g.drawOval(15, 15, 10, 10);
        g.drawOval(35, 15, 10, 10);
        g.drawOval(15, 35, 10, 10);
        g.drawOval(35, 35, 10, 10);

    }

}