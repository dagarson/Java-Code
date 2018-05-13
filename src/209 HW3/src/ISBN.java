
/*Daniel Garson 
 * CIS 209
 * 9/26/17
 * Due: 9/27/17
 */

import java.util.Scanner;


public class ISBN {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//ask the  user to enter the first 9 digits of a 10-digit ISBN
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		int ISBN = input.nextInt();

		// First digit
		int d1 = ISBN / 100000000;
		int remainingDigits = ISBN % 100000000;
		
		// Second digit
		int d2 = remainingDigits / 10000000;
		remainingDigits %= 10000000;
		
		// Third digit
		int d3 = remainingDigits / 1000000;
		remainingDigits %= 1000000;
		
		// Fourth digit
		int d4 = remainingDigits / 100000;
		remainingDigits %= 100000;
		
		// Fifth digit
		int d5 = remainingDigits / 10000;
		remainingDigits %= 10000;
		
		// Sixth digit
		int d6 = remainingDigits / 1000;
		remainingDigits %= 1000;
		
		// Seventh digit
		int d7 = remainingDigits / 100;
		remainingDigits %= 100;
		
		// Eight digit
		int d8 = remainingDigits / 10;
		remainingDigits %= 10;
		
		// Ninth digit
		int d9 = remainingDigits;

		// Calculate for the Tenth digit
		int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 
				 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

		// Display the ten digit ISBN
		System.out.print("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 
								 + d6 + d7 + d8 + d9);
		if (d10 == 10)
			System.out.print("X");
		else
			System.out.print(d10);
		input.close();
	}
}
