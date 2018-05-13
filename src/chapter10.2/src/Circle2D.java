public class Circle2D {
	
	private double x; 
	private double y; 
	private double radius;

	
	Circle2D() {
		this(0, 0, 1);
	}

	
	Circle2D(double x, double y, double r) {
		this.x = x;
		this.y = y;
		this.radius = r;
	}

	
	public double getX() {
		return x;
	}

	
	public double getY() {
		return y;
	}

	/** Return radius */
	public double getRadius() {
		return radius;
	}

	//get the area
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	//get the perimeter
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	
	//true if x,y is inside circle
	public boolean contains(double x, double y) {
		return Math.sqrt(Math.pow(x - this.x, 2) + 
				 Math.pow(y - this.y, 2)) 
				 < radius;
	}

	//true if circle is inside this circle
	public boolean contains(Circle2D circle) {
		return Math.sqrt(Math.pow(circle.getX() - x, 2) + 
				 Math.pow(circle.getY() - y, 2)) 
				 <= Math.abs(radius - circle.getRadius());
	}

	//true if circle overlaps
	public boolean overlaps(Circle2D circle) {
		return Math.sqrt(Math.pow(circle.getX() - x, 2) + 
				 Math.pow(circle.getY() - y, 2)) 
				 <= radius + circle.getRadius();
	}
}