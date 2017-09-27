package H4;

import java.awt.*;
import java.applet.*;


public class H4Punt6 extends Applet {


    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(new Color(206, 198, 198));
        g.fillRect(180,0, 20, 60);
        g.setColor(Color.black);
        g.fillRect(150, 60, 80, 180);
        g.setColor(Color.red);
        g.fillArc(170, 80, 40, 40, 90, 360);
        g.setColor(Color.yellow);
        g.fillArc(170, 130, 40, 40, 90, 360);
        g.setColor(Color.green);
        g.fillArc(170, 180, 40, 40, 90, 360);

    }

}