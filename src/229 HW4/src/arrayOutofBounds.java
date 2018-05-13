import java.util.Random;
import java.util.Scanner;

public class arrayOutofBounds {
	 public static void main(String[] args) {
		 	//declare array
	        int[] array = hundredArray(100);
	        
	        //user input
	        int index = input();
	        
	        try {
	            System.out.println(array[index]);
	        }
	       
	        
	        catch (ArrayIndexOutOfBoundsException e) {
	        	//over 99 
	            System.out.println("Out of Bounds");
	        }
	    }

	   
	 		 
	    public static int input() {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter the index of the array: ");
	        return input.nextInt();
	      
	         
	    }
	    
	   public static int[] hundredArray(int length) {
	        int[] num = new int[length];
	        Random randomAry = new Random();
	        for (int i = 0; i < length; i++) {
	            num[i] = randomAry.nextInt();
	        }
	        return num;
	    }
}
