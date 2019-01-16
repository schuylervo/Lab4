package lab4;

import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		String userChoice;
		int userNum;
		
		do {
			
			System.out.println("Please enter an integer: ");
			userNum = scnr.nextInt();
			
			System.out.println();
			System.out.println("Table of Powers: ");
			System.out.println("========================");
			System.out.printf("%-8s %-8s %-8s\n", "Number", "Squared", "Cubed");
			System.out.printf("%-8s %-8s %-8s\n", "======", "=======", "======");
			
			for (int i = 1; i <= userNum; i++) {
				System.out.printf("%-8s %-8s %-8s\n", i, i*i, i*i*i);
				
			}
			
			System.out.println();
			System.out.println("Multiplication Table: ");
			System.out.println("============================");
			
			for (int i = 1; i <= userNum; i++) {
				if (i == 1) {
				System.out.printf("%10d",i);
				} else {
				System.out.printf("%4d",i);	
				}
			}
			System.out.println();
			System.out.println("============================");
			
			for (int i = 1; i<=userNum; i++) {
				System.out.printf("%4d |",i);
				for (int j=1; j<=userNum; j++) {
					System.out.printf("%4d", i*j);
				}
				System.out.println();
			}


		System.out.println("\n" + "Would you like to continue? (y/n): ");
		userChoice = scnr.next();
			
		} while (userChoice.equalsIgnoreCase("y")); 
		
		scnr.close();
		
		// Salutation marking official end of the program after user opts not to continue
		System.out.println("Bye!");
	}

}
