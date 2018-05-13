/* Daniel Garson
 * CIS 209
 * 9/25/17
 */



import java.util.Scanner;


public class Driving {

public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
   double distance, MPG, priceperGallon;
   double gallonNeeded, cost;
  
   //ask for distance
   System.out.print("Enter the driving distance:");
   distance = s.nextDouble();
  
   //ask for MPG
   System.out.print("Enter miles per gallon:");
   MPG = s.nextDouble();
   
  //ask for price per gallon
   System.out.print("Enter price per gallon:");
   priceperGallon = s.nextDouble();
  
   gallonNeeded = distance / MPG;
   cost = gallonNeeded * priceperGallon;
  
   //result
   System.out.print("The cost of driving is $" + cost);
   
	}
}
