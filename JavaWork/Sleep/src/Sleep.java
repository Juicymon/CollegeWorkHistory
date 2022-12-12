/*
 * Joseph Steiger
 * 5/27/2020
 * 
 * 
 * This program determines if the hours of sleep the user got was adequate 
 * 
 * Psuedocode: Ask user for hours of sleep
 * 			   Assign input to hoursOfSleep
 * 			   If (hours >= 8) 
 * 					Display message
 * 			   Else if (hours > 5) 
 * 					display message
 * 			   Else 
 * 					display message
 */
import java.util.Scanner;

public class Sleep {
	public static void main(String[] args) {
		//variable declarations
		int hoursOfSleep;
		Scanner input = new Scanner(System.in);
		
		//get user input
		System.out.println("How many hours did you sleep?");
		hoursOfSleep = input.nextInt();
		
		//if else to determine how good of sleep they got based on hours
		if (hoursOfSleep >= 8) {
			System.out.println("Good! You got enough sleep.");
		}
		else if (hoursOfSleep > 5) {
			System.out.println("That's okay. You should probably get some more sleep though!");
		}
		else 
			System.out.println("You definetly need more sleep!");

	}

}
