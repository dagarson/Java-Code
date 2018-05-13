#Chapter 22 Project

Closest pair of points

Section 22.8 introduces an algorithm for finding the closest pair of points using a divide-and-conquer approach.
* Step 1: Sort the points in increasing order of x-coordinates. For the points with the same x-coordinate, sort on y-coordinates. This results in a sorted list **S** of points.
* Step 2: Divide **S** into two subsets, **S1** and **S2**, of equal size using the midpoint in the sorted list. Let the midpoint be in **S1**. Recursively find the closet pair in **S1** and **S2**. Let **d1** and **d2** denote the distance of the closest pairs of the two subsets, respectively.
* Step 3: Find the closest pair between a point ins **S1** and a point in **S2** and denote their distance as **d3**. The closest pair is the one with the distance min(**d1**, **d2**, **d3**).

Implement the algorithm to meet the following requirements:

* Define the classes **Point** and **CompareY** in the same way as in programming exercise 20.4
* Define a class named **Pair** with the data fields **p1** and **p2** to represent two points, and a method named
**getDistance()** that returns the distance between the two points.
* Implement the following methods:

	```bash
	/** Return the distance of the closest pair of points */
	**public static** Pair getClosestPair(**double**[][] points)

	/** Return the distance of the closes pair of points */
	**public static** Pair getClosestPair(Point[] points)

	/** Return the distance of the closest pair of points
	  * in pointsOrderedOnX[low..high]. This is a recursive method.
	  * pointsOrderedOnX and pointsOrderedOnY are not changed in the subsequent recursive calls.
	  */
	**public static** Pair distance(Point[] pointsOrderedOnX, **int** low, **int** high, Point[] pointsOrderedOnY)

	/** Compute the distance between two points p1 and p2 */
	**public static double** distance(Point p1, Point p2)

	/** Compute the distance between points (x1, y1) and (x2, y2) */
	**public static double** distance(**double** x1, **double** y1, **double** x2, **double** y2)
	```

Tasks:
In the main routine 
* initialize a double array[1000][2] using a random number generator.
* using the divide-and-conquer algorithm show the shortest distance and the time spent with the algorithm

Submit your program you created using git.
