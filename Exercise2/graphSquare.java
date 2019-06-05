package Exercise2;

import java.applet.Applet;
import java.awt.*;


/**
 * Created by LoriPena on 10/10/18.
 * Lorianne Pena
 */
public class graphSquare extends Applet {

    public void paint (Graphics g){
        Dimension d1=getSize ();
        g.setColor (Color.BLUE);
        g.fillRect (0,0,d1.width,d1.height);
        g.setColor (Color.YELLOW);
        g.drawRect (50,65,300,200);
       g.fillRect (50,65,300,200);
       g.setColor (Color.ORANGE);
       g.drawRect (150,100,150,125);
       g.fillRect (150,100,150,125);
       g.setColor (Color.BLACK);
        g.setFont (new Font ("San-serif",Font.BOLD,20));
       g.drawString ("Rect", 455,345);

    }

}
