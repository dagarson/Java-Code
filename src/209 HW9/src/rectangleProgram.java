public class rectangleProgram {
	
	public static void main(String[] args) {
		// rectangle width 4 and height 40
		Rectangle rectangle1 = new Rectangle(4, 40);

		// rectangle width 3.5 and height 35.9
		Rectangle rectangle2 = new Rectangle(3.5, 35.9);

		// Display rectangle #1
		System.out.println("Rectangle #1");
		System.out.println("______________________________");
		System.out.println("width:     " + rectangle1.width);
		System.out.println("height:    " + rectangle1.height);
		System.out.println("area:      " + rectangle1.area());
		System.out.println("perimeter: " + rectangle1.perimeter());

		// Display  rectangle #2
		System.out.println();
		System.out.println("Rectangle #2");
		System.out.println("______________________________");
		System.out.println("Width:     " + rectangle2.width);
		System.out.println("Height:    " + rectangle2.height);
		System.out.println("Area:      " + rectangle2.area());
		System.out.println("Perimeter: " + rectangle2.perimeter());
	}
	
	
}
