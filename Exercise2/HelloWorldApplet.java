package Exercise2;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by LoriPena on 10/8/18.
 * Lorianne Pena
 */
public class HelloWorldApplet extends Applet {
    public void paint(Graphics g){
        Dimension d=getSize ();
        g.setColor (Color.black);
        g.fillRect (0,0,d.width,d.height);// paint background
        g.setFont (new Font ("San-serif",Font.BOLD,24));
        g.setColor (new Color (255,215,0));
        g.drawString ("Hello World!",60,40);
       // g.drawImage (getImage (getCodeBase (),"Rabbit.jpg"),20,60,this);
    }
}
