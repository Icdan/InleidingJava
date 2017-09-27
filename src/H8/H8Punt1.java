package H8;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class H8Punt1 extends Applet {
    Button ButtonA;
    Button ButtonB;
    String schermtekst;
    String vervangtekst;
    TextField tekstvak;
    Label label;


    public void init () {
        ButtonA = new Button( "Ok");
            ButtonAListener BAl = new ButtonAListener();
            ButtonA.addActionListener(BAl);
            add(ButtonA);

        ButtonB = new Button( "Reset");
            ButtonBListener BBl = new ButtonBListener();
            ButtonB.addActionListener(BBl);
            add(ButtonB);

        schermtekst = "Your text will appear here after you press Ok";

        tekstvak = new TextField("Type here", 40);
            add(tekstvak);
        label = new Label("");
        tekstvak.addActionListener( new TekstvakListener() );
            add(label);
            add(tekstvak);

        vervangtekst = "";



    }

    public void paint (Graphics g) {
        g.drawString(schermtekst, 50, 75);

    }

    class ButtonAListener implements ActionListener {
        public void actionPerformed(ActionEvent BAl) {
            vervangtekst = tekstvak.getText();
            repaint();
        }
    }

    class ButtonBListener implements ActionListener {
        public void actionPerformed(ActionEvent f) {
            tekstvak.setText("");
            repaint();
        }
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent i) {
            vervangtekst = tekstvak.getText();
            schermtekst = vervangtekst.replace("","");
            repaint();

        }
    }


}