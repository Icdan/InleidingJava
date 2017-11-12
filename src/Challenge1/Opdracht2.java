package Challenge1;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Opdracht2 extends Applet {
    private int tijd, londen, tokyo, ontario, mcmurdo, x, y;
    private String error;
    private TextField tijdInvoer;

    public void init() {
        setSize(500, 500);

        Label uurLabel = new Label("Voor een uur in");
        tijdInvoer = new TextField("", 5);
        tijdInvoer.addActionListener(new ToonListener());
        add(uurLabel);
        add(tijdInvoer);

        Button buttonToon = new Button("Toon");
        ToonListener FIV = new ToonListener();
        buttonToon.addActionListener(FIV);
        add(buttonToon);

        error = "Error 404, number not found. Please fill in a valid time.";

        x = 30;
        y = 50;
    }

    public void paint(Graphics g) {

        if (tijd < 24) {

            g.drawString("Tijd in Londen, Engeland: " + londen + ":00", x, y + 20);
            g.drawString("Tijd in Tokyo, Japan: " + tokyo + ":00", x, y + 40);
            g.drawString("Tijd in Ontario, Canada: " + ontario + ":00", x, y + 60);
            g.drawString("Tijd in McMurdo Station, Antarctica: " + mcmurdo + ":00", x, y + 80);

        } else {
            g.drawString(error, x, y);
        }
    }

    public class ToonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String tijdString = tijdInvoer.getText();
            tijd = Integer.parseInt(tijdString);

            if (tijd < 23) {
                londen = tijd - 1;
                if (londen < 0) {
                    londen = londen + 24;
                }

                tokyo = tijd + 7;
                if (tokyo > 23) {
                    tokyo = tokyo - 24;
                }

                ontario = tijd - 6;
                if (ontario < 0) {
                    ontario = ontario + 24;
                }

                mcmurdo = tijd + 11;
                if (mcmurdo > 23) {
                    mcmurdo = mcmurdo - 24;
                }
            }
            repaint();
        }
    }
}
