//Daniel Garson


public class test4Part1 {
	
	public static void main(String[] args) {
		
		double[] numbers = new double[5]; 

		
		
		for (int i = 0; i < numbers.length; i++) {
			
		}

		
		System.out.println( indexOfSmallestElement(numbers));
	}


	public static double indexOfSmallestElement(double[] array) {
		double smallest = array[0];	
		for (double i: array) {
			if (i < smallest)
				smallest = i;
		}
		return smallest;
	}
}
