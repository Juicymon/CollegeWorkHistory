import java.util.Scanner;

/*
 * Joseph Steiger
 * 6/13/2020
 * 
 * This program finds the area of a polygon for the user
 * 
 * Psuedocode
 * 			Prompt user to input number of sides
 * 			Assign value to number of sides
 * 			Prompt user for side 
 * 			Assign double value to side
 * 			Use the area method to find area
 * 				input n and sides
 * 				calculate area using polygon area formula
 * 			display area
 */

public class AreaOfPolygon {

	public static void main(String[] args) {
		System.out.println("ID001");
		
		Scanner input = new Scanner(System.in);
		int n; 
		double side;
		
		System.out.print("Enter the number of sides: ");
		n = input.nextInt();
		System.out.print("Enter the side: ");
		side = input.nextDouble();
		
		System.out.printf("The area of the polygon is %.2f", area(n, side));

	}
	
	public static double area(int n, double side) {
		double area = (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI/n));
		
		return area;
	}

}
