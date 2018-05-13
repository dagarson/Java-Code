#Chapter 18 Project

String permutation

Problem description: Write a recursive method to print all the permutations of a string.
For example, for the string **abc**, the permutation is:
**abc**, **acb**, **bac**, **bca**, **cab**, **cba**

##Tasks
Define the following two methods. The second is a helper method.
* public static void displayPermutation(String s)
* public static void displayPermutation(String s1, String s2)

The first method simply invokes **displayPermutation(" ", s)**. The second method uses a loop to move a character from **s2** to **s1** and recursively invokes it with a new **s1** and **s2**. The base case is that **s2** is empty and prints **s1** to the console.

Write a test program that prompts the user to enter a string and displays all its permutations.

Submit your program you created using git.
