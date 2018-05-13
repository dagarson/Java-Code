import java.util.Scanner;

public class test4Part2 {
	

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Enter a 4 by 4 matrix by row ");
        
        
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        
       
        double[][] nxnn = new double[n1][n2];

        System.out.println("Enter the array below: ");
        for (int i = 0; i < n1; i++)
            for (int x = 0; x < n2; x++)
            	
                nxnn[i][x] = input.nextDouble();


        double[] location = sumMajorDiagonal(nxnn);
        
      
        System.out.printf("The sum of the element is ", location[0], location[16]);
        input.close();
    }

    public static double[] sumMajorDiagonal(double[][] a) {

        double[] location = new double[16];{
        	
        	location = location[0][5][10][15];
      
      
        }

        return location;
    }
}
	

}
