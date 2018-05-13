/*Daniel Garson 
 * CIS 209
 * 10/15/17
 */




import java.util.Scanner;

public class phoneDigit {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//  enter a letter
		System.out.print("Enter a letter: ");
		String s = input.nextLine();
		
		//store letter and convert it to upper case if not already done
		char ch = s.charAt(0);
		ch = Character.toUpperCase(ch);

		// Display corresponding number
		int number = 0;
		if (Character.isLetter(ch))
		{
			//9
			if (ch >= 'W')
				number = 9;
			
			//8
			else if (ch >= 'T')
				number = 8;
			
			//7
			else if (ch >= 'P')
				number = 7;
			
			//6
			else if (ch >= 'M')
				number = 6;
			
			//5
			else if (ch >= 'J')
				number = 5;
			
			//4
			else if (ch >= 'G')
				number = 4;
			
			//3
			else if (ch >= 'D')
				number = 3;
			
			//2
			else if (ch >= 'A')
				number = 2;
			
			//display
			System.out.println("The corresponding number is " + number);
		}
		else
			
			// input a one or invalid input
			System.out.println(" invalid input: " + ch + " Please try again." );
		
		input.close();
	}
}