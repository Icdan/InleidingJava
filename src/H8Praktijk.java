import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class H8Praktijk extends Applet {
    Button ButtonAdditive;
    Button ButtonSubtract;
    Button ButtonMulti;
    Button ButtonDivide;
    TextField Number1;
    TextField Number2;
    double invoer1, invoer2, uitkomst;

    public void init() {
        Number1 = new TextField("", 10);
        add(Number1);

        Number2 = new TextField("", 10);
        add(Number2);

        ButtonAdditive = new Button("+");
            ButtonAListener Bal = new ButtonAListener();
            ButtonAdditive.addActionListener(Bal);
            add(ButtonAdditive);

        ButtonSubtract = new Button("-");
            ButtonSListener Bsl = new ButtonSListener();
            ButtonSubtract.addActionListener(Bsl);
            add(ButtonSubtract);

        ButtonMulti = new Button("*");
            ButtonMListener Bml = new ButtonMListener();
            ButtonMulti.addActionListener(Bml);
            add(ButtonMulti);

        ButtonDivide = new Button("/");
            ButtonDListener Bdl = new ButtonDListener();
            ButtonDivide.addActionListener(Bdl);
            add(ButtonDivide);


    }

    public void paint(Graphics g){

        }

    class ButtonAListener implements ActionListener {
        public void actionPerformed(ActionEvent w) {
            String invoerString1 = Number1.getText();
            invoer1 = Double.parseDouble( invoerString1 );
            String invoerString2 = Number2.getText();
            invoer2 = Double.parseDouble( invoerString2 );
            uitkomst = invoer1 + invoer2;
            Number1.setText("" + uitkomst);
            Number2.setText("");
            repaint();

        }
    }

    class ButtonSListener implements ActionListener {
        public void actionPerformed(ActionEvent w) {
            String invoerString1 = Number1.getText();
            invoer1 = Double.parseDouble( invoerString1 );
            String invoerString2 = Number2.getText();
            invoer2 = Double.parseDouble( invoerString2 );
            uitkomst = invoer1 - invoer2;
            Number1.setText("" + uitkomst);
            Number2.setText("");
            repaint();

        }
    }

    class ButtonMListener implements ActionListener {
        public void actionPerformed(ActionEvent w) {
            String invoerString1 = Number1.getText();
            invoer1 = Double.parseDouble( invoerString1 );
            String invoerString2 = Number2.getText();
            invoer2 = Double.parseDouble( invoerString2 );
            uitkomst = invoer1 * invoer2;
            Number1.setText("" + uitkomst);
            Number2.setText("");
            repaint();

        }
    }

    class ButtonDListener implements ActionListener {
        public void actionPerformed(ActionEvent y) {
            String invoerString1 = Number1.getText();
            invoer1 = Double.parseDouble( invoerString1 );
            String invoerString2 = Number2.getText();
            invoer2 = Double.parseDouble( invoerString2 );
            uitkomst = invoer1 / invoer2;
            Number1.setText("" + uitkomst);
            Number2.setText("");
            repaint();

        }
    }
}
