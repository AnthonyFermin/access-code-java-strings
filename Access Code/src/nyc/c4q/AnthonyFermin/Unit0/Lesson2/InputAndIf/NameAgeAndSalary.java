package nyc.c4q.AnthonyFermin.Unit0.Lesson2.InputAndIf;

/**
 * Access Code 2.1
 * Anthony Fermin
 * NameAgeAndSalary.java
 * Created by c4q-anthonyf on 3/5/15.
 * This class asks the user for their Name, Age and Salary
 */

import java.util.Scanner;

public class NameAgeAndSalary {

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String name;
        int age;
        double salary;

        System.out.println("Hello, what is your name?");
        name = keyboard.nextLine();
        System.out.println("Hi, " + name + "! How old are you?");
        age = keyboard.nextInt();
        System.out.println("So you're " + age + ", eh? That's not old at all! \n How much do you make, " + name + "?");
        salary = keyboard.nextDouble();
        System.out.println(salary + "! I hope that's per hour and not per year! LOL!");



    }

}
