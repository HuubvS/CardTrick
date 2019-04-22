import java.util.Random;

public class Main {

    public static void main(String[] args)
    {

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
        System.out.println("Screen will be resetted now.");


        // need to create a timer
        // reset console window
        // check if everything works
        // ---------------------------
        // create new deck of cards
        // some ending string input
        // check if its works afterwards its done.

    }
}
