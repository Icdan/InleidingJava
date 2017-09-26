import java.applet.*;
import java.awt.*;

public class H11Punt3 extends Applet {

    public void init(){

    }

    public void paint(Graphics g){
        int count;
        int x = 0, n1 = 0, n2 = 1;

        for(count = 0; n1 < 100; ++count) {
            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
            x += 20;
            g.drawString("" + n1, x, 30);
        }
    }
}
