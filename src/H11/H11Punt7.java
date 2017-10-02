package H11;

import java.applet.* ;
import java.awt.*;

public class H11Punt7 extends Applet {

    public void paint(Graphics g){
        int x = 270;
        int y = 270;
        int teller;
        int enlarge = 10;


        for(teller = 0; teller < 50; teller++){
            x-=5;
            y-=5;
            enlarge += 10;
            g.drawOval(x, y, enlarge, enlarge);
        }
    }
}
