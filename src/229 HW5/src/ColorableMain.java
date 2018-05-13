public class ColorableMain {
	
	public static void main(String[] args) {
		//  five GeometricObjects
		GeometricObject[] squares = {new Square(4), new Square(10), 
			new Square(1), new Square(2), new Square(3)};

		
		for (int i = 0; i < squares.length; i++) {
		 	System.out.println("\nSquare " + (i + 1) + " Area: " + squares[i].getArea() );
		 	System.out.println("How to color: " + ((Square)squares[i]).howToColor());
		 	//give spacing
		 	System.out.println("_____________________________________");
		 } 
	}
}