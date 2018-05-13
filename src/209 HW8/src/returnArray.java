import java.util.Scanner;


public class returnArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        
        System.out.printf("Enter the number of rows and columns of the array: ");
        int Row = input.nextInt();
        int Column = input.nextInt();
        
        //multi array for row and column
        double[][] RC = new double[Row][Column];

        System.out.println("Enter the array below: ");
        for (int i = 0; i < Row; i++)
            for (int k = 0; k < Column; k++)
                RC[i][k] = input.nextDouble();


        int[] location = locateBiggest(RC);
        
        //output result
        System.out.printf("The location of the largest element is at (%d, %d)\n", location[0], location[1]);
        input.close();
    }

    public static int[] locateBiggest(double[][] a) {

        int[] location = new int[] { 0, 0 };
        double highest = a[0][0];
        for (int i = 0; i < a.length; i++) {

            for (int k = 0; k < a[i].length; k++) {

                if (a[i][k] > highest) {
                    location[0] = i; // row
                    location[1] = k; // column
                    highest = a[i][k];
                }

            }
        }

        return location;
    }
}