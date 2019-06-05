package Exercise2.State_Pattern;


/**
 * Created by LoriPena on 11/7/18.
 * Lorianne Pena
 */
public class StartState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString(){
        return "Start State";
    }
}
