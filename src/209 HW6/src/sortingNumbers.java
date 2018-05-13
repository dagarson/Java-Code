/* Daniel Garson
 *  CIS 209
 *  10/29/17
 */



import java.util.Scanner;

public class sortingNumbers {
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		// have user input numbers
		System.out.println("Enter three numbers(press enter between each number): ");
		double n1 = input.nextDouble();
		double n2 = input.nextDouble();
		double n3 = input.nextDouble();

		// returned numbers in increasing order
		displaySortedNumbers(n1, n2, n3);
		
		input.close();	//close scanner
	}

	//displaySortedNumbers method
	public static void displaySortedNumbers(double num1, double num2, double num3)
		 {
		double order; 
		
		//sorting
		if (num2 < num1 && num2 < num3){
			order = num1;
			num1 = num2;
			num2 = order;
		}
		
		//sorting
		else if (num3 < num1 && num3 < num2) {
			order= num1; 
			num1 = num3;
			num3 = order;
		}
		
		//sorting
		if (num3 < num2) {
			order = num2;
			num2 = num3;
			num3 = order;
		}
		
		
		//  results
		System.out.println("The order is: " + num1 + " , " + num2 + " , " + num3);
		
		
	}
}