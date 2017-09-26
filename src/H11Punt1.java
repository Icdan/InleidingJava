import java.applet.*;
import java.awt.*;

public class H11Punt1 extends Applet {

    public void init(){

    }

    public void paint(Graphics g){
        int line;
        int x = 0;

        for(line = 20; line < 30; line++) {
            x += 20;
            g.drawLine(x, 10, x, 100);
        }
    }
}
