package Exercise2;

/**
 * Created by LoriPena on 10/3/18.
 * Lorianne Pena
 */
class Stuff {
    static int count=0;

    public Stuff(){
        count =count +1;
        System.out.println ("Created object number: "+ count );
    }
}
class Test4{
    public static void main(String[] args) {
        Stuff s1= new Stuff ();
        Stuff s2= new Stuff ();

    }
}
