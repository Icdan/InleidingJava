import java.applet.*;
import java.awt.*;

public class H4Praktijk extends Applet {


    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);

        //Lijn
        g.setColor(Color.black);
        g.drawLine(5, 5, 210, 5);
        g.drawString("Lijn", 100, 20);

        //Rechthoek
        g.drawRect(5, 40, 205, 150);
        g.drawString("Rechthoek", 85, 205);

        //Gevulde rechthoek met ovaal
        g.setColor(Color.magenta);
        g.fillRect(220,40,206,151);
        g.setColor(Color.black);
        g.drawOval(220, 40, 205, 150);
        g.drawString("Gevulde rechthoek met ovaal", 240, 205);

        //Taartpunt met ovaal eromheen
        g.setColor(Color.magenta);
        g.fillArc(475, 10, 250, 175, 0, 45);
        g.setColor(Color.black);
        g.drawArc(475, 10, 250, 175, 0, 360);
        g.drawString("Taartpunt met ovaal eromheen", 515, 205);

        //Afgeronde rechthoek
        g.drawRoundRect(5, 225, 205, 150, 30, 30);
        g.drawString("Afgeronde rechthoek", 55, 400);

        //Gevulde ovaal
        g.setColor(Color.magenta);
        g.fillOval(220, 225, 205, 150);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal", 280, 400);

        //Cirkel
        g.drawOval(540, 250,100, 100);
        g.setColor(Color.black);
        g.drawString("Cirkel", 575, 375);

    }
}