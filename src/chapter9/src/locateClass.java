/* Daniel Garson
 *  CIS 209
 *  12/3/17
 */



import java.util.Scanner;



public class locateClass {
    public static void main(String[] args) {
         int row = 0;
         int column= 1;
        int[] size = arraySize();
        double[][] array = doubleArray(size[row], size[column]);
        Location locate = Location.locateLargest(array);
        
        System.out.println(locate.toString());
    }

     static int[] arraySize() {
        int[] rcSize  = new int[2];
        
        @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of rows and columns in the array: ");
        
        for (int i = 0; i < 2; i++) {
            rcSize[i] = input.nextInt();
         
        }
        return rcSize;  
    }

     static double[][] doubleArray(int row, int column) {
        double[][] RC = new double[row][column];
        
        @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the array:");
        
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                RC[r][c] = input.nextDouble();
                
            }
        }
        return RC;
    }

     static class Location {
         int row;
         int column;
         double maxValue;

        Location(int row, int column, double maxValue) {
            this.row = row;
            this.column = column;
            this.maxValue = maxValue;
        }

        static Location locateLargest(double[][] a) {
            Location location = new Location(0, 0, a[0][0]);
            for (int r = 0; r < a.length; r++) {
                for (int c = 0; c < a[r].length; c++) {
                    if (a[r][c] > location.maxValue)
                        location = new Location(r, c, a[r][c]);
                }
            }
            return location;
        }

        
        public String toString() {
            String outputResult;
            if (maxValue % 1.0 != 0)
                outputResult = String.format("%s", maxValue);
            else
                outputResult = String.format("%.0f", maxValue);
            return String.format("The location of the largest element is %s at (%d, %d)",
                    outputResult, row, column);
            
            
        }
        
    }
    
}