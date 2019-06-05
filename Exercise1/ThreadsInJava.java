package Exercise1;

import java.util.Scanner;

/**
 * Created by LoriPena on 11/12/18.
 * Lorianne Pena
 */
class Thread1 extends Thread {
    @Override
    public void run(){
        for(int i=0;i<=1000;i++){
           System.out.println ("Thread ONE: " );
           // double count=0.0;
          // count+=Math.random ();//slows down thread 1
           // Scanner input= new Scanner(System.in);
           // int result;
           // result=input.nextInt ();//slow down from user
            System.out.println (i );
            try {
            sleep (5000);
            //  join (1000);
           } catch (InterruptedException e) {
                e.printStackTrace ( );
             }

        }
    }


}
class Thread2 extends Thread{
    @Override
    public void run(){
        for (int i=1001; i<=2000;i++){
            System.out.println ("Thread TWO: " );
            System.out.println (i );
        }
    }
}
public class ThreadsInJava{
    public static void main(String[] args) throws InterruptedException {
        Thread1 t1= new Thread1 ();
        t1.start ();
       // t1.join (1000);

        Thread2 t2= new Thread2 ();
        t2.start ();
    }
}
