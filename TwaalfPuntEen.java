package Hoofdstuk12;

import java.applet.Applet;

/**
 * Created by Romy Mae on 1-11-2016.
 */
import java.awt.*;
import java.applet.*;
public class TwaalfPuntEen extends Applet{
    int []tabel={1,3,7,9,10,1,50,25,15,8};
    public void init() {
        setSize(500, 500);
    }

public void paint (Graphics g){
int x = getWidth();
int y = getHeight();
double gem = 0.0;

        for (int z =0; z < tabel.length; z++){
          g.drawString(""+tabel[z], x/2,(y/2-15*tabel.length)+15*z);
            gem+= tabel[z];
        }
        gem/=tabel.length;
    g.drawString("het gemiddelde is "+ gem, x/2-50,(y/2+15*tabel.length/2)+10);
    }
}
