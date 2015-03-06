package nyc.c4q.AnthonyFermin;

/**
 * Created by c4q-anthonyf on 3/5/15.
 */

import java.util.Scanner;

public class TheForgetfulMachine {

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Give me a word!");
        keyboard.next();
        System.out.println("Give me second word!");
        keyboard.next();
        System.out.println("Great, now give me your favorite number");
        keyboard.nextInt();
        System.out.println("And your second favorite number");
        keyboard.nextInt();
        System.out.println("Whew! Wasn't that fun?");

    }

}
