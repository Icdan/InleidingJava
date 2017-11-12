package Challenge1;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Opdracht1 extends Applet {
    TextField fieldv, fieldj, fieldh;
    int intVal1, intVal2, intJer1, intJer2, intHans1, intHans2;
    String stringv, stringj, stringh;
    Button buttonToon;
    Label labelv, labelj, labelh;

    public void init() {
        setSize(500, 500);

        fieldv = new TextField("", 5);
        labelv = new Label("Valerie");
        fieldv.addActionListener(new KnopListener());
        add(labelv);
        add(fieldv);

        fieldj = new TextField("", 5);
        labelj = new Label("Jeroen");
        fieldj.addActionListener(new KnopListener());
        add(labelj);
        add(fieldj);

        fieldh = new TextField("", 5);
        labelh = new Label("Hans");
        fieldh.addActionListener(new KnopListener());
        add(labelh);
        add(fieldh);

        buttonToon = new Button("Toon");
        KnopListener FIV = new KnopListener();
        buttonToon.addActionListener(FIV);
        add(buttonToon);

    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);


        // Valerie
        g.drawString("Valerie", 75, 330);
        g.setColor(Color.red);
        g.fillRect(75, intVal1, 50, intVal2);

        // Jeroen
        g.setColor(Color.black);
        g.drawString("Jeroen", 175, 330);
        g.setColor(Color.red);
        g.fillRect(175, intJer1, 50, intJer2);

        // Hans
        g.setColor(Color.black);
        g.drawString("Hans", 275, 330);
        g.setColor(Color.red);
        g.fillRect(275, intHans1, 50, intHans2);

        //Grafiek
        g.setColor(Color.black);
        g.drawLine(50, 50, 50, 310);
        g.drawLine(50, 310, 350, 310);
        g.drawString("20", 20, 275);
        g.drawLine(50, 270, 55, 270);
        g.drawString("40", 20, 230);
        g.drawLine(50, 230, 55, 230);
        g.drawString("60", 20, 190);
        g.drawLine(50, 190, 55, 190);
        g.drawString("80", 20, 150);
        g.drawLine(50, 150, 55, 150);
        g.drawString("100", 20, 110);
        g.drawLine(50, 110, 55, 110);
        g.drawString("120", 20, 70);
        g.drawLine(50, 70, 55, 70);


    }

    public class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            stringv = fieldv.getText();
            intVal2 = Integer.parseInt(stringv);
            fieldv.setText("");
            intVal2 = intVal2 * 2;
            intVal1 = 310 - intVal2;

            stringj = fieldj.getText();
            intJer2 = Integer.parseInt(stringj);
            fieldj.setText("");
            intJer2 = intJer2 * 2;
            intJer1 = 310 - intJer2;

            stringh = fieldh.getText();
            intHans2 = Integer.parseInt(stringh);
            fieldh.setText("");
            intHans2 = intHans2 * 2;
            intHans1 = 310 - intHans2;
            repaint();
        }

    }
}