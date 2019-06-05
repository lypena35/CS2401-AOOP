import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by LoriPena on 8/29/18.
 * Lorianne Pena
 * CS 3331
 * Assignment 1
 */
public class BattleShip {
    public static int[][] grid = new int[9][9];
    public static ArrayList<Integer> arrayPointAdj1 = new ArrayList<Integer> ( );
    public static ArrayList<Integer> arrayPointAdj2 = new ArrayList<Integer> ( );
    public static ArrayList<Integer> arrayPointAdj3 = new ArrayList<Integer> ( );
    public static ArrayList<Integer> arrayPointAdj4 = new ArrayList<Integer> ( );

    public static ArrayList<Integer> arrayPointDiag1 = new ArrayList<Integer> ( );
    public static ArrayList<Integer> arrayPointDiag2 = new ArrayList<Integer> ( );
    public static ArrayList<Integer> arrayPointDiag3 = new ArrayList<Integer> ( );
    public static ArrayList<Integer> arrayPointDiag4 = new ArrayList<Integer> ( );

    /**
     * This paragraph is to print the list of all edge-adjacent squares.
     *
     * @param x the x or x axis (horizontal line) point/coordinate.
     * @param y the y or y axis (vertical line) point/coordinate.
     */
    public static void calEdges(int x, int y) {
        if (x >= 9 || y >= 9) {//if x or y is greater than 9 we return so it doesn't go over 9
            return;
        }
        if (x < 0 || y < 0) {// so it doesn't go into the negatives
            return;

        } else if (grid[x][y] == -1 && x == 0 && y == 0) {//Adjacent edges top left corner
            System.out.println ("Adjacent Edges top left corner: ");
            System.out.println ("(" + (x + 1 + " , " + y) + "), (" + (x + " , " + (y + 1)) + ")");
            arrayPointAdj1.add (x + 1);
            arrayPointAdj1.add (y);
            arrayPointAdj2.add (x);
            arrayPointAdj2.add (y + 1);
        } else if (grid[x][y] == -1 && x == 8 && y == 0) { //Adjacent edges bottom left corner
            System.out.println ("Adjacent Edges bottom left corner: ");
            System.out.println ("(" + (x - 1 + " , " + y) + "), (" + (x + " , " + (y + 1)) + ")");
            arrayPointAdj1.add (x - 1);
            arrayPointAdj1.add (y);
            arrayPointAdj2.add (x);
            arrayPointAdj2.add (y + 1);
        } else if (grid[x][y] == -1 && x == 0 && y == 8) {//Adjacent edges top right corner
            System.out.println ("Adjacent Edges top right corner: ");
            System.out.println ("(" + (x + 1 + " , " + y) + "), (" + (x + " , " + (y - 1)) + ")");
            arrayPointAdj1.add (x + 1);
            arrayPointAdj1.add (y);
            arrayPointAdj2.add (x);
            arrayPointAdj2.add (y - 1);
        } else if (grid[x][y] == -1 && x == 8 && y == 8) {//Adjacent edges bottom right corner
            System.out.println ("Adjacent Edges bottom right corner: ");
            System.out.println ("(" + (x - 1 + " , " + y) + "), (" + (x + " , " + (y - 1)) + ")");
            arrayPointAdj1.add (x - 1);
            arrayPointAdj1.add (y);
            arrayPointAdj2.add (x);
            arrayPointAdj2.add (y - 1);
        } else if (grid[x][y] == -1 && x != 0 && x != 8 && y == 0) {//Adjacent edges left y corners
            System.out.println ("Adjacent Edges left y corners: ");
            System.out.println ("(" + (x - 1 + " , " + y) + "), (" + (x + 1 + " , " + y) + "), (" + (x + " , " + (y + 1)) + ")");
            arrayPointAdj1.add (x - 1);
            arrayPointAdj1.add (y);
            arrayPointAdj2.add (x + 1);
            arrayPointAdj2.add (y);
            arrayPointAdj3.add (x);
            arrayPointAdj3.add (y + 1);
        } else if (grid[x][y] == -1 && y != 0 && y != 8 && x == 0) {//Adjacent edges top x corners
            System.out.println ("Adjacent Edges top x corners: ");
            System.out.println ("(" + (x + " , " + (y + 1)) + "), (" + (x + 1 + " , " + y) + "), (" + (x + " , " + (y - 1)) + ")");
            arrayPointAdj1.add (x);
            arrayPointAdj1.add (y + 1);
            arrayPointAdj2.add (x + 1);
            arrayPointAdj2.add (y);
            arrayPointAdj3.add (x);
            arrayPointAdj3.add (y - 1);
        } else if (grid[x][y] == -1 && y != 0 && y != 8 && x == 8) {//Adjacent edges bottom x corners
            System.out.println ("Adjacent Edges bottom x corners: ");
            System.out.println ("(" + (x - 1 + " , " + y) + "), (" + (x + " , " + (y - 1)) + "), (" + (x + " , " + (y + 1)) + ")");
            arrayPointAdj1.add (x - 1);
            arrayPointAdj1.add (y);
            arrayPointAdj2.add (x);
            arrayPointAdj2.add (y - 1);
            arrayPointAdj3.add (x);
            arrayPointAdj3.add (y + 1);
        } else if (grid[x][y] == -1 && x != 0 && x != 8 && y != 0 && y == 8) {//Adjacent edges right y corners
            System.out.println ("Adjacent Edges right y corners: ");
            System.out.println ("(" + (x - 1 + ", " + y) + "), (" + (x + " , " + (y - 1)) + "), (" + (x + 1 + " , " + y) + ")");
            arrayPointAdj1.add (x - 1);
            arrayPointAdj1.add (y);
            arrayPointAdj2.add (x);
            arrayPointAdj2.add (y - 1);
            arrayPointAdj3.add (x + 1);
            arrayPointAdj3.add (y);
        } else if (grid[x][y] == -1 && x != 0 && x != 8 && y != 0 && y != 8) {//Adjacent edges default case
            System.out.println ("Adjacent Edges: ");
            System.out.println ("(" + (x - 1 + " , " + y) + "), (" + (x + 1 + " , " + y) + "), (" + (x + " , " + (y - 1)) + "), (" + (x + " , " + (y + 1)) + ")");
            arrayPointAdj1.add (x - 1);
            arrayPointAdj1.add (y);
            arrayPointAdj2.add (x + 1);
            arrayPointAdj2.add (y);
            arrayPointAdj3.add (x);
            arrayPointAdj3.add (y - 1);
            arrayPointAdj4.add (x);
            arrayPointAdj4.add (y + 1);
        }
    }

    /**
     * This method is to print the list of all corner-adjacent squares.
     *
     * @param x is the x or x axis (horizontal line) point/coordinate.
     * @param y is the y or y axis (vertical line) point/coordinate.
     */
    public static void calDiagonal(int x, int y) {//corner-adjacent means diagonal
        if (x >= 9 || y >= 9) {//if x or y is greater than 9 we return so it doesn't go over 9
            return;
        }
        if (x < 0 || y < 0) {// so it doesn't go into the negatives
            return;
        } else if (grid[x][y] == -1 && x == 0 && y == 0) {//diagonal edges top left corner
            System.out.println ("Diagonal top left corner: ");
            System.out.println ("(" + (x + 1 + " , " + (y + 1)) + ")");
            arrayPointDiag1.add (x + 1);
            arrayPointDiag1.add (y + 1);
        } else if (grid[x][y] == -1 && x == 8 && y == 0) { //diagonal edges bottom left corner
            System.out.println ("Diagonal bottom left corner: ");
            System.out.println ("(" + (x - 1 + " , " + (y + 1)) + ")");
            arrayPointDiag1.add (x - 1);
            arrayPointDiag1.add (y + 1);
        } else if (grid[x][y] == -1 && x == 0 && y == 8) {// diagonal edges top right corner
            System.out.println ("Diagonal top right corner: ");
            System.out.println ("(" + (x + 1 + " , " + (y - 1)) + ")");
            arrayPointDiag1.add (x + 1);
            arrayPointDiag1.add (y - 1);
        } else if (grid[x][y] == -1 && x == 8 && y == 8) {// diagonal edges bottom right corner
            System.out.println ("Diagonal bottom right corner: ");
            System.out.println ("(" + (x - 1 + " , " + (y - 1)) + ")");
            arrayPointDiag1.add (x - 1);
            arrayPointDiag1.add (y - 1);
        } else if (grid[x][y] == -1 && x != 0 && x != 8 && y == 0) {// diagonal edges left y corners
            System.out.println ("Diagonal Edges left y corners: ");
            System.out.println ("(" + (x + 1 + " , " + (y + 1)) + "), (" + (x - 1 + " , " + (y + 1)) + ")");
            arrayPointDiag1.add (x + 1);
            arrayPointDiag1.add (y + 1);
            arrayPointDiag2.add (x - 1);
            arrayPointDiag2.add (y + 1);
        } else if (grid[x][y] == -1 && y != 0 && y != 8 && x == 0) {// diagonal edges top x corners
            System.out.println ("Diagonal Edges top x corners: ");
            System.out.println ("(" + (x + 1 + " , " + (y - 1)) + "), (" + (x + 1 + " , " + (y + 1)) + ")");
            arrayPointDiag1.add (x + 1);
            arrayPointDiag1.add (y - 1);
            arrayPointDiag2.add (x + 1);
            arrayPointDiag2.add (y + 1);
        } else if (grid[x][y] == -1 && y != 0 && y != 8 && x == 8) {//diagonal edges bottom x corners
            System.out.println ("Diagonal Edges bottom x corners: ");
            System.out.println ("(" + (x - 1 + " , " + (y - 1)) + "), (" + (x - 1 + " , " + (y + 1)) + ")");
            arrayPointDiag1.add (x - 1);
            arrayPointDiag1.add (y - 1);
            arrayPointDiag2.add (x - 1);
            arrayPointDiag2.add (y + 1);
        } else if (grid[x][y] == -1 && x != 0 && x != 8 && y != 0 && y == 8) {// diagonal edges right y corners
            System.out.println ("Diagonal Edges right y corners: ");
            System.out.println ("(" + (x - 1 + " , " + (y - 1)) + "), (" + (x + 1 + " , " + (y - 1)) + ")");
            arrayPointDiag1.add (x - 1);
            arrayPointDiag1.add (y - 1);
            arrayPointDiag2.add (x + 1);
            arrayPointDiag2.add (y - 1);
        } else if (grid[x][y] == -1 && x != 0 && x != 8 && y != 0 && y != 8) {//diagonal edges default case
            System.out.println ("Diagonal edges");
            System.out.println ("(" + (x - 1 + " , " + (y - 1)) + "), (" + (x + 1 + " , " + (y + 1)) + "), (" + (x - 1 + " , " + (y + 1)) + "), (" + (x + 1 + " , " + (y - 1)) + ")");
            arrayPointDiag1.add (x - 1);
            arrayPointDiag1.add (y - 1);
            arrayPointDiag2.add (x + 1);
            arrayPointDiag2.add (y + 1);
            arrayPointDiag3.add (x - 1);
            arrayPointDiag3.add (y + 1);
            arrayPointDiag4.add (x + 1);
            arrayPointDiag4.add (y - 1);
        }
    }

    /**
     * This is one of the three methods that prints all the squares which are not adjacent at all to cover the corners.
     *
     * @param x is the x or x axis (horizontal line) point/coordinate.
     * @param y is the y or y axis (vertical line) point/coordinate.
     */
    public static void allOtherSquareCorners(int x, int y) {
        for (x = 0; x < grid.length; x++) {
            for (y = 0; y < grid.length; y++) {
                if (grid[x][y] == -1) {
                    continue;
                }
                if (grid[x][y] == 0) {
                    if (arrayPointAdj1.get (0).equals (x) && arrayPointAdj1.get (1).equals (y) || arrayPointAdj2.get (0).equals (x) && arrayPointAdj2.get (1).equals (y)) {
                        continue;
                    }
                    if (arrayPointDiag1.get (0).equals (x) && arrayPointDiag1.get (1).equals (y)) {
                        continue;
                    }
                }
                System.out.print ("(" + x + " , " + y + ")");
            }
            System.out.println ( );
        }
    }

    /**
     * This is two of the three methods that prints all the squares which are not adjacent at all to cover the longer corners.
     *
     * @param x is the x or x axis (horizontal line) point/coordinate.
     * @param y is the y or y axis (vertical line) point/coordinate.
     */
    public static void allOtherSquaresLongCorners(int x, int y) {
        for (x = 0; x < grid.length; x++) {
            for (y = 0; y < grid.length; y++) {
                if (grid[x][y] == -1) {
                    continue;
                }
                if (grid[x][y] == 0) {
                    if (arrayPointAdj1.get (0).equals (x) && arrayPointAdj1.get (1).equals (y) || arrayPointAdj2.get (0).equals (x) && arrayPointAdj2.get (1).equals (y)) {
                        continue;
                    }
                    if (arrayPointAdj3.get (0).equals (x) && arrayPointAdj3.get (1).equals (y)) {
                        continue;
                    }
                    if (arrayPointDiag1.get (0).equals (x) && arrayPointDiag1.get (1).equals (y) || arrayPointDiag2.get (0).equals (x) && arrayPointDiag2.get (1).equals (y)) {
                        continue;
                    }
                }
                System.out.print ("(" + x + " , " + y + ")");
            }
            System.out.println ( );
        }
    }

    /**
     * This is three of the three methods to print the list of all squares which are not adjacent at all.
     *
     * @param x is the x or x axis (horizontal line) point/coordinate.
     * @param y is the y or y axis (vertical line) point/coordinate.
     */

    public static void allOtherSquares(int x, int y) {
        System.out.println ("All other squares: ");
        for (x = 0; x < grid.length; x++) {
            for (y = 0; y < grid.length; y++) {
                if (grid[x][y] == -1) {
                    continue;
                }
                if (grid[x][y] == 0 && x != 0 && y != 0) {
                    if (arrayPointAdj1.get (0).equals (x) && arrayPointAdj1.get (1).equals (y) || arrayPointAdj2.get (0).equals (x) && arrayPointAdj2.get (1).equals (y)) {
                        continue;
                    }
                    if (arrayPointAdj3.get (0).equals (x) && arrayPointAdj3.get (1).equals (y) || arrayPointAdj4.get (0).equals (x) && arrayPointAdj4.get (1).equals (y)) {
                        continue;
                    }
                    if (arrayPointDiag1.get (0).equals (x) && arrayPointDiag1.get (1).equals (y) || arrayPointDiag2.get (0).equals (x) && arrayPointDiag2.get (1).equals (y)) {
                        continue;
                    }
                    if (arrayPointDiag3.get (0).equals (x) && arrayPointDiag3.get (1).equals (y) || arrayPointDiag4.get (0).equals (x) && arrayPointDiag4.get (1).equals (y)) {
                        continue;
                    }
                }
                System.out.print ("(" + x + " , " + y + ")");
            }
            System.out.println ( );
        }
    }

    /**
     * This method is to print the grid with the starting point (0,0) at the top left corner with numbers from 0-8.
     *
     * @param G is the 2d array that is used to print the battle ship game board (grid).
     */
    public static void printGraphAMInt(int[][] G) {
        for (int i = 0; i < G.length; i++) {//x or x
            for (int j = 0; j < G.length; j++) {//y or y
                System.out.print (G[i][j] + " ");
            }
            System.out.println ( );
        }
    }

    @SuppressWarnings("Duplicates")
    public static void main(String[] args) {
        try {
            int x, y;
            Scanner input = new Scanner (System.in);
            System.out.println ("Hello, welcome to the Battleship Game.");
            System.out.println ("Please select from the following options:");
            System.out.println ("If you would like to enter a letter and number with no space coordinate please press 0 (ex.(a7))");
            System.out.println ("Or if you would like to enter a letter with a space and a number coordinate please press 1 (ex.(a 7))");
            System.out.println ("Or if you would like to enter a number format please press 2 (ex.(3 0))");
            System.out.println ("Or if you would like to enter a special number format please press 3 (ex.( (5,5) or 4,1 ))");
            int option = input.nextInt ( );
            if (option == 0) {// this option is for (a7) with no spaces a-i representing 0-8 x and the number presenting 0-8 y
                System.out.println ("Please enter the x and y coordinate you would like to place a ship at: ");
                String s = input.next ( );
                String[] str2 = s.split ("", 3);
                x = (s.charAt (0) - 'a');//to convert letter into number
                y = Integer.parseInt (str2[1]);

                System.out.println ("This is the battleship game 9X9 board which is read with (0,0) on the top left corner with numbers from 0-8");
                System.out.println ("The -1 represents the point or coordinate in which you entered:");
                grid[x][y] = -1;// marks where the "ship" goes with a -1, the rest of the grid is 0 representing a open space
                printGraphAMInt (grid);
                System.out.println ( );
                calEdges (x, y);
                System.out.println ( );
                calDiagonal (x, y);
                System.out.println ( );
                if (x == 0 && y == 0 || x == 0 && y == 8 || x == 8 && y == 0 || x == 8 && y == 8) {//for corners
                    System.out.println ("Shown are all the squares that are not adjacent to the entered coordinate:");
                    allOtherSquareCorners (x, y);
                } else if (x == 8 || y == 8 || x == 0 || y == 0) { //for long corners
                    System.out.println ("Shown are all the squares that are not adjacent to the entered coordinate:");
                    allOtherSquaresLongCorners (x, y);
                } else if (x != 0 && x != 8 & y != 0 && y != 8 || x != 0 && x != 8 && y != 0 && y != 8) {//for all other squares
                    System.out.println ("Shown are all the squares that are not adjacent to the entered coordinate:");
                    allOtherSquares (x, y);
                }
            /*Idea for the replaceAll string came from
        https://stackoverflow.com/questions/4030928/extract-digits-from-a-string-in-java
          */
            }
            if (option == 1) {//this option is for a space 7 with a-i representing 0-8 x and the second number 0-8 y
                System.out.println ("Please enter the x and y coordinate you would like to place a ship at: ");
                String s = input.next ( );
                s = s.replaceAll ("\\s", "");
                int w = input.nextInt ( );
                x = (s.charAt (0) - 'a');//to convert letter into number
                y = w;

                System.out.println ("This is the battleship game 9X9 board which is read with (0,0) on the top left corner with numbers from 0-8");
                System.out.println ("The -1 represents the point or coordinate in which you entered:");
                grid[x][y] = -1;// marks where the "ship" goes with a -1, the rest of the grid is 0 representing a open space
                printGraphAMInt (grid);
                System.out.println ( );
                calEdges (x, y);
                System.out.println ( );
                calDiagonal (x, y);
                System.out.println ( );
                if (x == 0 && y == 0 || x == 0 && y == 8 || x == 8 && y == 0 || x == 8 && y == 8) {//for corners
                    System.out.println ("Shown are all the squares that are not adjacent to the entered coordinate:");
                    allOtherSquareCorners (x, y);
                } else if (x == 8 || y == 8 || x == 0 || y == 0) {//for long corners
                    System.out.println ("Shown are all the squares that are not adjacent to the entered coordinate:");
                    allOtherSquaresLongCorners (x, y);
                } else if (x != 0 && x != 8 & y != 0 && y != 8 || x != 0 && x != 8 && y != 0 && y != 8) {//for all other squares
                    System.out.println ("Shown are all the squares that are not adjacent to the entered coordinate:");
                    allOtherSquares (x, y);
                }
             /*Idea for the replaceAll string came from
        https://stackoverflow.com/questions/4030928/extract-digits-from-a-string-in-java
         */
            }
            if (option == 2) {//this option is for 3 space 0 input with x starting from 0-8 and y from 0-8
                System.out.println ("Please enter the x and y coordinate you would like to place a ship at: ");
                String str = input.next ( );
                str = str.replaceAll ("\\D+", "");
                String[] str1 = str.split ("", 3);
                int w = input.nextInt ( );
                x = Integer.parseInt (str1[0]);
                y = w;
                System.out.println ("This is the battleship game 9X9 board which is read with (0,0) on the top left corner with numbers from 0-8");
                System.out.println ("The -1 represents the point or coordinate in which you entered:");
                grid[x][y] = -1;// marks where the "ship" goes with a -1, the rest of the grid is 0 representing a open space
                printGraphAMInt (grid);
                System.out.println ( );
                calEdges (x, y);
                System.out.println ( );
                calDiagonal (x, y);
                System.out.println ( );
                if (x == 0 && y == 0 || x == 0 && y == 8 || x == 8 && y == 0 || x == 8 && y == 8) {//for corners
                    System.out.println ("Shown are all the squares that are not adjacent to the entered coordinate:");
                    allOtherSquareCorners (x, y);
                } else if (x == 8 || y == 8 || x == 0 || y == 0) {//for long corners
                    System.out.println ("Shown are all the squares that are not adjacent to the entered coordinate:");
                    allOtherSquaresLongCorners (x, y);
                } else if (x != 0 && x != 8 & y != 0 && y != 8 || x != 0 && x != 8 && y != 0 && y != 8) {//for all other squares
                    System.out.println ("Shown are all the squares that are not adjacent to the entered coordinate:");
                    allOtherSquares (x, y);
                }
            }
            if (option == 3) {//this option is for (5,5) or 4,1 inputs again with 0-8 x and 0-8 y
                System.out.println ("Please enter the x and y coordinate you would like to place a ship at: ");
                String s = input.next ( );
                s = s.replaceAll ("\\D+", "");
                String[] str2 = s.split ("", 3);
                x = Integer.parseInt (str2[0]);
                y = Integer.parseInt (str2[1]);

                System.out.println ("This is the battleship game 9X9 board which is read with (0,0) on the top left corner with numbers from 0-8");
                System.out.println ("The -1 represents the point or coordinate in which you entered:");
                grid[x][y] = -1;// marks where the "ship" goes with a -1, the rest of the grid is 0 representing a open space
                printGraphAMInt (grid);
                System.out.println ( );
                calEdges (x, y);
                System.out.println ( );
                calDiagonal (x, y);
                System.out.println ( );
                if (x == 0 && y == 0 || x == 0 && y == 8 || x == 8 && y == 0 || x == 8 && y == 8) {//for corners
                    System.out.println ("Shown are all the squares that are not adjacent to the entered coordinate:");
                    allOtherSquareCorners (x, y);
                } else if (x == 8 || y == 8 || x == 0 || y == 0) {//for long corners
                    System.out.println ("Shown are all the squares that are not adjacent to the entered coordinate:");
                    allOtherSquaresLongCorners (x, y);
                } else if (x != 0 && x != 8 & y != 0 && y != 8 || x != 0 && x != 8 && y != 0 && y != 8) {//for all other squares
                    System.out.println ("Shown are all the squares that are not adjacent to the entered coordinate:");
                    allOtherSquares (x, y);
                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println ("You entered too many characters or spaces please read the menu and try again.");

        } catch (InputMismatchException e) {
            System.out.println ("You entered the wrong input please read the menu and try again.");
        }
    }
}