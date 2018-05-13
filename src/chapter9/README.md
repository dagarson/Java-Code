# Chapter 9 project - due 12/4/2017 7:15 p.m.

Problem: Location Class

Problem Description:
Design a class named **Location** for locating a maximum value and its location in a two-dimenstional array.
The class contains public data fields **row**, **column**, and **maxValue** that store the maximum value and its indices 
in a two-dimensional array with **row** and **column** as **int** types and **maxValue** as a **double** type.

Write the following method in the class that returns the location of the largest element in the two-dimensional array:

```
public static Location locateLargest(double[][] a)
``` 
The return value is an instance of **Location**.
Write a test program that prompts the user to enter a two-dimensional array and displays the location of the largest element in the array.

Here is a sample run:

```
Enter the number of rows and columns in the array: 3 4
Enter the array:
23.5 35 2 10
4.5 3 45 3.5
35 44 5.5 9.6

The location of the largest element is 45 at (1, 2)
```

UML: Create a UML diagram for the class using PlantUML. 

Coding: Write the test program and class

Submit a PNG of the UML diagram and the program using Git.
