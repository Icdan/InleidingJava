package H14;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Opdracht1 extends Applet {
    String housearray[] = {"Ruiten", "Klaver", "Schoppen", "Harten"};
    String cardsarray[] = {"twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien", "boer", "dame", "heer", "aas"};
    String house = "", cards = "";
    Button deal;

    public void init() {
        deal = new Button("Deal cards");
        dCardListener dCards = new dCardListener();
        deal.addActionListener(dCards);
        add(deal);
    }

    public void paint(Graphics g) {
        g.drawString(house + " " + cards, 25, 50);
    }

    public class dCardListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            house = housearray[(int) (Math.random() * housearray.length)];
            cards = cardsarray[(int) (Math.random() * cardsarray.length)];
            repaint();
        }
    }
}
