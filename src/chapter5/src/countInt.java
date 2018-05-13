/* Daniel Garson 
 * 10/17/17
 * CIS 209
 */



import java.util.Scanner;




public class countInt {

    public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);
        
        int large = 0;
        int occurrence = 0;
        int num;
        	
        //Enter numbers
        System.out.print("Enter numbers: ");
        
        
        do {
            num = input.nextInt();
            if (num > large) {
                occurrence = 0;
                large = num;
            }
            if (num == large) {
                occurrence++;
            }

        } while (num != 0);

        
        //result
        System.out.println("The largest number is " + large);
        System.out.println("The occurrence count is " + occurrence);
        
        input.close();
    }
}