import java.io.*;
import java.util.*;

/**
 * Group 3: BSCS 2-2 Object Oriented Programming
 * Members:
 *          Iñigo, Cherrieanne Lontoc L.
 *          Yusi, Ericka Mae S.
 *          Vinas, Carl John R.
*/

public class Group3_BSCS2_2Act2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String repeatCondition = "N";
        do {
            System.out.println("Enter first word: ");
            String firstWord = scan.nextLine();
            firstWord = firstWord.replaceAll("\\s","");
            System.out.println("Enter second word: ");
            String secondWord = scan.nextLine();
            secondWord = secondWord.replaceAll("\\s","");

            boolean status = true;

            if (firstWord.length() != secondWord.length()) {
                status = false;
            }
            else {
                char[] firstWordArray = firstWord.toLowerCase().toCharArray();
                char [] secondWordArray = secondWord.toLowerCase().toCharArray();

                Arrays.sort(firstWordArray);
                Arrays.sort(secondWordArray);

                status = Arrays.equals(firstWordArray, secondWordArray);
            }

            if (status) {
                System.out.println("Output: Anagram!");
            }
            else {
                System.out.println("Output: Not Anagram!");
            }

            System.out.print("Would You Like To Input Again? [y/n]: ");
            repeatCondition = scan.nextLine();
        }while(repeatCondition.equalsIgnoreCase("Y"));

    }
}

