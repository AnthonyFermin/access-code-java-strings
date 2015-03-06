package nyc.c4q.AnthonyFermin;

/**
 * Created by c4q-anthonyf: Anthony Fermin on 3/4/15.
 * Twelve Days of Christmas Lyrics printed into console
 */
public class TwelveDaysOfChristmas2 {

    public static void main (String[] args){

        //Strings for parts of the song that is repeated
        String onThe = "On the ";
        String dayOf = " day of Christmas my true love sent to me ";
        String and = "\nand ";
        String comma = ", \n";

        //created an array with all twelve gifts from the song
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

        //created an array for First through Twelfth
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

        //Main loop iterates through the ith day of the song
        for(int i = 0; i < 12; i++){
            //prints first line of song
            System.out.println(onThe + day[i] + dayOf);

            //nested loop iterates from the ith gift to the first gift
            for(int j = i; j > -1; j--){
                //prints gift line
                System.out.print(gift[j]);

                //conditional that determines whether to put a comma, an and or nothing at all
                if(j > 1){
                    System.out.print(comma);
                }else if(j == 1){
                    System.out.print(and);
                }
            }

            //ends a line and skips another
            System.out.println();
            System.out.println();

        }

    }

}
