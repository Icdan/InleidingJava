package H11;

import java.applet.* ;
import java.awt.*;

public class H11Punt6 extends Applet {

    public void paint(Graphics g){
        int x = 50;
        int y = 50;
        int teller;
        int enlarge = 10;


        for(teller = 0; teller < 5; teller++){
            x-=5;
            y-=5;
            enlarge += 10;
            g.drawOval(x, y, enlarge, enlarge);
        }
    }
}
