public class Rectangle {
	double width;	
	double height;	

	// default 
	Rectangle() {
		width = 1;
		height = 1;
	} 

	
	  // specific
	Rectangle(double newWidth, double newHeight) {
		width = newWidth;
		height = newHeight;
	}

	//return area
	double area() {
		return width * height; 
	}

	//return parimeter
	double perimeter() {
		return 2 * (width + height);
	}
}