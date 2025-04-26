/*

Project: Computing Future Investment Value 

Problem Description: 

Write a method that computes future investment value at a given interest rate for a specified 
number of years. The future investment is determined using the following formula:  

futureInvestmentValue = 
investmentAmount x (1 + monthlyInterestRate)numberOfYears*12 

Use the following method header: 
public static double futureInvestmentValue( 
	double investmentAmount, double monthlyInterestRate, int years) 

For example, futureInvestmentValue(10000, 0.05/12, 5) returns 12833.59. 
 
Write a test program that prompts the user to enter the investment amount (e.g., 1000) and 
the interest rate (e.g., 9%) and prints a table that displays future value for the years 
from 1 to 30, as shown below: 

The amount invested: 1000 
Annual interest rate: 9% 
Years                Future Value 
   1                   1093.80 
   2                   1196.41 
   ... 
   29                  13467.25 
   30                  14730.57 

 */

 import java.util.*;

 public class Exercise06_07{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in); // create a scanner
    final int numberOfYears = 30; // number of years to display

    // Ask user to input investment amount and interest rate
    System.out.print("\nThe amount invested: ");
		double investmentAmount = input.nextDouble();
		System.out.print("Annual interest rate: ");
		double annualInterestRate = input.nextDouble();

    // Get monthly interest rate
		double monthlyInterestRate = annualInterestRate / 1200;

    // Print a table that displays future value for the years from 1 to 30
		System.out.println("Years     Future Value"); // Table header
		for (int years = 1; years <= numberOfYears; years++) {
			System.out.printf("%-10d", years);
			System.out.printf("%11.2f\n", 
				futureInvestmentValue(investmentAmount, monthlyInterestRate, years));
      
    input.close();
		}
  }
  /** Method futureInvestmentValue computes future investement value */
	public static double futureInvestmentValue(
		double investmentAmount, double monthlyInterestRate, int years) {
		return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);

	}
 }