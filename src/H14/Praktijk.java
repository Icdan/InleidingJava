package H14;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import java.util.Random;

public class Praktijk extends Applet {
    Button play, start, reset;
    Image match, winsmiley, losesmiley;
    URL path;
    TextField field;
    Boolean booplay, boostart, booreset, onjuist, win, lose;
    Label label;
    int x, y, teller, getal, matchint, random;

    public void init() {
        setSize(1000, 500);

        field = new TextField("", 10);
        field.addActionListener(new PlayListener());
        label = new Label("Neem 1, 2 of 3 plaatjes weg");
        add(label);
        add(field);

        start = new Button("Start");
        start.addActionListener(new StartListener());
        add(start);

        play = new Button("Play");
        play.addActionListener(new PlayListener());
        add(play);

        reset = new Button("Reset");
        reset.addActionListener(new ResetListener());
        add(reset);

        path = Praktijk.class.getResource("/H14/img/");
        match = getImage(path, "img1.jpg");
        winsmiley = getImage(path, "happysmiley.png");
        losesmiley = getImage(path, "sadsmiley.png");

        booplay = false;
        boostart = false;
        booreset = false;
        onjuist = false;
        win = false;
        lose = false;

        play.setVisible(false);
        reset.setVisible(false);
        field.setVisible(false);
        label.setVisible(false);

        matchint = 23;
    }

    public void paint(Graphics g) {
        if (boostart || booreset) {
            x = 30;
            y = 50;

            for (teller = 0; teller < matchint; teller++) {
                if (teller == 4 || teller == 8 || teller == 12 || teller == 16 || teller == 20) {
                    y += 60;
                    x = 30;
                }
                g.drawImage(match, x, y, 50, 50, this);
                x += 60;
                g.drawString("Er zijn " + matchint + " plaatjes over", 30, 30);
            }
        }
        if (booplay) {
            if (onjuist) {
                g.drawString("De invoer is onjuist: kies tussen 1, 2 of 3", 300, 75);
            }
        }
        if (win) {
            g.drawImage(losesmiley, 250, 250, 100, 100, this);
            g.drawString("You win", 400, 300);
        }
        if (lose) {
            g.drawImage(winsmiley, 250, 250, 100, 100, this);
            g.drawString("You lose", 400, 300);
        }
    }

    public class StartListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            boostart = true;
            start.setVisible(false);
            play.setVisible(true);
            reset.setVisible(true);
            field.setVisible(true);
            label.setVisible(true);
            repaint();
        }
    }

    public class PlayListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            booplay = true;
            String invoer = field.getText();
            getal = Integer.parseInt(invoer);

            if (getal > 0 && getal < 4) {
                matchint -= getal;
                onjuist = false;

                // check gewonnen / verloren

                if (matchint <= 0) {
                    lose = true;
                }
                if (matchint == 1) {
                    win = true;
                }

                if (!lose  && !win) {
                    if (matchint == 22 || matchint == 18 || matchint == 14 || matchint == 10 || matchint == 6 || matchint == 2) {
                        matchint--;
                    } else if (matchint == 19 || matchint == 15 || matchint == 11 || matchint == 7 || matchint == 3) {
                        matchint -= 2;
                    } else if (matchint == 20 || matchint == 16 || matchint == 12 || matchint == 8 || matchint == 4) {
                        matchint -= 3;
                    } else if (matchint == 21 || matchint == 17 || matchint == 13 || matchint == 9 || matchint == 5) {
                        random = new Random().nextInt(3) + 1;
                        matchint -= random;
                    }
                }
            } else {
                onjuist = true;
            }
            field.setText("");
            repaint();
        }
    }

    public class ResetListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            field.setText("");
            matchint = 23;
            boostart = false;
            booplay = false;
            win = false;
            lose = false;
            play.setVisible(false);
            reset.setVisible(false);
            field.setVisible(false);
            label.setVisible(false);
            start.setVisible(true);
            repaint();
        }
    }
}
