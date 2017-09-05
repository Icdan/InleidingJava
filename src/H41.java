//Voorbeeld 4.1

import java.awt.*;
import java.applet.*;

public class H41 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawPolygon(new int[] {20, 100, 180}, new int[] {150, 10, 150}, 3);

    }
}