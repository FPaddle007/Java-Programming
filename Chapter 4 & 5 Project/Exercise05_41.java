/*
Project: Occurrence of Max Value 

Problem Description: 

Write a program that reads integers, finds the largest of them, and counts its occurrences. 
Assume that the input ends with number 0. Suppose that you entered 3 5 2 5 5 5 0; the 
program finds that the largest is 5 and the occurrence count for 5 is 4. (Hint: Maintain 
two variables, max and count. max stores the current max number, and count stores its 
occurrences. Initially, assign the first number to max and 1 to count. Compare each 
subsequent number with max. If the number is greater than max, assign it to max and 
reset count to 1. If the number is equal to max, increment count by 1.) 

Here are sample runs of the program: 

Sample 1: 
Enter numbers: 3 5 2 5 5 5 0 
The largest number is 5 
The occurrence count of the largest number is 4 

Sample 2: 
Enter numbers: 3 6 5 4 2 4 5 4 5 5 0 
The largest number is 6 
The occurrence count of the largest number is 1 
*/

import java.util.Scanner;

public class Exercise05_41 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user to enter a series of numbers
        System.out.print("Enter a series of numbers (end with 0): ");

        // Initialize the variables needed
        int max = input.nextInt(); // Initialize max to the first number
        int count = 0;
        int number; // Holds the current number

        // Read numbers until 0 is entered
        while (true) {
            number = input.nextInt(); // Read the next number
            if (number == 0) {
                break; // Exit the loop if the input is 0
            }

            if (number > max) {
                max = number; // Update max if the number is larger than the current max
                count = 1; // Reset the count for the new max
            } else if (number == max) {
                count++; // Increment count if the number equals the current max
            }
        }

        // Display the result
        System.out.println("The largest number is " + max);
        System.out.println("The occurrence count of the largest number is " + count);

        input.close();
    }
}