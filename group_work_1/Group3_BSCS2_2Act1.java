import java.util.Scanner;	//Import Scanner class
/**
 * Group 3: BSCS 2-2 Object Oriented Programming
 * Members:
 * 			Iñigo, Cherrieanne Lontoc L.
 * 			Yusi, Ericka Mae S.
 * 			Vinas, Carl John R.
 */
public class Group3_BSCS2_2Act1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	//Create a Scanner object
		float qa, labEx, ex, tp, cs, grade, cStanding;
		String ans;
		do {
			System.out.print("Quizzes/Assignments:\t");
			qa = input.nextFloat();	//Read user input for Quizzes and Assignments
			
			System.out.print("Laboratory Exercises:\t");
			labEx = input.nextFloat(); //Read user input for Laboratory Exercises
			
			System.out.print("Exams:\t\t\t");
			ex = input.nextFloat(); //Read user input for Exams
			
			System.out.print("Term Project:\t\t");
			tp = input.nextFloat(); //Read user input for Term Project
			
			System.out.print("Case Study:\t\t");
			cs = input.nextFloat(); //Read user input for Case Study
			
			//Computation of Grades
			grade = ((qa*10) + (labEx*20) + (ex*30) + (tp*30) + (cs*10));
			cStanding = grade / 100;
			
			System.out.println("Class Standing:\t\t" + cStanding);
			
			//Determine the student final grade
			if(cStanding>=92)
				System.out.println("Final Grade:\t\t1.0");
			
			if(cStanding>=88 && cStanding<=91.99)
				System.out.println("Final Grade:\t\t1.25");
			
			if(cStanding>=84 && cStanding<=87.99)
				System.out.println("Final Grade:\t\t1.5");
				
			if(cStanding>=80 && cStanding<=83.99)
				System.out.println("Final Grade:\t\t1.75");
			
			if(cStanding>=76 && cStanding<=79.99)
				System.out.println("Final Grade:\t\t2.0");
			
			if(cStanding>=72 && cStanding<=75.99)
				System.out.println("Final Grade:\t\t2.25");
			
			if(cStanding>=68 && cStanding<=71.99)
				System.out.println("Final Grade:\t\t2.5");
			
			if(cStanding>=64 && cStanding<=67.99)
				System.out.println("Final Grade:\t\t2.75");
			
			if(cStanding>=60 && cStanding<=63.99)
				System.out.println("Final Grade:\t\t3.0");
			
			if(cStanding>=50 && cStanding<=59.99)
				System.out.println("Final Grade:\t\t4.0");
			
			if(cStanding<=50)
				System.out.println("Final Grade:\t\t5.0");
			
			System.out.println("\n------------------------------------\n");
			
			System.out.println("Would you like to continue?(yes/no) ");
			ans = input.next();
			System.out.println("\n------------------------------------\n");
		}while(ans.equalsIgnoreCase("yes"));
		input.close();
		
		
	}

}
