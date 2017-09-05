import java.awt.*;
import java.applet.*;

public class Hoofdstuk4Punt2 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        //House
        g.drawRect(50, 100, 100, 150);
        g.drawPolygon(new int[] {50, 100, 150}, new int[] {100, 10, 100}, 3);
        // Window
        g.drawRect(55, 105, 20, 20);
        g.drawRect(75, 125, 20, 20);
        g.drawRect(55, 125, 20, 20);
        g.drawRect(75, 105, 20, 20);
        // Door
        g.drawRect(115, 210, 20, 40);

    }
}