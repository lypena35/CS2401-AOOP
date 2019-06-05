package Exercise1;

/**
 * Created by LoriPena on 11/21/18.
 * Lorianne Pena
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasswordFieldExample {
    public static void main(String[] args) {
        JFrame f=new JFrame("Password Field Example");
        JPasswordField value = new JPasswordField();
        JPasswordField value2= new JPasswordField ();
        JLabel username= new JLabel ("UserName: ");
        JLabel l1=new JLabel("Password:");
        JButton b = new JButton ("Enter"); //creating instance of JButton
        username.setBounds(60,120, 100,30);//word username
        value.setBounds(130,120,100,30);//user field
        l1.setBounds(65,170, 100,30);//word password
        value2.setBounds (130,170,100,30);//pass field
        b.setBounds (170, 220, 100, 30); //x axis, y axis, width, height  
        b.addActionListener (new ActionListener ( ) {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println (username);
                System.out.println (l1 );
            }
        });
        f.add (b);//adding button in JFrame
        f.add(value);f.add(username);f.add(l1);f.add (value2);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        }
        }
