package H13;

import java.awt.*;
import java.applet.*;

public class Praktijk extends Applet {

    Color brown = new Color(139, 69, 19);

    public void init (){
        setSize(500, 500);
    }

    public void paint(Graphics g) {
        int x = 25;
        int y = 25;
        int width = 50;
        int height = 50;

        forest(g, x, y, width, height);
    }

    void forest(Graphics g, int x, int y, int width, int height) {
        for (int row = 0; row < 6; row++) {

            if ( row == 0 || row == 2 || row == 4 ) {

                for (int teller = 0; teller < 5; teller++) {
                    g.setColor(Color.green);
                    g.fillOval(x, y, width, height);
                    g.setColor(brown);
                    g.fillRect(x + 20, y + 50, width - 40, height - 15);
                    x += 75;
                }
                x = 35;
            } else {
                for (int teller = 0; teller < 5; teller++) {
                    g.setColor(Color.green);
                    g.fillOval(x + 25, y + 100, width, height);
                    g.setColor(brown);
                    g.fillRect(x + 45, y + 150, width - 40, height - 15);
                    x += 75;
                }
                x = 25;
                y += 200;

            }
        }
    }
}
