import java.util.Random;
import java.util.Scanner;

public class Main {

    static Thread thread = new Thread();
    public static void main(String[] args) throws InterruptedException
    {
        Scanner MyObj = new Scanner(System.in);
        Scanner answer = new Scanner(System.in);

        String[] suits = {"\u2663", "\u2660", "\u2665", "\u2666"};
        String [] values = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9,", "10", "Jack", "Queen", "King"};


        System.out.println("Can a pre-programmed pc predict your card?");
        System.out.println("Sounds pretty stupid doesn't it?");
        System.out.println("Why don't we test it out whether it is or not :)");

        Random suitChooser = new Random();
        Random valueChooser = new Random();


        System.out.println("4 cards are being displayed, please think of one of these cards.");
        System.out.println("-----------------------------------------------------------------");

        for (int i = 0; i < 4; i++) {
            System.out.println(suits[suitChooser.nextInt(3)]);
            System.out.println(values[valueChooser.nextInt(12)]);
            System.out.println("-----------------------------------------------------------------");
    }
        System.out.println("You have 5 seconds to remember you cards, before it reset.");


        for(int i = 5; i >= 0; i--)
        {
            thread.sleep(1000);
            System.out.println(i);
        }

        System.out.println("Do you still remember you card?");
        System.out.println("Did the pc guessed you're card correctly?");
        System.out.println("Type a 'yes' if he did Type 'no' if he didn't.");
        String user = MyObj.nextLine();


        System.out.println("result of the user: " + user);

        /////////////////////////////// final part /////////////////////////////////////


        // doesn't work
        if (answer.equals("yes"))
        {
            System.out.println("nicely done");
        }

        else
        {
            System.out.println("Can a computer look into your mind :O ");
        }

        // yes statement doesn't work.
        // reset console window
        // check if everything works
        // ---------------------------
        // create new deck of cards
        // some ending string input
        // check if its works afterwards its done.

    }
}
