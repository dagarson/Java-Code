#Chapter 11 Project

Problem Description:
(The Triangle class) Design a class named Triangle that extends GeometricObject. The class contains: 

*	Three double data fields named side1, side2 and side3 with default values 1.0 to denote the three sides of a triangle.
*	A no-arg constructor that creates a default triangle.
*	A constructor that creates a triangle with specified side1, side2 and side3.
*	The accessor methods for all three data fields.
*	A method named getArea() that returns the area of the triangle.
		
	```bash
		s = (side1 + side2 + side3)/2;
		area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
	```
*	A method named getPerimeter() that returns the perimeter of this triangle. 
*	A method named toString() that returns a string description for the triangle. The toString() method is implemented as follows:
		
	```bash
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	```
		
##Tasks
* Design: Draw the UML class diagram that involves the classes Triangle and GeometricObject.
* Code: Implement the classe
* Write a test program that creates a Triangle object with sides 1, 1.5, 1, color yellow and filled true, 
and displays the area, perimeter, color, and whether filled or not. 
* Submit the files using git

