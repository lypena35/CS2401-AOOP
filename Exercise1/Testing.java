package Exercise1;

/**
 * Created by LoriPena on 11/15/18.
 * Lorianne Pena
 */
public class Testing {

    public static void printTest(){
        int f=1,i=2;
        while (++i<5){
            f*=i;
        }
        System.out.println (f );
    }

    public static void main(String[] args) {
        printTest ();
    }
}
