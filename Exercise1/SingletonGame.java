package Exercise1;


/**
 * Created by LoriPena on 11/26/18.
 * Lorianne Pena
 */
public class SingletonGame {

    private static SingletonGame instance;

    private SingletonGame(){}

    public static SingletonGame getInstance(){
       if(instance==null){
           synchronized (SingletonGame.class){
               if(instance==null){
                   System.out.println ("Instance has been invoked" );
                   instance= new SingletonGame ();
               }
           }
       }

        return instance;
    }


    @SuppressWarnings ("Duplicates")
    public void createGrids(){

        System.out.println ("Player 1" );
        Integer [][] grid= new Integer[9][9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
               grid[i][j]=0;
               System.out.print(grid[i][j] + " ");
            }
            System.out.println ( );
        }
        System.out.println ("Player 2" );
        Integer [][] grid2= new Integer[9][9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                grid2[i][j]=0;
                System.out.print(grid2[i][j] + " ");
            }
            System.out.println ( );
        }


        System.out.println ("Grids created" );
    }

    public static void main(String[] args) {
        SingletonGame obj= SingletonGame.getInstance ();
        obj.createGrids ();

    }
}
