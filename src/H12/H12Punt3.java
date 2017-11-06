package H12;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class H12Punt3 extends Applet {

    TextField[] field;
    int[] getal;
    Button button;


    public void init(){
        setSize(500,500);
        getal = new int[5];

        field = new TextField[5];
        for (int teller = 0; teller < field.length; teller++){
            field[teller] = new TextField("", 5);
            add(field[teller]);
        }

        button = new Button("Ok");
        buttonListener Ok = new buttonListener();
        button.addActionListener(Ok);
        add(button);


    }
    

    public class buttonListener implements ActionListener {
        public void actionPerformed (ActionEvent e) {

            for (int teller = 0; teller < field.length; teller++) {
                String s = field[teller].getText();
                getal[teller] = Integer.parseInt(s);
            }

            Arrays.sort(getal);

            for (int teller = 0; teller < getal.length; teller++) {
                field[teller].setText(String.valueOf(getal[teller]));
            }
        }
    }
}
