package Pena_Lorianne_Assignment3;

import java.util.*;

/**
 * Created by LoriPena on 10/1/18.
 * Lorianne Pena
 * Assignment 3
 * CS 3331
 */

class Game {

    protected int round;

    /**
     * This method is a constructor method for the Game class.
     *
     * @param round the number of rounds the game takes.
     */
    public Game(int round) {
        this.round = round;
    }

    /**
     * This method would show the start time of the game
     */
    public void startTime() {

    }

    /**
     * This method would show the end time of the game
     */
    public void endTime() {

    }

    /**
     * This method is allows the user to select whether they want a human vs. human game or human vs. computer game.
     *
     * @param num the input from user either selects 1 for human vs. human or 2 for human vs. computer game.
     */
    public void typeOfGame(int num) {
        if (num == 1) {
            System.out.println ("its a human vs. human game");
        } else if (num == 2) {
            System.out.println ("its a human vs. computer game");
        }

    }

    /**
     * This method is to keep track of the number of rounds played in the game
     *
     * @return the number of rounds played in the game
     */

    public int listRound() {
        int count = 0;
        count++;
        return count;
    }
}

class Player {
    public static ArrayList<Player> arrayL = new ArrayList<Player> ( );

    protected String playerName;
    protected int numOfShip;
    protected int numOfTorpedo;
    protected boolean turn;

    /**
     * This method is the constructor method for the player class.
     *
     * @param playerName the name of the player
     */
    public Player(String playerName) {
        this.playerName = playerName;
    }

    /* Setters and Getters */
    public int getNumOfShip() {
        return numOfShip;
    }

    public void setNumOfShip(int numOfShip) {
        this.numOfShip = numOfShip;
    }


    public int getNumOfTorpedo() {
        return numOfTorpedo;
    }

    public void setNumOfTorpedo(int numOfTorpedo) {
        this.numOfTorpedo = numOfTorpedo;
    }

    /**
     * Method to place ships on the grid.
     *
     * @param size  of ship
     * @param value of ship (how many torpedoes need to hit it to sink it)
     * @param x     the x axis point of the ship
     * @param y     the y axis point of the ship
     */
    public void placeAShip(int size, int value, int x, int y) {

    }

    /**
     * This method is to find out who is next to take a turn in the game.
     *
     * @return true if it is a players turn and false if not. For now it is set to null.
     */
    public Boolean whoIsNext() {
        return null;
    }

    /**
     * This method is to store whom took a turn and if they hit a ship they can take a second turn
     *
     * @return true or false but for now null.
     */
    public Boolean takeTurn() {
        return null;
    }


    /**
     * This method is to add a human player object to the game.
     *
     * @param numOfHumanPlayers the user enters the number of human players they wish to add (in this case they can only add one)
     * @param name              the name the user wishes to name the human player.
     */
    public void addHumanPlayer(int numOfHumanPlayers, String name) {
        if (numOfHumanPlayers == 1) {
            while (numOfHumanPlayers == 1) {
                Player human = new Player (name);
                arrayL.add (human);
                // System.out.println (human.toString ( ));
                numOfHumanPlayers++;
            }
        } else {
            System.out.println ("I am sorry you have created to many human players, you can only have 2.");
        }

    }

    /**
     * This method is to add the computer player object to the game if the user wishes to play human vs. computer game.
     *
     * @param playerName the name of the computer player which is computer.
     */
    public void addComputerPlayer(int numOfComputer, String playerName) {
        if (numOfComputer == 1) {
            Player computer = new Player (playerName);
            arrayL.add (computer);
            numOfComputer++;
        } else {
            System.out.println ("I am sorry you have created to many computer players, you can only have 1.");
        }

    }

    /**
     * This method is to remove a human player from the game in case they want to add someone else instead or made a mistake.
     *
     * @param human is the human player object the user wishes to remove.
     */
    public void removeHumanPlayer(Player human) {
        human = null;
        arrayL.remove (human);




    }

    /**
     * This method is to remove the computer player in case the user decides to play with someone else.
     *
     * @param computer the player class type computer
     */
    public void removeComputerPlayer(Player computer) {
        computer = null;
        arrayL.remove (computer);


    }

    /**
     * This method is to print out what is inside the object and not the reference to the object
     *
     * @return the name of the player in this case
     */
    public String toString() {//to print the object it converts it
        return "Player Name: " + " " + Player.this.playerName;
    }

    /**
     * THis method is to print all the players in the game.
     */
    public void listPlayers() {
        for (int i = 0; i < arrayL.size ( ); i++) {
            System.out.println (arrayL.get (i).toString ( ));
        }

    }

}

class Human extends Player {
    /**
     * This method is the constructor method for the Human class.
     *
     * @param playerName
     */
    public Human(String playerName) {
        super (playerName);
    }
}

class Computer extends Player {
    /**
     * This method is the constructor method for the Computer class.
     *
     * @param playerName this is the name of the computer.
     */
    public Computer(String playerName) {
        super (playerName);
    }
}

class Point {
    protected int win = 2;
    protected int tie = 1;

    /**
     * This method is to add points to a winner
     *
     * @param name name of the winner
     */
    public void addPointWinner(String name) {
        System.out.println ("Congratulations: " + name);
        System.out.println (" you win two points!");
        win++;

    }

    /**
     * This method is add tied points to both players
     *
     * @param name  name of player 1
     * @param name1 name of player 2
     */
    public void addPointTie(String name, String name1) {
        System.out.println ("Congratulations: " + name + " and " + name1);
        System.out.println ("you are tied so you both win 1 point");
        tie++;
    }

    /**
     * This method is to list all the points
     */
    public void listPoint() {
        System.out.println ("total possible points you could win are: " + (win + tie));

    }

}

class Torpedo {
    public static ArrayList<Torpedo> tor = new ArrayList<Torpedo> ( );
    protected int x;
    protected int y;

    /**
     * This method is to place the torpedo on the designated place the player wants to place it.
     *
     * @param x the x axis place they want to place the torpedo.
     * @param y the y axis place they want to place the torpedo.
     */
    public void throwTorpedo(int x, int y) {

    }

    /**
     * This method is to add torpedoes to a array list to keep track of the 45 given.
     */
    public void addTorpedo() {
        Torpedo top = new Torpedo ( );
        for (int i = 0; i < 44; i++) {
            tor.add (top);
        }
    }

    /**
     * This method is to remove torpedoes for when a user uses them it takes them out of the array list.
     *
     * @param x the number of torpedoes left.
     */
    public void removeTorpedo(int x) {
        if (x <= 44) {
            for (int i = 0; i < x; i++) {
                tor.remove (i);
            }
        }
        if (x >= 45) {
            System.out.println ("I am sorry you cannot have more then 44 torpedoes so you can't remove more then 44");
        }
    }

    /**
     * This method is used to print the number of torpedoes.
     */
    public void listNumOfTorpedo() {
        System.out.println ("You have a total of 45 torpedoes");
        System.out.println ("Your current number of torpedoes are: " + tor.size ( ));
    }
}

class Ship {
    public static ArrayList<Ship> shipsArray = new ArrayList<Ship> ( );
    protected int size;
    protected int value;
    protected int x;
    protected int y;

    /**
     * This method is the constructor method for the ship class.
     *
     * @param size  the size of the ship
     * @param value how many torpedoes it takes to sink the ship
     * @param x     the x axis where the ship goes.
     * @param y     the y axis where the ship goes.
     */
    public Ship(int size, int value, int x, int y) {
        this.size = size;
        this.value = value;
        this.x = x;
        this.y = y;
    }

    /* Getters and Setters*/
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }


    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    /**
     * This method is to add a ship to a array list so we can keep track of them.
     *
     * @param size  the size of the ship
     * @param value how many torpedoes it takes to sink ship
     * @param x     the x axis of where the ship goes
     * @param y     the y axis of where the ship goes
     */
    public void addShip(int size, int value, int x, int y) {
        Ship s1 = new Ship (size, value, x, y);
        for (int i = 0; i < 5; i++) {
            shipsArray.add (s1);

        }
        if (shipsArray.size ( ) > 5) {
            System.out.println ("There are to many ships, you are only allowed 6.");
        }

    }

    /**
     * This method is to remove a ship.
     *
     * @param numRemove for now the number of ships from 0-3 we can remove.
     */
    public void removeShip(int numRemove) {
        for (int i = 0; i < numRemove; i++) {
            shipsArray.remove (i);
        }
    }

    /**
     * This method is to list all of the ships.
     */
    public void listOfShips() {
        for (int i = 0; i <= shipsArray.size ( ); i++) {
            System.out.println ("Ship number: " + i);
        }
    }
}

class Test {
    @SuppressWarnings("Duplicates")
    public static void main(String[] args) {
        try {
            Player p2 = new Human ("name");
            Player c1 = new Computer ("Computer");
            Ship ship = new Ship (4, 3, 5, 6);
            ship.addShip (4, 3, 6, 3);
            Torpedo torp = new Torpedo ( );
            torp.addTorpedo ( );
            Point point1 = new Point ( );


            System.out.println ("Hello Welcome to the Battle Ship Game");
            System.out.println ("Please Enter your name: ");
            Scanner input = new Scanner (System.in);
            String name;
            name = input.nextLine ( );
            Player p1 = new Human (name);

            String exit = "10";
            System.out.println ("Please hit enter to access the menu or type 'exit' to exit the menu:");
            while (exit.equals ("10")) {
                exit = input.nextLine ( );
                if (exit.equals ("exit")) {
                    break;
                }
                System.out.println ("Please type '1' for human vs. human, or '2' for human vs. computer. ");
                int configure;
                Scanner res = new Scanner (System.in);
                configure = res.nextInt ( );
                if (configure == 1 || configure == 2) {
                    Game newGame = new Game (1);
                    newGame.typeOfGame (configure);
                    System.out.println ("This is round: " + newGame.listRound ( ));
                } else {
                    System.out.println ("You entered the wrong number.");
                    break;
                }

                System.out.println ( );
                switch (configure) {
                    case 1:
                        System.out.println ("Type in 'add' to add a human player. ");
                        Scanner input3 = new Scanner (System.in);
                        String result1;
                        result1 = input3.nextLine ( );

                        if (result1.equals ("add") || result1.equals ("Add")) {

                            System.out.println ("How many human players would you like to add.");
                            int output;
                            output = input3.nextInt ( );
                            if (output == 1) {
                                p1.addHumanPlayer (output, p1.playerName);
                                p1.setNumOfShip (6);
                                p1.setNumOfTorpedo (45);
                                System.out.println ("Please enter second human players name.");
                                Scanner input2 = new Scanner (System.in);
                                String r;
                                r = input2.nextLine ( );
                                p2.playerName = r;
                                p2.addHumanPlayer (output, r);
                                p2.setNumOfShip (6);
                                p2.setNumOfTorpedo (45);
                                System.out.println ("Do you want to see a list of players?");
                                System.out.println ("Type 'yes' to see the list and type 'no' to continue without viewing list.");
                                String report;
                                report = input2.nextLine ( );
                                if (report.equals ("yes") || report.equals ("Yes")) {
                                    p1.listPlayers ( );
                                }
                            } else {
                                System.out.println ("I am sorry you can only enter up to 2 human players.");
                                break;
                            }

                        }
                        System.out.println ("Type 'remove' to remove a human player or 'no' to skip this step." );
                        Scanner new1= new Scanner (System.in);
                        String re;
                        re=new1.nextLine ();
                        if (re.equals ("remove")||re.equals ("Remove")) {
                            System.out.println ("Please type in '1' to remove player 1 or type '2' to remove player 2");
                            int result;
                            result = input.nextInt ( );
                            if (result == 1) {
                                p1.removeHumanPlayer (p1);
                                System.out.println (p1.toString ( ) + " has been removed.");
                                System.out.println ("Player Name: "+  p2.playerName );
                            }
                            if (result == 2) {
                                p2.removeHumanPlayer (p2);
                                System.out.println (p2.toString ( ) + " has been removed.");
                                System.out.println ( "Player Name: "+ p1.playerName);
                            }
                        }
                        System.out.println ( );
                        System.out.println ("If you would like to remove a ship please type 'yes' if not type in 'no'");
                        Scanner next = new Scanner (System.in);
                        String s;
                        s = next.nextLine ( );
                        if (s.equals ("yes")) {
                            System.out.println ("You have a total of 6 ships: you can remove up to 3 ships you can enter numbers 0-3");
                            ship.listOfShips ( );
                            Scanner scanner = new Scanner (System.in);
                            int deleteShip;
                            deleteShip = scanner.nextInt ( );
                            if (deleteShip <= 3) {
                                ship.removeShip (deleteShip);
                                ship.listOfShips ( );
                            } else if (deleteShip > 3) {
                                System.out.println ("Error: You entered a number greater then 3");
                                break;
                            }
                        }
                        System.out.println ( );
                        System.out.println ("45 Torpedoes had been loaded to each player to remove a torpedo please type yes, else type in no");
                        Scanner thisone = new Scanner (System.in);
                        String ne;
                        ne = thisone.nextLine ( );
                        if (ne.equals ("Yes") || ne.equals ("yes")) {
                            System.out.println ("How many torpedoes would you like to remove, please enter a number 0-22:");
                            int me;
                            me = thisone.nextInt ( );
                            torp.removeTorpedo (me);
                            torp.listNumOfTorpedo ( );
                            if(me>=23){
                                System.out.println ("I'm sorry you entered to large of a number." );
                                break;
                            }
                        }
                        System.out.println ( );
                        System.out.println ("Win: type '1' for player 1 and type '2' for player 2 to get win points.");
                        System.out.println ("Tie: type '4' for player 1 and player 2 tie");
                        int variable;
                        variable = thisone.nextInt ( );
                        if (variable == 1) {
                            point1.addPointWinner (p1.playerName);
                            System.out.println (p1.playerName + " has " + point1.win + " points.");
                            point1.listPoint ( );
                        } else if (variable == 2) {
                            point1.addPointWinner (p2.playerName);
                            System.out.println (p2.playerName + " has " + point1.win + " points.");
                            point1.listPoint ( );
                        } else if (variable == 4) {
                            point1.addPointTie (p1.playerName, p2.playerName);
                            System.out.println (p1.playerName + " has " + point1.tie + " points.");
                            System.out.println (p2.playerName + " has " + point1.tie + "points.");
                            point1.listPoint ( );
                        } else {
                            System.out.println ("I am sorry you entered the wrong information.");
                            break;
                        }
                        break;

                    case 2:
                        System.out.println ("Type in 'add' to add a computer player, type 'remove' to remove a computer player.");
                        String result;
                        result = input.nextLine ( );

                        if (result.equals ("add")) {
                            int re1;
                            System.out.println ("How many Computer Players would you like to add?" );
                            re1=input.nextInt ();
                            if(re1==1) {
                                c1.addComputerPlayer (1, "Computer");
                                c1.setNumOfShip (6);
                                c1.setNumOfTorpedo (45);
                                System.out.println (c1.toString ( ));
                                System.out.println (p1.playerName + " is playing against the "+ c1.playerName );
                            }else{
                                System.out.println ("I am sorry you can only have 1 Computer Player." );
                                break;
                            }

                        } else if (result.equals ("remove")) {
                            c1.removeComputerPlayer (c1);
                            System.out.println ("computer player has been removed");
                            System.out.println (c1.toString ( ));
                        }
                        System.out.println ( );
                        System.out.println ("If you would like to remove a ship please type 'yes' if not type in 'no'");
                        String s2;
                        Scanner news=new Scanner (System.in);
                        s2 = news.nextLine ( );
                        if (s2.equals ("yes") || s2.equals ("Yes")) {
                            System.out.println ("You have a total of 6 ships: you can remove up to 3 ships you can enter numbers 0-3");
                            ship.listOfShips ( );
                            Scanner scanner = new Scanner (System.in);
                            int deleteShip;
                            deleteShip = scanner.nextInt ( );
                            if (deleteShip <= 3) {
                                ship.removeShip (deleteShip);
                                ship.listOfShips ( );
                            } else if (deleteShip > 3) {
                                System.out.println ("Error: You entered a number greater then 3");
                                break;
                            }
                        }
                        System.out.println ( );
                        System.out.println ("45 Torpedoes had been loaded to each player to remove a torpedo please type yes, else type in no");
                        Scanner u = new Scanner (System.in);
                        String ne1;
                        ne1 = u.nextLine ( );
                        if (ne1.equals ("Yes") || ne1.equals ("yes")) {
                            System.out.println ("How many torpedoes would you like to remove, please enter a number from 0-22:");
                            int me;
                            me = u.nextInt ( );
                            torp.removeTorpedo (me);
                            torp.listNumOfTorpedo ( );
                            if(me>=23){
                                System.out.println ("I'm sorry you entered to large of a number." );
                                break;
                            }
                        }
                        System.out.println ( );
                        System.out.println ("Win: type '3' for computer player to get win points.");
                        System.out.println ("Tie: type '5' for computer player and player 1 to get tie points");
                        int variable1;
                        variable1 = u.nextInt ( );

                        if (variable1 == 3) {
                            point1.addPointWinner (c1.playerName);
                            System.out.println (c1.playerName + " has " + point1.win + " points.");
                            point1.listPoint ( );

                        } else if (variable1 == 5) {
                            point1.addPointTie (p1.playerName, c1.playerName);
                            System.out.println (p1.playerName + " has " + point1.tie + " points.");
                            System.out.println (c1.playerName + " has " + point1.tie + "points.");
                            point1.listPoint ( );
                        } else {
                            System.out.println ("I am sorry you entered the wrong information.");
                            break;
                        }

                        break;

                    default:
                        System.out.println ("I am sorry you entered the wrong information please try again.");
                }

            }
        } catch (InputMismatchException e) {
            System.out.println ("ERROR: input mismatch, you entered the wrong input.");

        } catch (NumberFormatException e) {
            System.out.println ("Error: you entered the wrong number format.");

        } catch (IndexOutOfBoundsException e) {
            System.out.println ("Error: Index out of bounds.");
        }


    }
}