package H11;

import java.awt.*;
import java.applet.*;

public class H11Punt5 extends Applet {

        public void paint(Graphics g){
            int y = 10;
            int x = 10;
            int teller;



            for(teller = 0; teller < 5; teller++){
                y+=50;
                x+=50;
                g.drawRect(x, y, 50, 50);
            }

        }
}
