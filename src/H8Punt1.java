import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class H8Punt1 extends Applet {
    Button ButtonA;
    Button ButtonB;
    String schermtekst;
    TextField tekstvak;
    Label label;

    public void init () {
        ButtonA = new Button( "Click on me");
            ButtonAListener BAl = new ButtonAListener();
            ButtonA.addActionListener(BAl);
            add(ButtonA);

        ButtonB = new Button( "Reset");
            ButtonBListener BBl = new ButtonBListener();
            ButtonB.addActionListener(BBl);
            add(ButtonB);

        schermtekst = "Does this work?";

        tekstvak = new TextField("", 40);
            add(tekstvak);
        label = new Label("");
            add(label);
            add(tekstvak);
    }

    public void paint (Graphics g) {
        g.drawString(schermtekst, 150, 75);

    }

    class ButtonAListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("Your button works");
            repaint();
        }
    }

    class ButtonBListener implements ActionListener {
        public void actionPerformed(ActionEvent f) {
            tekstvak.setText("");
            repaint();
            }


    }

}