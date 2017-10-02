package H11;

import java.applet.* ;
import java.awt.*;

public class H11Punt8 extends Applet {

    public void paint(Graphics g){
        int x = 50;
        int y = 50;
        int teller;



        for(teller = 0; teller < 100; teller++){
            x+=5;
            y+=5;
            g.drawOval(10, 10, x, y);
        }
    }
}
