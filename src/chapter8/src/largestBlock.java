/* Daniel Garson
 * CIS 209
 * 11/18/17
 */





import java.util.Scanner;



public class largestBlock {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        //have user for number of rows
        System.out.print("Enter the number of rows in the matrix: ");
        int rows = input.nextInt();
        
        
        int[][] matrix = new int[rows][rows];
        
        //have user for matrix row by row
        System.out.println("Enter the matrix row by row: ");
        
        for (int i = 0; i < matrix.length; i++)
            for (int m = 0; m < matrix[i].length; m++)
                matrix[i][m] = input.nextInt();

        int[] location = maxBlock(matrix);

        if (location != null) {
        	
        	//display result
            System.out.printf("The maximum square submatrix is at (%d, %d) with size %d",
                    location[0], location[1], location[2]);
            
            input.close();
        }

    }

    public static int[] maxBlock(int[][] m) {

        int[] biggestSquare = null;
        int biggestSize = 0;
        
        for (int i = 0; i < m.length; i++) {

            for (int j = 0; j < m[0].length; j++) {

                int occurrence = getOccurrence(m, i, j);
                
                // is not a square
                if (occurrence < 2) 
                	continue; 

                if (scanSquare(m, i, j, occurrence) && occurrence > biggestSize) {

                    biggestSize = occurrence;
                    biggestSquare = new int[]{i,j,occurrence};
                }
            }
        }
        return biggestSquare;
    }

    public static int getOccurrence(int[][] m, int row, int column) {

        int occurrence = 0;

        if (column == m[0].length - 1) 
        	return 0;

        for (int c = column; c < m[0].length; c++) {

            if (m[row][c] == 1) {
                occurrence++;
                if (c == m[0].length - 1) 
                	return occurrence; 

            } else if (occurrence > 1) 
            	return occurrence;

            else return 0;
        }
        return 0;
    }

    public static boolean scanSquare(int[][] m, int row, int column, int occurrence) {

    	
    	//out of rage
        if (row + occurrence > m.length) return false;

        for (int i = row; i < occurrence + row; i++) {

            for (int r = column; r < occurrence + column; r++) {
                if (m[i][r] == 0) 
                	return false;
            }
        }
        return true;
    }
}