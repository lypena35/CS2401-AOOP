package Exercise2;

/**
 * Created by LoriPena on 10/7/18.
 * Lorianne Pena
 */
public class Practice {
    protected int taco=0;


    public Practice(int taco) {
        this.taco = taco;
    }

    public void meh(){
        System.out.println ("hello" );
    }

}
class Exercise extends Practice{
    public Exercise(int taco, Practice me) {
       super(taco);

    }
}
class Yoga extends Exercise {
    public Yoga(int taco, Practice me, Exercise ne) {
        super (taco, me);
        this.ne = ne;
    }

    Exercise ne;

}
/*
class Yoga extends Practice{
    public Yoga(int taco) {
        super (taco);
    }
}
*/
