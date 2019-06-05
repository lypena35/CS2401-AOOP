import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 * Class that will play music files at given paths
 *
 * @author Jesus Molina
 */
public class FilePlayer {

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
     * main method that plays the two threads to create the lab 6 music
     *
     * @param args
     * @author Lorianne Pena
     */

    public static void main(String[] args) {
        Thread1 t1 = new Thread1 ( );
        t1.start ( );
        Thread2 t2 = new Thread2 ( );
        t2.start ( );
    }
}

/**
 * This class is the first thread. That plays do, mi, sol, si, do-octave.
 */
class Thread1 extends Thread {
    FilePlayer soundFile1 = new FilePlayer ( );

    /**
     * This is the synchronized run class to run thread one.
     */
    public synchronized void run() {

        try {
            sleep (100);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }

        soundFile1.play ("do.wav");//do
        System.out.println ("played do");

        try {
            sleep (1500);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }

        soundFile1.play ("mi.wav");//mi
        System.out.println ("played mi");
        try {
            sleep (1600);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
        soundFile1.play ("sol.wav");//sol
        System.out.println ("played sol");
        try {
            sleep (1800);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
        soundFile1.play ("si.wav");//si
        System.out.println ("played si");
        try {
            sleep (1900);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
        soundFile1.play ("do-octave.wav");//do octave
        System.out.println ("played do-octave");
        try {
            sleep (2000);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
    }
}

/**
 * This class is the second thread that plays re, fa, la, do-octave files.
 */
class Thread2 extends Thread {
    FilePlayer soundFile2 = new FilePlayer ( );

    /**
     * This is the synchronized run method to play the sounds.
     */
    public synchronized void run() {
        try {
            sleep (1200);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }

        soundFile2.play ("re.wav");//re
        System.out.println ("played re");
        try {
            sleep (1500);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }

        soundFile2.play ("fa.wav");//fa
        System.out.println ("played fa");
        try {
            sleep (1600);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
        soundFile2.play ("la.wav");//la
        System.out.println ("played la");
        try {
            sleep (1900);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
        soundFile2.play ("do-octave.wav");//do-octave
        System.out.println ("played do-octave");
        try {
            sleep (2000);
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }

    }

}
