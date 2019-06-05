package Exercise2;

/**
 * Created by LoriPena on 10/3/18.
 * Lorianne Pena
 */
class Dog {
    public void bark(){
        System.out.println ("woof" );
    }
    public void bark(int num){
        for(int i=0;i<num;i++){
            System.out.println ("woof" );
        }
    }
}
class Hound extends Dog{
    public void sniff(){
        System.out.println ("sniff" );
    }
    public void bark(){
        System.out.println ("bowl" );
    }
}
class Test1{
    public static void main(String[] args) {
        Dog doggo= new Dog ();
        doggo.bark ();
        //System.out.println ("bark 4x" );
        //doggo.bark (4);
        doggo= new Hound ();
        doggo.bark ();
        //Hound copper= new Hound ();
        //copper.bark ();
        //System.out.println ("bark 4x" );
        //copper.bark (4);

    }
}


