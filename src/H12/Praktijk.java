package H12;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Praktijk extends Applet {

    TextField naamTextField;
    TextField telefoonTexField;
    Button button;
    String[] namen;
    String[] nummers;
    int aantalGeklikt;
    final static int AANTAL_ELEMENTEN = 10;

    public void init() {
        naamTextField = new TextField(10);
        add(naamTextField);
        telefoonTexField = new TextField(10);
        add(telefoonTexField);

        button = new Button("Ok");
        buttonListener Ok = new buttonListener();
        button.addActionListener(Ok);
        add(button);

        namen = new String[AANTAL_ELEMENTEN];
        nummers = new String[AANTAL_ELEMENTEN];

        aantalGeklikt = 0;


    }

    public class buttonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            namen[aantalGeklikt] = naamTextField.getText();
            nummers[aantalGeklikt] = telefoonTexField.getText();
            aantalGeklikt++;
            if (aantalGeklikt == AANTAL_ELEMENTEN) {
                repaint();
            }
        }
    }

    public void paint(Graphics g) {
        if (aantalGeklikt != 0) {
            int x1 = 50;
            int x2 = 150;
            int y = 70;
            for (int i = 0; i < AANTAL_ELEMENTEN; i++) {
                g.drawString(namen[i], x1, y);
                g.drawString(nummers[i], x2, y);
                y += 20;
            } aantalGeklikt = 0;
        }
    }

}
