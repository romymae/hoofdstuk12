package Hoofdstuk12;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.*;
/**
 * Created by Romy Mae on 8-11-2016.
 */
public class TwaalfPuntDrie extends Applet {
 int[] getallen;
    TextField[] tekstveld;
    Button oke;



    public void init() {
       getallen = new int[5];
        tekstveld = new TextField[5];
        for (int i = 0; i <tekstveld.length ; i++) {
           tekstveld [i] = new TextField("",7);
            add(tekstveld[i]);
        }
    oke = new Button("oke");
        oke.addActionListener(new Listiner());
        add(oke);

    }


    public void paint(Graphics g) {

    }
class Listiner implements ActionListener{
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i <getallen.length ; i++) {
            getallen[i] =Integer.parseInt(tekstveld[i].getText());
        }
        Arrays.sort(getallen);

        for (int i = 0; i <tekstveld.length ; i++){
            tekstveld[i].setText(""+ getallen[i]);
        }
    }

}

}
