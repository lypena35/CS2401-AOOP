import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

/**
 * Created by LoriPena on 11/26/18.
 * Lorianne Pena
 */

/**
 * Class that will play music files at given paths
 *
 * @author Jesus Molina
 */
public class FilePlayer2 {

    /**
     * Plays an audio clip located at the given path
     *
     * @param filePath the path to the audio clip that should be played
     */
    @SuppressWarnings("Duplicates")
    public void play(String filePath) {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream (new File (filePath).getAbsoluteFile ( ));
            Clip clip = AudioSystem.getClip ( );
            clip.open (audioInputStream);
            clip.start ( );

        } catch (Exception e) {
            System.out.println ("Error with playing sound.");
            e.printStackTrace ( );
        }

    }

    /**
     * This is the main method to play the extra credit assignment twinkle twinkle little star
     *
     * @param args
     */

    public static void main(String[] args) {
        Thread3 t3 = new Thread3 ( );
        t3.start ( );
        Thread t4 = new Thread4 ( );
        t4.start ( );
    }
}

/**
 * This class is the first thread that will play do, sol, and mi files needed for the song
 */

class Thread3 extends Thread {
    FilePlayer soundFile3 = new FilePlayer ( );

    /**
     * This is the run method to play the song twinkle twinkle little star
     */
    public void run() {

        try {
            sleep (100);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
        System.out.println ("Twinkle Twinkle Little Star");
        System.out.println ("First Verse");
        System.out.println ( );
        soundFile3.play ("do.wav");//do
        System.out.println ("played do");

        try {
            sleep (1000);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }

        soundFile3.play ("do.wav");//do
        System.out.println ("played do");
        try {
            sleep (1100);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }

        soundFile3.play ("sol.wav");//sol
        System.out.println ("played sol");
        try {
            sleep (1150);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
        soundFile3.play ("sol.wav");//sol
        System.out.println ("played sol");
        try {
            sleep (3000);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
        soundFile3.play ("sol.wav");//sol
        System.out.println ("played sol");
        try {
            sleep (4000);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }

        soundFile3.play ("mi.wav");//mi
        System.out.println ("played mi");
        try {
            sleep (1400);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
        soundFile3.play ("mi.wav");//mi
        System.out.println ("played mi");
        try {
            sleep (4150);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
        soundFile3.play ("do.wav");//do
        System.out.println ("played do");
        try {
            sleep (1100);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
        try {
            sleep (1100);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
        System.out.println ( );
        System.out.println ("Second verse");
        System.out.println ( );
        soundFile3.play ("sol.wav");//sol
        System.out.println ("played sol");
        try {
            sleep (1000);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
        soundFile3.play ("sol.wav");//sol
        System.out.println ("played sol");
        try {
            sleep (1200);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
        try {
            sleep (3200);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }

        soundFile3.play ("mi.wav");//mi
        System.out.println ("played mi");
        try {
            sleep (1400);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
        soundFile3.play ("mi.wav");//mi
        System.out.println ("played mi");
        try {
            sleep (1450);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
        try {
            sleep (2100);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
        soundFile3.play ("sol.wav");//sol
        System.out.println ("played sol");
        try {
            sleep (1000);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
        soundFile3.play ("sol.wav");//sol
        System.out.println ("played sol");
        try {
            sleep (1200);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }

        try {
            sleep (3200);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
        soundFile3.play ("mi.wav");//mi
        System.out.println ("played mi");
        try {
            sleep (1400);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
        soundFile3.play ("mi.wav");//mi
        System.out.println ("played mi");
        try {
            sleep (1450);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }

        try {
            sleep (2000);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
        System.out.println ( );
        System.out.println ("Third Verse");
        System.out.println ( );
        soundFile3.play ("do.wav");//do
        System.out.println ("played do");

        try {
            sleep (1000);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }

        soundFile3.play ("do.wav");//do
        System.out.println ("played do");
        try {
            sleep (1100);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }

        soundFile3.play ("sol.wav");//sol
        System.out.println ("played sol");
        try {
            sleep (1150);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
        soundFile3.play ("sol.wav");//sol
        System.out.println ("played sol");
        try {
            sleep (3000);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
        soundFile3.play ("sol.wav");//sol
        System.out.println ("played sol");
        try {
            sleep (4000);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }

        soundFile3.play ("mi.wav");//mi
        System.out.println ("played mi");
        try {
            sleep (1400);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
        soundFile3.play ("mi.wav");//mi
        System.out.println ("played mi");
        try {
            sleep (4150);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
        soundFile3.play ("do.wav");//do
        System.out.println ("played do");
        try {
            sleep (1100);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }

    }
}

/**
 * This class is to play the second thread of notes re, fa, and la for twinkle twinkle little star
 */
class Thread4 extends Thread {
    FilePlayer soundFile4 = new FilePlayer ( );

    /**
     * This method is to run the method to play the other notes of twinkle twinkle little star
     */

    public void run() {
        try {
            sleep (4300);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
        soundFile4.play ("la.wav");//la
        System.out.println ("played la");
        try {
            sleep (1300);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
        soundFile4.play ("la.wav");//la
        System.out.println ("played la");
        try {
            sleep (1350);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
        try {
            sleep (1350);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
        soundFile4.play ("fa.wav");//fa
        System.out.println ("played fa");
        try {
            sleep (1400);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
        soundFile4.play ("fa.wav");//fa
        System.out.println ("played fa");
        try {
            sleep (1450);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
        try {
            sleep (2450);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
        soundFile4.play ("re.wav");//re
        System.out.println ("played re");
        try {
            sleep (1300);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
        soundFile4.play ("re.wav");//re
        System.out.println ("played re");
        try {
            sleep (1350);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
        try {
            sleep (4350);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
        soundFile4.play ("fa.wav");//fa
        System.out.println ("played fa");
        try {
            sleep (1500);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
        soundFile4.play ("fa.wav");//fa
        System.out.println ("played fa");
        try {
            sleep (1550);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
        try {
            sleep (2550);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }

        soundFile4.play ("re.wav");//re
        System.out.println ("played re");
        try {
            sleep (1350);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
        try {
            sleep (3350);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
        soundFile4.play ("fa.wav");//fa
        System.out.println ("played fa");
        try {
            sleep (1500);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
        soundFile4.play ("fa.wav");//fa
        System.out.println ("played fa");
        try {
            sleep (1550);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
        try {
            sleep (2450);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
        soundFile4.play ("re.wav");//re
        System.out.println ("played re");
        try {
            sleep (1300);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
        try {
            sleep (5300);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
        soundFile4.play ("la.wav");//la
        System.out.println ("played la");
        try {
            sleep (1300);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
        soundFile4.play ("la.wav");//la
        System.out.println ("played la");
        try {
            sleep (1350);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
        try {
            sleep (1350);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
        soundFile4.play ("fa.wav");//fa
        System.out.println ("played fa");
        try {
            sleep (1400);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
        soundFile4.play ("fa.wav");//fa
        System.out.println ("played fa");
        try {
            sleep (1450);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
        try {
            sleep (2450);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
        soundFile4.play ("re.wav");//re
        System.out.println ("played re");
        try {
            sleep (1300);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
        soundFile4.play ("re.wav");//re
        System.out.println ("played re");
        try {
            sleep (1350);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }

    }

}



