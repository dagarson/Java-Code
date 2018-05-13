#Homework Assignment Week 3 - due 9/27/2017 7:15 p.m.
ISBN-10.

An ISBN-10 (International Standard Book Number) consists of 10 digits. The last digit is a checksum,
which is calculated from the other nine digits using the following formula:

```
(d1 x 1 + d2 x 2 + d3 x 3 + d4 x 4 + d5 x 5 + d6 x 6 + d7 x 7 + d8 x 8 + d9 x 9) % 11
```

If the checksum is 10, the last digit is denoted as X according to ISBN-10 convention.

Write a program that prompts the user to enter the first 9 digits and displays the 10-digit ISBN (including zeros).
Your program should read the input as an integer.

Here are sample runs:

```
Enter the first 9 digits of an ISBN as integer: 013601267
The ISBN-10 number is 0136012671
```

```
Enter the first 9 digits of an ISBN as integer: 013031997
The ISBN-10 number is 013031997X
```

Task #2: Run the program to make sure it works.

Task #3: Submit the homework using git.
