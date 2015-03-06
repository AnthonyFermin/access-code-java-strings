package nyc.c4q.AnthonyFermin;

/**
 * Access Code 2.1
 * Anthony Fermin
 * Echo.java
 * This class prompts the user for some text and repeats it back to them
 * Created by c4q-anthonyf on 3/5/15.
 */
import java.util.Scanner;

public class Echo {

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please type a line and press enter: ");
        String something = keyboard.nextLine();
        System.out.println(something);

    }

}
