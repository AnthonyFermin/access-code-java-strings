package nyc.c4q.AnthonyFermin.Unit0.Lesson2.InputAndIf;

/**
 * Access Code 2.1
 * Anthony Fermin
 * DumbCalculator.java
 * Created by c4q-anthonyf on 3/5/15.
 * This class adds three user inputted numbers and divides them by 2 then displays the equation with the answer
 */

import java.util.Scanner;

public class DumbCalculator {

    public static void main(String[] args){

        //initializing variables
        double firstNum, secondNum, thirdNum, answer;
        Scanner input = new Scanner(System.in);

        //Requests and Stores first number
        System.out.println("What is your first number?");
        firstNum = input.nextDouble();

        //Requests and stores second number
        System.out.println("What is your second number?");
        secondNum = input.nextDouble();

        //Requests and stores third number
        System.out.println("What is your third number?");
        thirdNum = input.nextDouble();

        //adds all three numbers and divides them by 2 then stores in 'answer' variable
        answer = (firstNum + secondNum + thirdNum) / 2;

        //prints out entire equation with the answer
        System.out.println("( " +  firstNum + " + " + secondNum + " + " + thirdNum + " ) / 2 is.... " + answer);

    }

}
