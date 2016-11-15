package Hoofdstuk12;

import java.applet.Applet;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/**
 * Created by Romy Mae on 8-11-2016.
 */
public class TwaalfPuntVier extends Applet {

int[] cijfers ={0,1,2,3,4,5,6,7,8,9};
    TextField invoer = new TextField("",5);
    Button oke = new Button("oke");
    String string = "";
            boolean gevonden = false;
    int index = -1;

    public void init() {
setSize(500,500);
        add(invoer);
invoer.addActionListener(new invoerListiner());
        add(oke);
        oke.addActionListener( new invoerListiner());

    }

    public void paint(Graphics g) {
int x = getWidth();
        int y = getHeight();
        g.drawString(""+string,x/2-100,y/2);
    }

    class invoerListiner implements ActionListener{
        public void actionPerformed(ActionEvent e){
        int zoeken= Integer.parseInt(invoer.getText());
            for (int i = 0; i < cijfers.length && gevonden== false; i++) {
             index++;
                if (cijfers[i]==zoeken){
                    gevonden = true;
                }
            }
            if (gevonden == true) {
                string = "Er is een of meer waarde(s) gevonden onder de index " + index + ".";
            } else {
                string = "De waarde is niet gevonden.";
            }
            index = -1;
            invoer.setText("");
            gevonden = false;
            repaint();
        }
    }


}
