
/* Daniel Garson
 * 10/9/17
 * CIS 209
 */


import java.util.Scanner;





public class hexArea {

	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// ask the user to enter a side
		System.out.print("Enter the side: ");
		double side = input.nextDouble();
		
	
		//equation
		double Area = (6 * side * side) / (4 * Math.tan(Math.PI/6));
		
		//display the result 
		System.out.println("The are of the hexagon is " + Area);
		
		
		input.close();
		
	}

}
