import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class H10Praktijk extends Applet {
    int invoer;
    TextField invoertekst;
    String uitkomst, uitvoer;
    Label labelinvoer;

    public void init(){
        labelinvoer = new Label("Voer hier uw cijfer in");
        invoertekst = new TextField("", 5);
        invoertekst.addActionListener(new FieldInvoerListener());
        add(labelinvoer);
        add(invoertekst);
        uitvoer="";
        uitkomst="";


    }

    public void paint(Graphics g){
        g.drawString(uitvoer, 20, 60);

    }

    public class FieldInvoerListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            uitkomst = invoertekst.getText();
            invoer = Integer.parseInt(uitkomst);
            switch(invoer) {
                case 1:
                    uitvoer="U heeft een 1. Dat is een slecht cijfer.";
                    break;
                case 2:
                    uitvoer="U heeft een 2. Dat is een slecht cijfer.";
                    break;
                case 3:
                    uitvoer="U heeft een 3. Dat is een slecht cijfer.";
                    break;
                case 4:
                    uitvoer="U heeft een 4. Dat is een onvoldoende cijfer.";
                    break;
                case 5:
                    uitvoer="U heeft een 5. Dat is een matig cijfer.";
                    break;
                case 6:
                    uitvoer="U heeft een 6. Dat is een voldoende cijfer.";
                    break;
                case 7:
                    uitvoer="U heeft een 7. Dat is een voldoende cijfer.";
                    break;
                case 8:
                    uitvoer="U heeft een 8. Dat is een goed cijfer.";
                    break;
                case 9:
                    uitvoer="U heeft een 9. Dat is een goed cijfer.";
                    break;
                case 10:
                    uitvoer="U heeft een 10. Dat is een goed cijfer.";
                    break;
                default:
                    uitvoer="U heeft een verkeerd cijfer ingetikt.";
                    break;


            } repaint();

        }
    }
}
