/*
Project: The Triangle Class 

Problem Description: 

Design a class named Triangle that extends GeometricObject. The class contains: 

• Three double data fields named side1, side2, and side3 with default values 1.0 
to denote three sides of the triangle. 

• A no-arg constructor that creates a default triangle. 

• A constructor that creates a triangle with the specified side1, side2, and side3. 

• The accessor methods for all three data fields. 

• A method named getArea() that returns the area of this triangle. 

• A method named getPerimeter() that returns the perimeter of this triangle. 

• A method named toString() that returns a string description for the triangle. 

For the formula to compute the area of a triangle, see Exercise 5.19. The toString() 
method is implemented as follows:  

return "Triangle: side1 = " + side1 + " side2 = " + side2 + 
    " side3 = " + side3;  
 */

 import java.util.*;

public class Exercise_11_01 {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter three sides of the triangle
		System.out.print("Enter three side of the triangle: ");
		double side1 = input.nextDouble();		
		double side2 = input.nextDouble();		
		double side3 = input.nextDouble();

		// Prompt the user to enter a color
		System.out.print("Enter a color: ");
		String color = input.next();

		// Prompt the user to enter whether the triangle is filled
		System.out.print("Is the triangle filled (true / false)? ");
		boolean filled = input.nextBoolean();

		// Create triangle object with user input
		Triangle triangle = new Triangle(side1, side2, side3);
		triangle.setColor(color);
		triangle.setFilled(filled);

		System.out.println(triangle.toString());
		System.out.println("Area: " + triangle.getArea());
		System.out.println("Perimeter: " + triangle.getPerimeter());
		System.out.println("Color: " + triangle.getColor());
		System.out.println("Triangle is" + (triangle.isFilled() ? "" : " not ") 
			+ "filled");
		
			input.close();
	}
}