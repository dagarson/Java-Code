/* Daniel Garson 
 * 10/30/17
 * CIS 209
 */



import java.util.Scanner;

public class validateCreditCard {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		//  enter CC number 
		System.out.print("Enter a credit card number as a long integer: ");
		long number = input.nextLong();
		
		//display result
									//valid or invalid
		System.out.println(number + " is " + (isCCValid(number) ? "valid" : "invalid"));						
			
		input.close();
	}

	// true if card = valid 
	public static boolean isCCValid(long num) {
		
		boolean valid =
			(size(num) >= 13 && size(num) <= 16) &&
				//Visa				//Master Card
			(prefixMatched(num, 4) || prefixMatched(num, 5) ||
				//American Express		//Discover Card
			prefixMatched(num, 37) || prefixMatched(num, 6)) &&
			((sumDouble(num) + sumOdd(num)) % 10 == 0);
		
		//return valid 
		return valid;
	}
	
	//sum double
	public static int sumDouble(long number) {
		int sum = 0;
		String num = number + "";
		for (int i = size(number) - 2; i >= 0; i -= 2) {
			sum += getDigit(Integer.parseInt(num.charAt(i) + "") * 2);
		}
		return sum;
	}
	

	
	//return if single digit or return the sum of two digits
	public static int getDigit(int number) {
		if (number < 9)
			return number;
		else
			return number / 10 + number % 10;
	}
	
	
	//sum of odd digits
	public static int sumOdd(long number) {
		int sum = 0;
		String num = number + "";
		for (int i = size(number) - 1; i >= 0; i -= 2) {
			sum += Integer.parseInt(num.charAt(i) + "");
		}
		return sum;
	}
	
	//true if n is prefix for number
	public static boolean prefixMatched(long number, int n) {
		return prefix(number, size(n)) == n;
	}
	
	
	//return number of numbers
	public static int size(long numberReturn) {
		String num = numberReturn + "";
		return num.length();
	}
	
	
	public static long prefix(long number, int n)
	{
		if (size(number) > n)  {
			String num = number + "";
			return  Long.parseLong(num.substring(0, n));
		}
		//return the number
		return number;
	}
}