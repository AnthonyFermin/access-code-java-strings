package nyc.c4q.AnthonyFermin.Unit0.Lesson2.InputAndIf;

/**
 * Anthony Fermin
 * Access Code 2.1
 * BMICalculator.java
 * Created by c4q-anthonyf on 3/5/15.
 * This program asks the user for their height in feet and inches AND their weight in pounds,
 * then calculates the user's Body Mass Index and prints it to console
 */
import java.util.Scanner;


public class BMICalculator {

    public static void main(String[] args){

        //initializing variables
        Scanner input = new Scanner(System.in);
        double inches, feet, pounds, totalInches, meters, kilograms, BMI;

        //Asking user to input height (feet) and storing in feet variable
        System.out.print("Your height (feet only): ");
        feet = input.nextInt();

        //Asking user to input height (inches) and storing in inches variable
        System.out.print("Your height (inches): ");
        inches = input.nextInt();

        //Asking user to input weight in pounds and storing in pounds variable
        System.out.print("Your weight in pounds: ");
        pounds = input.nextInt();

        //converting pounds, feet and inches into meters and kilograms
        totalInches = (feet * 12) + inches;
        meters = (totalInches * 0.0254);
        kilograms = (pounds / 2.2);

        //calculating the Body Mass Index
        BMI = (kilograms / (meters * meters));

        //printing out the BMI with 4 decimals
        System.out.print("Your BMI is ");
        System.out.printf("%.4f", BMI);


    }

}
