package H8;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class H8Punt2 extends Applet {
    Button Button1;
    Button Button2;
    Button Button3;
    Button Button4;
    int a, b, c, d, e;


    public void init (){
        Button1 = new Button("M");
        Button1Listener B1l = new Button1Listener();
        Button1.addActionListener(B1l);
        add(Button1);

        Button2 = new Button("V");
        Button2Listener B2l = new Button2Listener();
        Button2.addActionListener(B2l);
        add(Button2);

        Button3 = new Button("PML");
        Button3Listener B3l = new Button3Listener();
        Button3.addActionListener(B3l);
        add(Button3);

        Button4 = new Button("PVL");
        Button4Listener B4l = new Button4Listener();
        Button4.addActionListener(B4l);
        add(Button4);

        a = 0;
        b = 0;
        c = 0;
        d = 0;




    }

    public void paint (Graphics g) {
        g.drawString("Aantal mannen: " + a, 20, 50);
        g.drawString("Aantal vrouwen: " + b, 20, 65);
        g.drawString("Aantal potentiele mannelijke leerlingen: " + c, 20, 80);
        g.drawString("Aantal potentiele vrouwelijke leerlinen: " + d, 20, 95);
        g.drawString("Totaal: " + e, 50, 150);


    }

    class Button1Listener implements ActionListener {
        public void actionPerformed(ActionEvent j) {
            a++;
            e+=1;
            repaint();
        }
    }

    class Button2Listener implements ActionListener {
        public void actionPerformed(ActionEvent f) {
            b++;
            e+=1;
            repaint();
        }
    }

    class Button3Listener implements ActionListener {
        public void actionPerformed(ActionEvent h) {
            a++;
            c++;
            e+=2;
            repaint();
        }
    }

    class Button4Listener implements ActionListener {
        public void actionPerformed(ActionEvent i) {
            b++;
            d++;
            e+=2;
            repaint();
        }
    }

}