package H11;

import java.awt.event.*;
import java.awt.*;
import java.applet.*;

public class H11Praktijk2 extends Applet{
    int x, y, teller, getal;
    Button okKnop;

    public void init(){
        setSize(500,500);

        okKnop = new Button("Ok");
        OkListener Ok = new OkListener();
        okKnop.addActionListener(Ok);
        add(okKnop);
    }


    public void paint(Graphics g){
        x = 30;
        y = 30;


    if(getal <= 10){
        for(teller = 1;teller < 11; teller++) {
            y += 20;
            g.drawString(teller + " x " + getal + " = " + getal * teller, x, y);
        }
        }
    }

    public class OkListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            getal++;
            repaint();
        }
    }
}
