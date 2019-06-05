package Exercise2;


/**
 * Created by LoriPena on 10/1/18.
 * Lorianne Pena
 */
public class A {
    public String name;
    protected int ID;

    public A() {
        this.name = name;
        this.ID = ID;
    }
    //public void print(){
      //  this.name ="Bob";
      //  System.out.println (name );
    //}

    private void printV(){
        System.out.println ("Hi" );
    }
    public String toString(){//to print the object it converts it
        return "name"+" "+A.this.name;
    }
}
    class Test {
        public static void main(String[] args) {
            A name1 = new A ( );
          //  name1.print ();
            name1.name="Bob";
            System.out.println (name1.toString () );

        }
    }



