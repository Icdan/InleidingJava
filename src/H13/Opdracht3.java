package H13;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht3 extends Applet {
    Button redBrick;
    Button concreteBrick;
    boolean showRedBricks, showConBricks;

    public void init() {
        setSize(500, 500);

        redBrick = new Button("Red bricks");
        redBrickListener redBrickButton = new redBrickListener();
        redBrick.addActionListener(redBrickButton);
        add(redBrick);

        concreteBrick = new Button("Concrete bricks");
        conBrickListener conBrickButton = new conBrickListener();
        concreteBrick.addActionListener(conBrickButton);
        add(concreteBrick);

        showRedBricks = false;
        showConBricks = false;
    }


    public void paint(Graphics g) {
        if (showRedBricks) {

            int width = 30;
            int height = 15;
            int x1 = 0, x2 = -15;
            int y1 = 40, y2 = y1 + 20;

            redBrickWall(g, x1, y1, x2, y2, width, height);

        } else if (showConBricks) {
            int width = 60;
            int height = 30;
            int x1 = 0, x2 = -30;
            int y1 = 40, y2 = y1 + 40;

            conBrickWall(g, x1, y1, x2, y2, width, height);

        } else {
            g.drawString("Klik op een knop", 25, 50);
        }
    }

    void redBrickWall(Graphics g, int x1, int y1, int x2, int y2, int width, int height) {
        setBackground(Color.lightGray);
        int rowAmount = 25;

        for (int row = 0; row < rowAmount; row += 2) {

            for (int teller = 0; teller < rowAmount; teller++) {
                g.setColor(Color.red);
                g.fillRect(x1, y1, width, height);
                x1 += 40;
            }
            x1 = 0;
            y1 += 40;
        }

        for (int row = 0; row < rowAmount; row += 2) {
            for (int teller = 0; teller < rowAmount; teller++) {
                g.fillRect(x2, y2, width, height);
                x2 += 40;
            }
            y2 += 40;
            x2 = -15;
        }
    }

    void conBrickWall(Graphics g, int x1, int y1, int x2, int y2, int width, int height) {
        setBackground(Color.white);
        int rowAmount = 25;

        for (int row = 0; row < rowAmount; row += 2) {

            for (int teller = 0; teller < rowAmount; teller++) {
                g.setColor(Color.gray);
                g.fillRect(x1, y1, width, height);
                x1 += 70;
            }
            x1 = 0;
            y1 += 80;
        }

        for (int row = 0; row < rowAmount; row += 2) {
            for (int teller = 0; teller < rowAmount; teller++) {
                g.fillRect(x2, y2, width, height);
                x2 += 70;
            }
            x2 = -15;
            y2 += 80;
        }
    }

    public class redBrickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            showConBricks = false;
            showRedBricks = true;
            repaint();
        }
    }

    public class conBrickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            showRedBricks = false;
            showConBricks = true;
            repaint();
        }
    }
}