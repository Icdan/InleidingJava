import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class H10Punt2 extends Applet {
    TextField field1, field2;
    double getal1, getal2;
    Button Button;
    String invoerString1, invoerString2, uitkomst1, uitkomst2;
    Label label;

    public void init() {

        uitkomst1 = "";
        uitkomst2 = "";

        label = new Label("Voer getallen in en klik op de knop om te laten zien welk getal het hoogst en welk getal het laagst is");
        add(label);


        field1 = new TextField("", 20);
        field1.addActionListener(new Field1Listener());
        add(field1);

        field2 = new TextField("", 20);
        field2.addActionListener(new Field2Listener());
        add(field2);

        Button = new Button("Ok");
        Button.addActionListener(new ButtonListener());
        add(Button);


    }

    public void paint(Graphics g){
        g.drawString(uitkomst1, 50, 80);
        g.drawString(uitkomst2, 50, 100);

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
                uitkomst1 = "" + getal1 + " is het hoogst";
                uitkomst2 = "" + getal2 + " is het laagst";
            }

            else  {
                uitkomst1 = "" + getal2 + " is het hoogst";
                uitkomst2 = "" + getal1 + " is het laagst";
            }
            repaint();
        }
    }

}
