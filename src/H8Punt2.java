import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class H8Punt2 extends Applet {
    Button Button1;
    Button Button2;
    Button Button3;
    Button Button4;
    Button Button5;
    int a, a2, b, b2, c, c2, d, d2, e;


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

        Button5 = new Button("Totaal");
            Button5Listener B5l = new Button5Listener();
            Button5.addActionListener(B5l);
            add(Button5);

        a = 0;
        b = 0;
        c = 0;
        d = 0;
        e = a + b + c + d;

    }

    public void paint (Graphics g) {
        g.drawString("Aantal mannen: " + a, 20, 50);
        g.drawString("Aantal vrouwen: " + b, 20, 65);
        g.drawString("Aantal potentiele mannelijke leerlingen: " + c, 20, 80);
        g.drawString("Aantal potentiele vrouwelijke leerlinen: " + d, 20, 95);
        g.drawString("Totaal: " + e, 20, 110);

    }

    class Button1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            a++;
            repaint();
        }
    }

    class Button2Listener implements ActionListener {
        public void actionPerformed(ActionEvent f) {
            b++;
            repaint();
        }
    }

    class Button3Listener implements ActionListener {
        public void actionPerformed(ActionEvent h) {
            c++;
            repaint();
        }
    }

    class Button4Listener implements ActionListener {
        public void actionPerformed(ActionEvent i) {
            d++;
            repaint();
        }
    }

    class Button5Listener implements ActionListener {
        public void actionPerformed(ActionEvent j) {

            repaint();
        }
    }

}
