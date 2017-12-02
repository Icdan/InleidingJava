package H14;

import java.applet.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;

public class Opdracht2 extends Applet {
    String housearray[] = {"Harten", "Klaver", "Schoppen", "Ruiten"};
    String cardsarray[] = {"twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien", "boer", "dame", "heer", "aas"};
    String deck[] = new String[52];
    String speler1[] = new String[13];
    String speler2[] = new String[13];
    String speler3[] = new String[13];
    String speler4[] = new String[13];
    Button deal;
    Boolean geklikt = false;
    AudioClip sound;
    URL path;

    public void init(){
        setSize(500, 500);

        deal = new Button("Deal cards");
        DCardListener dCards = new DCardListener();
        deal.addActionListener(dCards);
        add(deal);

        path = Opdracht2.class.getResource("scream.wav");
        sound = getAudioClip(path, "");
    }

    public void paint(Graphics g){
        if (geklikt) {
            g.drawLine(0, 55, 400, 55);
            g.drawString("Speler 1", 10, 50);
            g.drawString("Speler 2", 110, 50);
            g.drawString("Speler 3", 210, 50);
            g.drawString("Speler 4", 310, 50);
            for (int i = 0; i < 13; i++) {
                g.drawString("" + speler1[i], 10, 90 + (i * 20));
                g.drawString("" + speler2[i], 110, 90 + (i * 20));
                g.drawString("" + speler3[i], 210, 90 + (i * 20));
                g.drawString("" + speler4[i], 310, 90 + (i * 20));
            }
        } else {
            g.drawString("Deel de kaarten", 50, 50);
        }

    }

    public class DCardListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            geklikt = true;

            deck = new String[52];

            int index = 0;

            for (int i = 0; i < housearray.length; i++) {
                String house = housearray[i];
                for (int j = 0; j < cardsarray.length; j++) {
                    String card = cardsarray[j];
                    deck[index] = house + " " + card;
                    index++;
                }
            }
            for (int i = 0; i < 13; i++) {
                speler1[i] = deelKaart();
                speler2[i] = deelKaart();
                speler3[i] = deelKaart();
                speler4[i] = deelKaart();
            }
            sound.play();
            repaint();
        }
    }

    private String deelKaart() {
        int random = new Random().nextInt(deck.length);
        String kaart = deck[random];

        //vervang de inhoud van deck
        String[] hulpLijst = new String[deck.length - 1];
        int hulpindex = 0;
        for (int i = 0; i < deck.length; i++) {
            if (i != random) {
                hulpLijst[hulpindex] = deck[i];
                hulpindex++;
            }
        }
        deck = hulpLijst;
        return kaart;
    }

}