/* Daniel Garson 
 * 9/19/17
 * CIS 209
 */

import java.util.Scanner;

public class Conversion {
	public static void main(String[] args) {
	
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		// get a number from the user
		System.out.print("Enter the number of minutes: ");
		int minutes = input.nextInt();

		// Convert years and days
		int years = minutes / 525600;
		int days = (minutes % 525600) / 1440;
		

		// Display result 
		System.out.println(minutes + " minutes is approximately " + years
			+ " years and " + days + " days");
	}

}
