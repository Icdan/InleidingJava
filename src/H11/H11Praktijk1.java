package H11;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class H11Praktijk1 extends Applet {
    Button okKnop;
    TextField textfield;
    int teller, getal, x, y;
    Label label;

    public void init(){
        setSize(500,500);

        textfield = new TextField("", 20);
        label = new Label("Type hier uw getal");
        textfield.addActionListener(new OkListener());
        add(label);
        add(textfield);

        okKnop = new Button("Ok");
        OkListener Ok = new OkListener();
        okKnop.addActionListener(Ok);
        add(okKnop);

    }

    public void paint(Graphics g){
        x = 50;
        y = 50;

        if (getal > 0) {

            for (teller = 1; teller < 21; teller++) {
                y += 20;
                g.drawString(teller + " x " + getal + " = " + teller * getal, x, y);

            }
        }

    }

    public class OkListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            getal = Integer.parseInt(textfield.getText());
            textfield.setText("");
            repaint();
        }
    }
}