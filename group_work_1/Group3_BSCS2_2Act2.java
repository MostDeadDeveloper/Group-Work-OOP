import java.io.*;
import java.util.*;
public class Group3_BSCS2_2Act2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

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
            System.out.println("Output: Anagram");
        }
        else {
            System.out.println("Output: Not Anagram");
        }
    }
}

