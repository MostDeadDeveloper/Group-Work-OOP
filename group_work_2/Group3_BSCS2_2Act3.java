import java.util.*;
import java.lang.*;
/**
 * Group 3: BSCS 2-2 Object Oriented Programming
 * Members:
 *          Iñigo, Cherrieanne Lontoc L.
 *          Yusi, Ericka Mae S.
 *          Vinas, Carl John R.
*/

public class Group3_BSCS2_2Act3 {
    public static void ConvertToMoney(int value) {
        int[] VALUES = {1000, 500, 100, 50, 20, 10, 5, 1};
        int increment = 0 ;

        while(value != 0) {
            int possibleVals = value / VALUES[increment];

            value = value - (possibleVals* VALUES[increment]);

            if (possibleVals > 0) {
                System.out.println(VALUES[increment] + " - " + possibleVals);
            }

            increment++;
        }
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String repeatCondition = "N";
        do {
            System.out.print("Input Amount : ");
            int input = s.nextInt();

            System.out.println("Denominations: ");
            ConvertToMoney(input);
            System.out.print("Would You Like To Input Again? [y/n]: ");
            repeatCondition = s.next();
        }while(repeatCondition.equalsIgnoreCase("Y"));
  }
}
