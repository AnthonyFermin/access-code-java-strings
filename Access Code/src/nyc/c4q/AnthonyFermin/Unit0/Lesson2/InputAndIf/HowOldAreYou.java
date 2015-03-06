package nyc.c4q.AnthonyFermin.Unit0.Lesson2.InputAndIf;

/**
 * Anthony Fermin
 * Access Code 2.1
 * HowOldAreYou.java
 * This program asks the user for their name and age then lays down the law
 * Created by c4q-anthonyf on 3/5/15.
 */

import java.util.Scanner;

public class HowOldAreYou {

    public static void main(String[] args){

        //initializing variables and Scanner for input
        String name;
        int age;
        Scanner input = new Scanner(System.in);

        //Requests and Stores user's name
        System.out.print("Hey, what's your name? ");
        name = input.nextLine();

        //Requests and Stores user's age
        System.out.print("Ok, " + name + ", how old are you? ");
        age = input.nextInt();

        //if user's age is less than 16, it prints "You can't drive"
        if( age < 16 ){
            System.out.println("You can't drive.");
        }

        //if user's age is less than 18, then it prints "You can't vote"
        if( age < 18 ){
            System.out.println("You can't vote.");
        }
        //if user's age is less than 25 ,then it prints "You can't rent a car"
        if( age < 25 ){
            System.out.println("You can't rent a car.");
        }
        //if user's age is 25 or older, then it prints "You can do anything that's legal"
        if( age >= 25 ){
            System.out.println("You can do anything that's legal.");
        }

    }

}
