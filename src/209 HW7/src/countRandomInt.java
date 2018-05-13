/* Daniel Garson
 *  11/7/17
 *  CIS 209
 */




public class countRandomInt {
 
 public static void main(String[] args) {
  int[] counts = new int[10];
  
  
  //loop for numbers 0 to 100 
  for (int i = 0; i < 100; i++) {
   counts[intRandom(0, 9)]++;
  }
   
   
  for (int i = 0; i < counts.length; i++) {
	  
	  
	  //display
   System.out.println("Number " + i + " has a count of " + counts[i] );
    
  }
 
 }
  
  
 
 public static int intRandom(int lower, int upper) {
  return (int) (lower + Math.random()
    * (upper - lower + 1));
 }
 
}