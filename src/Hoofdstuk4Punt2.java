import java.awt.*;
import java.applet.*;

// Plus opdracht 4.3
public class Hoofdstuk4Punt2 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        //House
        g.drawRect(50, 100, 100, 150);
        g.drawPolygon(new int[] {50, 100, 150}, new int[] {100, 10, 100}, 3);
        // Window
        g.drawRect(55, 105, 20, 20);
        g.drawRect(75, 125, 20, 20);
        g.drawRect(55, 125, 20, 20);
        g.drawRect(75, 105, 20, 20);
        // Window 2
        g.drawRect(60, 200, 45, 30);
        // Door
        g.drawRect(115, 210, 20, 40);
        // Flag
        g.drawLine(140, 220, 170, 180 );
        g.setColor(Color.red);
        g.fillRect(170, 180, 40, 10);
        g.setColor(Color.white);
        g.drawRect(170, 190, 40, 10);
        g.setColor(Color.blue);
        g.fillRect(170, 200, 40, 10);

    }
}