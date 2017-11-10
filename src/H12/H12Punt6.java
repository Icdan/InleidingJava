package H12;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class H12Punt6 extends Applet {

    int[] nummers = {0, 0, 0, 1, 1, 1, 2, 2, 3, 4, 5, 6, 6, 6, 7, 8, 8, 9, 9, 9, 9, 10, 10};
    TextField textField;
    Button button = new Button("OK");
    String s = "";
    int teller;

    public void init() {
        setSize(400, 400);

        textField = new TextField(10);
        add(textField);

        button = new Button("Ok");
        buttonListener Ok = new buttonListener();
        button.addActionListener(Ok);
        add(button);

        teller = 0;
    }

    public void paint(Graphics g) {
        g.drawString("" + s, 75, 50);
    }

    class buttonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int gezocht = Integer.parseInt(textField.getText());
            for (int i = 0; i < nummers.length; i++) {
                if (nummers[i] == gezocht) {
                    teller++;
                }
            }
            if (teller > 0) {
                s = "De waarde is " + gezocht + " en is "+ teller + " keer gevonden.";
            } else {
                s = "De waarde is niet gevonden.";
            }
            teller = 0;
            textField.setText("");
            repaint();
        }
    }

}
