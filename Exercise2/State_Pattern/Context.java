package Exercise2.State_Pattern;

/**
 * Created by LoriPena on 11/7/18.
 * Lorianne Pena
 */
public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}