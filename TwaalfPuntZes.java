package Hoofdstuk12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/**
 * Created by Romy Mae on 9-11-2016.
 */
public class TwaalfPuntZes extends Applet {
    int [] nummers = {0,0,0,1,1,1,2,2,3,4,4,5,6,7,8,9,9,9,10,10};
TextField invoegen = new TextField("",5);
Button oke = new Button("oke");
    String string ="";
    int count = 0;
    public void init() {
setSize(500,500);
add(invoegen);
        invoegen.addActionListener(new InvoegenListiner());
        add(oke);
        oke.addActionListener(new InvoegenListiner());
    }

    public void paint(Graphics g) {
int x = getWidth();
        int y= getHeight();

        g.drawString(""+string,x/2-100,y/2);
    }
    class InvoegenListiner implements ActionListener {
        public void actionPerformed(ActionEvent e){
            int zoeken = Integer.parseInt(invoegen.getText());
            for (int i = 0; i <nummers.length ; i++) {
              if(nummers[i]== zoeken){
                  count++
              }
            }
            if (count>0){
                string = "waarde is "+count+ "keer gevonden"
            }else{
                count =0;
                invoegen.setText("");
                repaint();
            }
        }
    }
}



