import java.util.Scanner;

public class linearMain {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		
		
		System.out.print("Enter a, b, c, d, e, f: ");
		
		//get input for each letter
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();

		
		LinearEquation linearEquation = new LinearEquation(a, b, c, d, e, f);
		
		//result 
		if (linearEquation.notZero()) {
			System.out.println("x equals " + linearEquation.X() +
				" and y is " + linearEquation.Y());
		}
		
		//ad - bc is 0
		else
			System.out.println("The equation has no solution.");
		
	input.close();
	}
	
}