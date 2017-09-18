import java.applet.*;
import java.awt.*;
import java.awt.event.*;


public class H8Punt3 extends Applet {
    Button ButtonOk;
    Label label;
    TextField field;
    double  uitkomst;





    public void init (){
        ButtonOk = new Button("Ok");

        ButtonOk.addActionListener(new Listener());
        add(ButtonOk);

        field = new TextField("", 20);
        label = new Label("Type uw getal");
        field.addActionListener(new Listener());
        add(label);
        add(field);



    }

    public void paint(Graphics g){

        g.drawString("Bedrag met BTW is " + uitkomst, 50, 75);

    }



    class Listener implements ActionListener {
        public void actionPerformed(ActionEvent z){
            String invoerString = field.getText();
            double invoer = Double.parseDouble( invoerString );
            uitkomst = invoer * 1.21;
            repaint();
        }
    }

}
