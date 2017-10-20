package H12;

import java.applet.*;
import java.awt.*;

public class H12Punt2 extends Applet {
    Button[] button;


    public void init(){
    button = new Button[24];
    for (int teller = 0; teller < 25; teller++){
        button[0] = new Button("Ok");
        add(button[0]);
    }
    }
}
