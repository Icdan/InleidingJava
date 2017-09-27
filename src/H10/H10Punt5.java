package H10;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class H10Punt5 extends Applet {

    TextField field1, field2, field3;
    double cijfer1, cijfer2, cijfer3, cijfer4;
    String resultaat1, resultaat2, resultaat3, uitkomst;
    Button buttonOk;

    public void init() {
        uitkomst = "";

        buttonOk = new Button("Ok");
        FieldInvoerListener FIV = new FieldInvoerListener();
        buttonOk.addActionListener(FIV);
        add(buttonOk);

        field1 = new TextField("", 5);
        field1.addActionListener(new FieldInvoerListener());
        add(field1);

        field2 = new TextField("", 5);
        field2.addActionListener(new FieldInvoerListener());
        add(field2);

        field3 = new TextField("", 5);
        field3.addActionListener(new FieldInvoerListener());
        add(field3);

    }

    public void paint(Graphics g){
        g.drawString("" + uitkomst, 60, 40);
    }

    public class FieldInvoerListener implements ActionListener {
        public void actionPerformed (ActionEvent e){
            resultaat1 = field1.getText();
            cijfer1 = Double.parseDouble(resultaat1);

            resultaat2 = field2.getText();
            cijfer2 = Double.parseDouble(resultaat2);

            resultaat3 = field3.getText();
            cijfer3 = Double.parseDouble(resultaat3);

            cijfer4 = (cijfer1 + cijfer2 + cijfer3) / 3;

            if ( cijfer4 > 5.5) {

                uitkomst = "Uw gemiddelde is: " + cijfer4 + ". Dit is een voldoende.";

            }

            else  {

                uitkomst = "Uw gemiddelde is: " + cijfer4 + ". Dit is geen voldoende.";


            }

            repaint ();
        }
    }

}
