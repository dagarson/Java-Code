/* Daniel Garson
 * CIS 209
 * 9/22/17
 */


import java.util.Scanner;

public class Finacial_compound {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		final double MONTHLY_INTEREST_RATE = 0.00417;

		// Ask  user to enter a saving amount
		System.out.print("Enter the monthly saving amount: ");
		double savingAmount = input.nextDouble();

		// first month 
		double total = 100 * (1 + MONTHLY_INTEREST_RATE);
		
		//second month
		total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);
		
		//third month
		total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);
		
		//forth month 
		total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);
		
		//fifth month 
		total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);
		
		//sixth month
		total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);

		//result
		System.out.println("After the sixth month, the account value is " + total);
	}

	
}
