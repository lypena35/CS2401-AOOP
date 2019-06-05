package Exercise1;

/**
 * Created by LoriPena on 11/19/18.
 * Lorianne Pena
 * Synchronized thread
 */
class Printer
{
    public synchronized void printBalanceIncreaseSynch(int balance, int acct) {
        for (int i = 0; i < 100; i++){
            balance += 1;
            System.out.println("Current Balance ACCT# " + acct + ": " + balance);
        }
        System.out.println("\n" + "Ending Balance ACCT#" + acct + ": " + balance);
        System.out.println("-----------------------------------------------------------------------------------");
    }

    public void printBalanceIncrease(int balance, int acct) {
        for (int i = 0; i < 100; i++){
            balance += 1;
            System.out.println("Current Balance ACCT# " + acct + ": " + balance);
        }
        System.out.println("\n" + "Ending Balance ACCT#" + acct + ": " + balance);
        System.out.println("-----------------------------------------------------------------------------------");
    }
}

// Class for send a message using Threads
class PrintBalance extends Thread
{
    private int startingPnt;
    private int acct;
    Printer printer;

    // Receives a message object and a string
    // message to be sent
    PrintBalance(int start,  Printer print, int acct)
    {
        startingPnt = start;
        printer = print;
        this.acct = acct;
    }

    public void run()
    {
        // Only one thread can send a message
        // at a time.
        printer.printBalanceIncreaseSynch(startingPnt, acct);
    }
}

// Driver class
class SyncDemo
{
    public static void main(String args[])
    {
        Printer print = new Printer();
        PrintBalance t1 =
                new PrintBalance( 0, print, 1);
        PrintBalance t2 =
                new PrintBalance( 1500, print, 2);

        // Start two threads of PrintBalance type
        t1.start();
        t2.start();
    }
}