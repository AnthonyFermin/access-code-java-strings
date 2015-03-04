package nyc.c4q.AnthonyFermin;

/**
 * Created by c4q-anthonyf on 3/3/15.
 */
public class TwelveDaysOfChristmas {

    public static void main(String[] args) {
        //a program to write the Twelve Days of Christmas Lyrics only using variables and System.out.print
        String part1 = "On the ";
        String part2 = " day of Christmas my true love sent to me ";
        String and = "\nand ";
        String comma = ", \n";


        String first = "a Partridge in a Pear Tree.";
        String second = "Two Turtle Doves";
        String third = "Three French Hens";
        String fourth = "Four Calling Birds";
        String fifth = "Five Gold Rings";
        String sixth = "Six Geese a-Laying";
        String seventh = "Seven Swans a-Swimming";
        String eighth = "Eight Maids a-Milking";
        String ninth = "Nine Ladies Dancing";
        String tenth = "Ten Lords a-Leaping";
        String eleventh = "Eleven Pipers Piping";
        String twelfth = "Twelve Drummers Drumming";


        System.out.println(part1 + "First" + part2);
        System.out.println(first);
        System.out.println();

        System.out.println(part1 + "Second" + part2);
        System.out.println(second + and + first);
        System.out.println();

        System.out.println(part1 + "Third" + part2);
        System.out.println(third + comma + second + and + first);
        System.out.println();

        System.out.println(part1 + "Fourth" + part2);
        System.out.println(fourth + comma + third + comma + second + and + first);
        System.out.println();

        System.out.println(part1 + "Fifth" + part2);
        System.out.println(fifth + comma + fourth + comma + third + comma + second + and + first);
        System.out.println();

        System.out.println(part1 + "Sixth" + part2);
        System.out.println(sixth + comma + fifth + comma + fourth + comma + third + comma + second + and + first);
        System.out.println();

        System.out.println(part1 + "Seventh" + part2);
        System.out.println(seventh + comma + sixth + comma + fifth + comma + fourth + comma + third + comma + second + and + first);
        System.out.println();


        System.out.println(part1 + "Eighth" + part2);
        System.out.println(eighth + comma + seventh + comma + sixth + comma + fifth + comma + fourth + comma + third + comma + second + and + first);
        System.out.println();

        System.out.println(part1 + "Ninth" + part2);
        System.out.println(ninth + comma + eighth + comma + seventh + comma + sixth + comma + fifth + comma + fourth + comma + third + comma + second + and + first);
        System.out.println();

        System.out.println(part1 + "Tenth" + part2);
        System.out.println(tenth + comma + ninth + eighth + comma + seventh + comma + sixth + comma + fifth + comma + fourth + comma + third + comma + second + and + first);
        System.out.println();

        System.out.println(part1 + "Eleventh" + part2);
        System.out.println(eleventh + comma + tenth + comma + ninth + eighth + comma + seventh + comma + sixth + comma + fifth + comma + fourth + comma + third + comma + second + and + first);
        System.out.println();

        System.out.println(part1 + "Twelfth" + part2);
        System.out.println(twelfth + comma + eleventh + comma + tenth + comma + ninth + eighth + comma + seventh + comma + sixth + comma + fifth + comma + fourth + comma + third + comma + second + and + first);


    }
}
