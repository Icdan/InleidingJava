import java.applet.*;
import java.awt.*;
import java.awt.event.*;


public class H8Punt3 extends Applet {
    Button ButtonOk;
    Label label;
    TextField field;
    Double  a, b, c, d;





    public void init (){
        ButtonOk = new Button("Ok");
        ButtonOkListener BOk = new ButtonOkListener();
        ButtonOk.addActionListener(BOk);
        add(ButtonOk);

        field = new TextField("", 20);
        label = new Label("Type een getal");
        field.addActionListener(new fieldListener());
        add(label);
        add(field);

        b = 1.21;
        d = c * 1;
    }

    public void paint(Graphics g){
        g.drawString("Bedrag met BTW is " + d, 50, 75);

    }



    class fieldListener implements ActionListener {
        public void actionPerformed(ActionEvent z){
            a = Double.parseDouble(field.getText());
            repaint();
        }
    }
    class ButtonOkListener implements ActionListener {
        public void actionPerformed(ActionEvent y) {
            c = a * 1.21;

            repaint();
        }
    }
}
