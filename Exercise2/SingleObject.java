package Exercise2;

/**
 * Created by LoriPena on 11/5/18.
 * Lorianne Pena
 */
public class SingleObject {
    //create an object of SingleObject
    private static SingleObject instance= new SingleObject ();

    //make the constructor private so that this class cannot be instantiated
    private static SingleObject getInstance(){
        return instance;
    }
    public void showMessage(){
        System.out.println ("Hello World!" );
    }

    public static void main(String[] args) {
        //illegal construct
        //compile time error: The constructor SingleObject() is not visible
        //SingleObject object= new SingleObject();

        //Get the only object available
        SingleObject object= SingleObject.getInstance ();

        //Show the message
        object.showMessage ();
    }
}
