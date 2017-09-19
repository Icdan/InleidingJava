import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class H10Punt3 extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;
    int dag;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type het maandnummer en druk op enter");
        tekstvak.addActionListener( new TekstvakListener() );
        tekst = "";
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 80 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            dag = Integer.parseInt( s);
            switch(dag) {
                case 1:
                    tekst = "De eerste maand is januari. Januari heeft 31 dagen.";
                    break;
                case 2:
                    tekst = "De tweede maand is februari. Februari heeft 28 dagen, behalve in schrikkeljaren. Dan heeft het 29 dagen.";
                    break;
                case 3:
                    tekst = "De derde maand is maart. Maart heeft 31 dagen.";
                    break;
                case 4:
                    tekst = "De vierde maand is april. April heeft 30 dagen.";
                    break;
                case 5:
                    tekst = "De vijfde maand is mei. Mei heeft 31 dagen.";
                    break;
                case 6:
                    tekst = "De zesde maand is juni. Juni heeft 30 dagen.";
                    break;
                case 7:
                    tekst = "De zevende maand is juli. Juli heeft 31 dagen.";
                    break;
                case 8:
                    tekst = "De achtste maand is augustus. Augustus heeft 31 dagen.";
                    break;
                case 9:
                    tekst = "De negende maand is september. September heeft 30 dagen.";
                    break;
                case 10:
                    tekst = "De tiende maand is oktober. Oktober heeft 31 dagen.";
                    break;
                case 11:
                    tekst = "De elfde maand is november. November heeft 30 dagen.";
                    break;
                case 12:
                    tekst = "De twaalfde maand is december. December heeft 31 dagen.";
                    break;
                default:
                    tekst = "U hebt een verkeerd nummer ingetikt ..!";
                    break;
            }
            repaint();
        }
    }
}