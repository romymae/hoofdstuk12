package Hoofdstuk12;

import java.applet.Applet;

/**
 * Created by Romy Mae on 1-11-2016.
 */
import java.awt.*;
public class TwaalfPuntTwee extends Applet {
Button[] button= new Button [25];
    public void init(){
    }

    public void paint(Graphics g){
        setSize(500,1000);
        for (int i = 0; i <button.length ; i++) {
            button[i] = new Button("button kk" +(i+1));
            add(button[i]);
        }
    }
}
