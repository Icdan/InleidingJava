package H11;

import java.applet.*;
import java.awt.*;

public class H11Punt9 extends Applet {


    public void paint(Graphics g) {
        int y = 50;
        int x = 50;
        for (int row = 0; row < 8; row++) {

            if (row == 0 || row == 2 || row == 4 || row == 6) {

                for (int kolom = 0; kolom < 8; kolom++) {
                    if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                        g.setColor(Color.black);
                        g.fillRect(x, y, 20, 20);
                    } else {
                        g.drawRect(x, y, 20, 20);
                    }
                    x += 20;
                }
            } else {
                for (int kolom = 0; kolom < 8; kolom++) {
                    if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                        g.drawRect(x, y, 20, 20);
                    } else {
                        g.setColor(Color.black);
                        g.fillRect(x, y, 20, 20);
                    }
                    x += 20;
                }
            }
            x = 50;
            y += 20;
        }
    }
}
