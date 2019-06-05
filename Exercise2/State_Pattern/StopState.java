package Exercise2.State_Pattern;


/**
 * Created by LoriPena on 11/7/18.
 * Lorianne Pena
 */
public class StopState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString(){
        return "Stop State";
    }
}
