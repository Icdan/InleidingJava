package H13;

import java.awt.*;
import java.applet.*;

public class Opdracht2 extends Applet {

    public void init () {
        setSize(500, 500);
    }

    public void paint(Graphics g) {
        int width = 30;
        int height = 15;
        int x1 = 0, x2 = -15;
        int y1 = 0, y2 = 20;

        wall(g, x1, y1, x2, y2, width, height);
    }

    void wall(Graphics g, int x1, int y1, int x2, int y2, int width, int height) {
        setBackground(Color.lightGray);
        int rowAmount = 25;

        for (int row = 0; row < rowAmount; row += 2) {

            for (int teller = 0; teller < rowAmount; teller++) {
                g.setColor(Color.red);
                g.fillRect(x1, y1, width, height);
                x1 += 40;
            }
            x1 = 0;
            y1 += 40;
        }

        for (int row = 0; row < rowAmount; row += 2) {
            for (int teller = 0; teller < rowAmount; teller++) {
                g.fillRect(x2, y2, width, height);
                x2 += 40;
            }
            x2 = -15;
            y2 += 40;
        }
    }
}