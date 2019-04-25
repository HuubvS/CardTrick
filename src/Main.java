import java.io.Console;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Runtime.*;

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
            System.out.print(suits[suitChooser.nextInt(3)]);
            System.out.println(values[valueChooser.nextInt(12)]);
            System.out.println("-----------------------------------------------------------------");
    }
        System.out.println("You have to remember one card from this combination.");
        System.out.println("If you already remembered, click enter!");
        Scanner scan = new Scanner(System.in);
        String enter = scan.nextLine();
        for(int a = 0; a<=100; a++)
            System.out.println();

//        for(int i = 5; i >= 0; i--)
//        {
//           thread.sleep(1000);
//           System.out.println(i);
//        }


        System.out.println("//////////////////////////////////////////////////////////\n" +
                "//////////////////////////////////////////////////////////\n" +
                "///////// IT IS MAGIC!!! YOUR CARD IS GONE ///////////////\n" +
                "//////////////////////////////////////////////////////////\n" +
                "//////////////////////////////////////////////////////////\n");

        System.out.println("-----------------------------------------------------------------");

        for (int i = 0; i < 3; i++) {
            System.out.println(suits[suitChooser.nextInt(3)]);
            System.out.println(values[valueChooser.nextInt(12)]);
            System.out.println("-----------------------------------------------------------------");
        }
        System.out.println("Do you still remember you're card you choose?");
        System.out.println("Type a 'yes' if he did Type 'no' if he didn't.");
        String user = MyObj.nextLine();


        System.out.println("result of the user: " + user);

        /////////////////////////////// final part /////////////////////////////////////


        if (user.equals("yes"))
        {
            System.out.println("nicely done");
        }

        else
        {
            System.out.println("Can a computer look into your mind :O ");
        }


    }
}
