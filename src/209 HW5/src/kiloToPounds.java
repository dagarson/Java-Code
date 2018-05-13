
/*Daniel Garson 
 * CIS 209
 * 10/22/17
 */


public class kiloToPounds{
    public static void main(String[] args){
    	
    	
    	
    	//display header 
        System.out.printf("%-10s %8.5s    |     %-8.5s %10s%n",	
            "Kilograms",
            "Pounds",
            "Pounds",
            "Kilograms");
            
        
        
        int lb = 20;
        
        //loop 
        for (int i = 1; i < 200; i += 2){
        	
        	//body of the tables
            System.out.printf("%-10d %8.1f    |     %-8d %10.2f%n", 
            i,
            i * 2.2,	//lb * 1 / 2.2
            lb,
            
            lb * 0.45359237);	//Kilo to lb (literal conversion).
            lb += 5;
        }    
    }
}