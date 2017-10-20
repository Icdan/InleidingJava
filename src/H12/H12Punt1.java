package H12;

import java.applet.*;
import java.awt.*;


public class H12Punt1 extends Applet {

    int[] getal;
    double getal2;
    double gemiddelde;

    public void init(){
        getal = new int[10];

        for (int teller = 0; teller < 10; teller++){
            getal[teller] = 3 * teller + 1;
        }
    }

    public void paint(Graphics g){
        for (int teller =0; teller < getal.length; teller++) {
            getal2 += getal[teller];
            gemiddelde = getal2 / 10;
            g.drawString("" + getal[teller], 50, 20 * teller + 20);
        }
        g.drawString("Het gemiddelde is: " + gemiddelde, 50, 240);

    }

}
