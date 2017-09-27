package H11;

import java.applet.*;
import java.awt.*;

public class H11Punt4 extends Applet {
    int teller1, tafel3;

    public void init(){
        teller1 = 1;
        tafel3 = 3;

        }

    public void paint(Graphics g){
        int y = 50;
        for(teller1 = 1; teller1 <= 10; tafel3*=3) {

            tafel3 = teller1 * 3;
            teller1++;

            y += 20;
            g.drawString("" + tafel3, 20, y);

        }
    }
}
