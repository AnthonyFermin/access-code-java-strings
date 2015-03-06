package nyc.c4q.AnthonyFermin;

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

        double firstNum, secondNum, thirdNum, answer;
        Scanner input = new Scanner(System.in);

        System.out.println("What is your first number?");
        firstNum = input.nextDouble();

        System.out.println("What is your second number?");
        secondNum = input.nextDouble();

        System.out.println("What is your third number?");
        thirdNum = input.nextDouble();

        answer = (firstNum + secondNum + thirdNum) / 2;

        System.out.println("( " +  firstNum + " + " + secondNum + " + " + thirdNum + " ) / 2 is.... " + answer);

    }

}
