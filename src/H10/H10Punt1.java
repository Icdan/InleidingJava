package H10;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class H10Punt1 extends Applet {
    TextField field1, field2;
    double getal1, getal2;
    Button button;
    String invoerString1, invoerString2, uitkomst;

    public void init() {

        uitkomst = "";


        field1 = new TextField("", 20);
        field1.addActionListener(new Field1Listener());
        add(field1);

        field2 = new TextField("", 20);
        field2.addActionListener(new Field2Listener());
        add(field2);

        button = new Button("Klik hier om te zien welk getal het hoogst is");
        button.addActionListener(new ButtonListener());
        add(button);


    }

    public void paint(Graphics g){
        g.drawString(uitkomst, 50, 80);

    }

    public class Field1Listener implements ActionListener {
        public void actionPerformed(ActionEvent f) {

        }
    }

    public class Field2Listener implements ActionListener {
        public void actionPerformed(ActionEvent j) {

        }
    }

    public class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            invoerString1 = field1.getText();
            invoerString2 = field2.getText();
            getal1 = Double.parseDouble(invoerString1);
            getal2 = Double.parseDouble(invoerString2);

            if (getal1 > getal2) {
                uitkomst = "" + getal1 + " is het hoogst";
            }

            else  {
                uitkomst = "" + getal2 + " is het hoogst";
            }
            repaint();
        }
    }

}
