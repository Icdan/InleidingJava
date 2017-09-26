import java.applet.*;
import java.awt.*;

public class H11Punt2 extends Applet {

    public void init(){

    }

    public void paint(Graphics g){
        int count;
        int y = 0;

        for(count = 20; count > 10; count--  ) {
            y += 20;
            g.drawString("" + count, 30, y);
        }
    }
}
