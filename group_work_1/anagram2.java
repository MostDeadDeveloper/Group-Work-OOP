import java.io.*;
import java.util.Scanner;
public class anagram2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first word: ");
		String first = scan.nextLine();
		first = first.replace(" ", "");
		System.out.println("Enter second word: ");
		String second = scan.nextLine();
		second = second.replace(" ", "");
		int x = 0;
		int l2 = second.length();
		int l1 = first.length();
		int firstcount = 0;
		int secondcount= 0;
		Boolean check = false;
		if(l1 == l2) {
		for(x = 0; x < l2; x++) {
			char z = first.charAt(x);
			int place = second.indexOf(z);
			if(place > -1) {
				for(int y = 0; y < l2; y++) {
				if(z == first.charAt(y)) {
					firstcount++;
				}
				if(z == second.charAt(y)) {
					secondcount++;
				}
				
		}
				if(firstcount == secondcount) {
					check = true;
				}
		}
		}
		}
		if(check){
			System.out.println("Output: Anagram");
		}
		else 
			System.out.println("Output: Not Anagram");
	}
}

