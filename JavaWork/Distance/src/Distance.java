/*
 * Joseph Steiger
 * 6/4/2020
 * Version 1.0
 * 
 * This program calculates distance based on the input of 4 coordinates by the user
 * 
 * Pseudocode: Prompt user to input coordinates
 * 			   Assign value to x1, y1, x2, y2
 * 			   Calculate distance using formula - sqrt((x2-x1)^2 + (y2 - y1)^2)
 * 			   Display distance to user accurate to one decimal place
 * 
 */
import java.util.Scanner;
public class Distance {

	public static void main(String[] args) {
		//variables
		double x1, x2, y1, y2, distance;
		Scanner input = new Scanner(System.in);
		
		System.out.println("ID001"); //id
		
		//user input
		System.out.print("Enter the first X and Y coordinates (enter x1 first): ");
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		System.out.print("Enter the second X and Y coordinates (enter x2 first):");
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		
		distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)); //calculates distance using Math methods
		
		System.out.printf("\nThe distance between the coordinate points is: %.1f", distance); //displays distance to 1 decimal point
		

	}

}
