/* Daniel Garson
 * 10/9/17
 * CIS 209
 */


import java.util.Scanner;






public class decimaltoHex {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//have user enter a value between zero and fifteen
		System.out.print("Enter a decimal value (0 to 15): ");
		int dec = input.nextInt();
		
		//greater than or equal to zero but less than or equal to nine
		if (dec >= 0 && dec <=9)
			System.out.println("The hex value is " + dec);
		
		// greater than or equal to ten but less then or equal to fifteen
		else if (dec >= 10 && dec <= 15)
			System.out.println("The hex value is " + (char)(dec + 'A' - 10));
		
		
		//invalid number 
		else 
			System.out.println("The number you entered is not valid");
		
		input.close();

	}

}