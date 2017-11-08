package H12;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class H12Punt5 extends Applet {
    TextField textField;
    int[] getallen = {5, 12, 23, 34, 45, 56, 67, 78, 89, 910};
    int indexPositie;
    String welOfNiet;
    Button button;
    boolean gevonden;

    public void init() {
        setSize(500, 500);

        indexPositie = -1;

        welOfNiet = "?";

        textField = new TextField(10);
        add(textField);

        button = new Button("Ok");
        buttonListener Ok = new buttonListener();
        button.addActionListener(Ok);
        add(button);

        gevonden = false;
    }

    public class buttonListener implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            gevonden = false;
            int input = Integer.parseInt(textField.getText());
            for (int teller = 0; teller < getallen.length ; teller++) {
                System.out.println("Teller is: " + teller);
                if (input == getallen[teller]) {
                    gevonden = true;
                    indexPositie = teller;
                    break;
                }
            }
            if (gevonden) {
                welOfNiet = "wel";
            } else {
                welOfNiet = "niet";
            }
            repaint();
        }
    }

    public void paint (Graphics g){
        if (indexPositie != -1) {
            if (gevonden) {
                g.drawString("De waarde is " + welOfNiet + " gevonden", 20, 50);
                g.drawString("Index positie: " + indexPositie, 20, 70);
            }
            else {
                g.drawString("De waarde is " + welOfNiet + " gevonden", 20, 50);
            }
        }
    }
}
