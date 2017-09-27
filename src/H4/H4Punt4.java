package H4;

import java.awt.*;
import java.applet.*;


public class H4Punt4 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawRect(80, 30, 110, 120);
        // Valerie
        g.setColor(new Color(188,22, 38));
        g.drawString("Valerie", 25, 40);
        g.fillRect(90, 110, 30, 40);
        // Jeroen
        g.setColor(new Color(154,46, 254));
        g.drawString("Jeroen", 25, 60);
        g.fillRect(120, 50, 30, 100);
        // Hans
        g.setColor(Color.blue);
        g.drawString("Hans", 25, 80);
        g.fillRect(150, 70, 30, 80);

        //Verdelingen
        g.setColor(Color.black);
        g.drawLine(80, 130, 190, 130);
        g.drawString("20 KG", 195, 135);
        g.drawLine(80, 110, 190, 110);
        g.drawString("40 KG", 195, 115);
        g.drawLine(80, 90, 190, 90);
        g.drawString("60 KG", 195, 95);
        g.drawLine(80, 70, 190, 70);
        g.drawString("80 KG", 195, 75);
        g.drawLine(80, 50, 190, 50);
        g.drawString("100 KG", 195, 55);
    }
}