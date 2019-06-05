/**
 * Created by LoriPena on 10/1/18.
 * Lorianne Pena
 */
public class test {

    public static void exer() {
        int result = 0;
        for (int i = 0; i < 5; i++) {
            if(i==3){
                result+=10;
            }else{
                result+=i;
            }
        }
        System.out.println (result );
    }
    public static void square(int x){
        x=x*x;
    }

    public static void main(String[] args) {
        //exer ();
        int x=4;
        square (x);
        System.out.println (x );
    }
}
