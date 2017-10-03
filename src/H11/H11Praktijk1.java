package H11;

import java.applet.* ;
import java.awt.* ;
import java.awt.event.* ;

public class H11Praktijk1 extends Applet {
    Button okKnop;
    TextField textfield;
    int getal, teller, x, y;
    String invoerstring,  uitkomst;
    Label label;

    public void init (){
        okKnop = new Button("Ok");
        OkListener Ok = new OkListener();
        okKnop.addActionListener(Ok);
        add(okKnop);

        textfield = new TextField("", 20);
        label = new Label("Type uw getal");
        textfield.addActionListener(new OkListener());
        add(label);
        add(textfield);

        invoerstring = "";
        getal = 0;

    }

    public void paint(Graphics g){

        x = 50;
        y = 50;
    }
        if (getal>0){
            for (teller = 0; teller<10;teller++){
                y = y+20;

                g.drawString(teller + "x" + getal + "=" + getal*teller , x ,y);



    }

    public class OkListener implements ActionListener{
        public void actionPerformed(ActionEvent e){

            getal = Integer.parseInt(textfield.getText()));
            textfield.setText("");
            repaint();


             }  }


        }
    }

