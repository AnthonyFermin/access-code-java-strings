package nyc.c4q.AnthonyFermin.Unit0.Lesson2.InputAndIf;

/**
 * Anthony Fermin
 * Access Code 2.1
 * TheForgetfulMachine.java
 * Created by c4q-anthonyf on 3/5/15.
 * This program asks for a few words and numbers but does not store them!
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
