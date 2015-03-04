package nyc.c4q.AnthonyFermin;

/**
 * Created by c4q-anthonyf on 3/4/15.
 */
public class TwelveDaysOfChristmas2 {

    public static void main (String[] args){

        String onThe = "On the ";
        String dayOf = " day of Christmas my true love sent to me ";
        String and = "\nand ";
        String comma = ", \n";

        String gift[] = new String[12];

        gift[0] = "a Partridge in a Pear Tree.";
        gift[1] = "Two Turtle Doves";
        gift[2] = "Three French Hens";
        gift[3] = "Four Calling Birds";
        gift[4] = "Five Gold Rings";
        gift[5] = "Six Geese a-Laying";
        gift[6] = "Seven Swans a-Swimming";
        gift[7] = "Eight Maids a-Milking";
        gift[8] = "Nine Ladies Dancing";
        gift[9] = "Ten Lords a-Leaping";
        gift[10] = "Eleven Pipers Piping";
        gift[11] = "Twelve Drummers Drumming";

        String day[] = new String[12];

        day[0] = "First";
        day[1] = "Second";
        day[2] = "Third";
        day[3] = "Fourth";
        day[4] = "Fifth";
        day[5] = "Sixth";
        day[6] = "Seventh";
        day[7] = "Eighth";
        day[8] = "Ninth";
        day[9] = "Tenth";
        day[10] = "Eleventh";
        day[11] = "Twelfth";

        for(int i = 0; i < 12; i++){
            System.out.println(onThe + day[i] + dayOf);

            for(int j = i; j > -1; j--){
                System.out.print(gift[j]);
                if(j > 1){
                    System.out.print(comma);
                }else if(j == 1){
                    System.out.print(and);
                }
            }

            System.out.println();
            System.out.println();

        }

    }

}
