/*
Project: Calculating Future Investment Value

Write a program that reads in investment amount, annual interest rate, and number of years, 
and displays the future investment value using the following formula:

futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)numberOfYears*12

For example, if you enter amount 1000, annual interest rate 3.25%, and number of years 1, 
the future investment value is 1032.98.

Hint: Use the Math.pow(a, b) method to compute a raised to the power of b.

Here is a sample run:

Sample 1:

Enter investment amount: 1000
Enter annual interest rate: 4.25
Enter number of years: 1
Accumulated value is 1043.34
 */

 import java.util.*;
 public class Main
 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in); // will be used to read input from the console

         // Prompt the user to input the investment amount,
         // annual interest rate, and number of years
         System.out.print("Enter investment amount: ");
         double investmentAmount = input.nextDouble();        //taking investmentAmount from user
         System.out.print("Enter annual interest rate in percentage: ");
         double monthlyInterestRate = input.nextDouble();     //taking interest rate from user
         monthlyInterestRate *= 0.01;                        //converts interest rate from percentage to decimal 
         System.out.print("Enter number of years: ");
         int numberOfYears = input.nextInt();                 //taking number of years from user
         
         //Calculating future investment value by using input taken from user
         double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate / 12, numberOfYears * 12); // calculate future investment using formula provided
         double investmentValue = (int)(futureInvestmentValue * 100) / 100.0;      //truncate the result to 2 decimal places
         
         // Display result
         System.out.println("Future value is $" + investmentValue);
         input.close();
     }
 }
