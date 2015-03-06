package nyc.c4q.AnthonyFermin;

/**
 * Created by c4q-anthonyf on 3/5/15.
 */
import java.util.Scanner;


public class BMICalculator {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        double inches, feet, pounds, totalInches, meters, kilograms, BMI;

        System.out.print("Your height (feet only): ");
        feet = input.nextInt();

        System.out.print("Your height (inches): ");
        inches = input.nextInt();

        System.out.print("Your weight in pounds: ");
        pounds = input.nextInt();

        totalInches = (feet * 12) + inches;
        meters = (totalInches * 0.0254);
        kilograms = (2.2 * pounds);
        System.out.println();
        BMI = (kilograms / (meters * meters));

        System.out.println("Your BMI is " + BMI);


    }

}
