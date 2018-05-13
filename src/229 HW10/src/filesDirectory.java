import java.io.File;
import java.util.Scanner;


public class filesDirectory {
    public static void main(String[] args) {
       
        System.out.print("Enter a directory: ");
        Scanner input = new Scanner(System.in);
        String directory = input.nextLine();

  
        System.out.println("There are "+getCount(new File(directory))+ " Files in the directory" );
        
        input.close();
    }

    public static long getCount(File directory) {
        long i = 0; 

        if (directory.isDirectory()) 
        {
        	
            File[] subfiles = directory.listFiles(); 
            for (File subfile : subfiles) {
                i += getCount(subfile); 
            }
        } else { 
            i++;
        }
        return i;
    }
}
