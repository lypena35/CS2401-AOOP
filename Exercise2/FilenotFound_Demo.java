package Exercise2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by LoriPena on 10/15/18.
 * Lorianne Pena
 */
public class FilenotFound_Demo {//file not found exception
    public static void main(String[] args) {
        try {
            File file = new File ("E://file.txt");
            FileReader fr = new FileReader (file);
        }catch (IOException e){
            System.out.println ("ERROR");
        }
    }
}
class Unchecked_Demo{//array out of bounds error
    public static void main(String[] args) {
        int num[]={1,2,3,4};
        System.out.println (num[5] );
    }
   // class Unchecked_Demo{//error duplicate

   // }

}



