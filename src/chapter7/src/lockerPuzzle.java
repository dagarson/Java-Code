/*Daniel Garson 
 * CIS 209
 * 11/12/17
 */


public class lockerPuzzle {

    public static void main(String[] args){

         
    	//Open/Closed array
        boolean status[] = new boolean[101];

        for (int i = 1; i < status.length; i++){

            for (int l = i; l < status.length;l++){

                if ((l) % (i) == 0){

                    status[l] = !status[l];

                }      

            }

            

            if (status[i] == true){

            	
            	//Display result
                System.out.println("Locker L" + i + " is open.");

            }

             

        }

    }

}